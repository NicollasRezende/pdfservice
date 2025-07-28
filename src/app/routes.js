const express = require("express");
const path = require("path");
const fs = require("fs");
const bodyParser = require("body-parser");
const logger = require("../monitoring/logger");
const { generatePDF } = require("../browser/pdfGenerator");
const client = require("prom-client");

const router = express.Router();

router.post(
  "/pdf",
  bodyParser.json({ type: "application/json", limit: "1000mb" }),
  async (req, res) => {
    const processes = req.body;
    try {
      const promises = processes.map((process) => generatePDF(process));
      
      const processesPdfs = await Promise.all(promises);
      const response = processesPdfs.reduce((acc, processPdf) => {
        acc[processPdf.processId] = processPdf.base64;
        return acc;
      }, {});

      res.set({
        "Content-Type": "application/json",
      });
      res.send(response);
    } catch (error) {
      logger.error(`Erro ao processar requisição de PDF: ${error}`);
      res.status(500).send("Erro ao gerar PDFs");
    }
  }
);

router.get("/metrics", async (req, res) => {
  try {
    res.set("Content-Type", client.register.contentType);
    res.end(await client.register.metrics());
  } catch (ex) {
    res.status(500).end(ex);
  }
});

router.get("/*", function (req, res) {
  const href = req.originalUrl;
  const file = path.join(process.cwd(), `public/${href}`);
  if (fs.existsSync(file)) {
    res.sendFile(file);
  } else {
    res.status(404).send("Not found");
    logger.warn(`Recurso não encontrado: ${href}`);
  }
});

module.exports = router;
