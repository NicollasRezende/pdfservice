const puppeteer = require("puppeteer");
const logger = require("../monitoring/logger");

let browser;

const executablePath = process.env.PUPPETEER_EXECUTABLE_PATH;

async function initBrowser() {
  try {
    browser = await puppeteer.launch({
      headless: true,
      executablePath,
      args: [
        "--no-sandbox",
        "--disable-setuid-sandbox",
        "--disable-dev-shm-usage",
        "--remote-debugging-port=9222",
      ],
    });
    logger.info("Navegador iniciado");
    return browser;
  } catch (e) {
    logger.error(`Erro ao iniciar o navegador: ${e}`);
    return null;
  }
}

async function getBrowser() {
  if (!browser) {
    browser = await initBrowser();
  }
  return browser;
}

async function closeBrowser() {
  if (browser) {
    await browser.close();
  }
}

module.exports = {
  initBrowser,
  getBrowser,
  closeBrowser,
};
