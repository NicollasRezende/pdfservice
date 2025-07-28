const express = require("express");
const logger = require("../monitoring/logger");
const { initBrowser, closeBrowser } = require("../browser/browser");
const {
  client,
  activeRequests,
  requestsReceived,
  errorsOccurred,
} = require("../monitoring/metrics");
const routes = require("./routes");

const app = express();

// Middleware para rastrear métricas
app.use((req, res, next) => {
  requestsReceived.inc();
  activeRequests.inc();
  res.on("finish", () => {
    activeRequests.dec();
  });
  next();
});

// Rotas
app.use(routes);

// Middleware de tratamento de erros
app.use((err, req, res, next) => {
  errorsOccurred.inc();
  logger.error(`Erro no servidor: ${err}`);
  res.status(500).send("Erro interno do servidor");
});

// Inicializar o navegador
initBrowser();

// Iniciar o servidor
const PORT = process.env.PORT || 3000;
app.listen(PORT, () => {
  logger.info(`Servidor iniciado em http://localhost:${PORT}`);
});

// Encerramento gracioso
process.on("SIGTERM", async () => {
  logger.info("Encerrando servidor");
  await closeBrowser();
  process.exit(0);
});

process.on("SIGINT", async () => {
  logger.info("Servidor interrompido manualmente");
  await closeBrowser();
  process.exit(0);
});
