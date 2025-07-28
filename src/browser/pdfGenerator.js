const path = require("path");
const fs = require("fs");
const logger = require("../monitoring/logger");
const { getBrowser } = require("./browser");
const {
  pdfGenerationDuration,
  pdfsGenerated,
  pdfSizeHistogram,
  browserUsageDuration,
} = require("../monitoring/metrics");

async function printPDF(url, html) {
  const browser = await getBrowser();
  const endBrowserUsage = browserUsageDuration.startTimer();

  const haveLeftInfo = html.includes('<span id="isOficio">');
  let leftFooterContent = "";
  
  if (haveLeftInfo) {
    leftFooterContent = `
      <span>
          SIA Trecho 2, lote 1130 - Guará/Sia - Brasília/DF CEP: 71.200-020 Tel: 08000 617 617
      </span><br>
      <span>www.sescdf.com.br</span>`; 
  }

  const footerTemplate = `
    <table role="presentation" width="100%" cellspacing="0" cellpadding="0" border="0" style="font-size: 9pt;">
      <tr>
        <td width="16.67%"></td>
        <td width="66.67%" align="center" valign="top">
          ${leftFooterContent}
        </td>
        <td width="16.67%" align="center" valign="top">
          <span>Página <span class="pageNumber"></span> de <span class="totalPages"></span></span>
        </td>
      </tr>
    </table>`;

  const page = await browser.newPage();
  await page.goto(url, { waitUntil: "networkidle0" });
  const pdf = await page.pdf({
    format: "A4",
    printBackground: true,
    displayHeaderFooter: true,
    headerTemplate: "<div></div>",
    footerTemplate: footerTemplate,
    margin: {
      bottom: "40px",
    },
  });
  await page.close();
  endBrowserUsage();

  logger.info(`PDF gerado para URL: ${url}`);

  return pdf;
}

async function generatePDF(object) {
  const endPdfGeneration = pdfGenerationDuration.startTimer();
  
  const html = object.html;
  const processId = object.processId;
  const paddings = object.paddings || { 
    paddingTop: 2, 
    paddingRight: 1.5, 
    paddingBottom: 2, 
    paddingLeft: 3 
  };

  logger.info(`Html recebido para processo: ${processId}, html: ${html}`);

  try {
    const tempFile = `${Date.now()}${Math.random()
      .toString(36)
      .substring(7)}.html`;
    const tempDir = path.join(process.cwd(), "public/temp");
    if (!fs.existsSync(tempDir)) {
      fs.mkdirSync(tempDir, { recursive: true });
    }
    const filePath = path.join(tempDir, tempFile);
    const templateDir = path.join(process.cwd(), "template");
    const template = fs.readFileSync(
      path.join(templateDir, "template.html"),
      "utf8"
    );

    // Definindo o CSS dinâmico para as margens
    const dynamicCSS = `
      @page :first {
        margin-top: 0cm;
      }
      @page {
        margin-top: ${paddings.paddingTop}cm;
        margin-bottom: ${paddings.paddingBottom}cm;
      }

      .ck.ck-editor__editable {
        padding-top: ${paddings.paddingTop}cm;
        padding-right: ${paddings.paddingRight}cm;
        padding-bottom: ${paddings.paddingBottom}cm;
        padding-left: ${paddings.paddingLeft}cm;
      }
      `;

    const sanitizedHtml = html.replace(/&nbsp;|&#xa0;|ㅤ/g, ' ');
    const finalHtml = template
      .replaceAll("{HTML_PLACEHOLDER}", sanitizedHtml)
      .replaceAll("{CSS_PLACEHOLDER}", dynamicCSS);

    fs.writeFileSync(filePath, finalHtml);
    const htmlPath = `http://localhost:3000/temp/${tempFile}`;
    const pdf = await printPDF(htmlPath, finalHtml);
    const base64 = pdf.toString("base64");

    logger.info(`Base64 gerado para processo: ${processId}, base64: ${base64}`);

    fs.unlink(filePath, (err) => {
      if (err) {
        logger.error(`Erro ao deletar arquivo temp: ${err}`);
      }
    });

    logger.info(`PDF gerado para processo: ${processId}, html: ${finalHtml}`);

    pdfsGenerated.inc();
    pdfSizeHistogram.observe(pdf.length);
    endPdfGeneration();

    return {
      processId,
      base64,
    };
  } catch (e) {
    logger.error(`Erro ao gerar PDF para processo ${processId}: ${e}`);
    endPdfGeneration();
    throw e;
  }
}

module.exports = {
  generatePDF,
};
