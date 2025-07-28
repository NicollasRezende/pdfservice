const client = require("prom-client");

// Coleta de métricas padrão do Node.js
client.collectDefaultMetrics();

const requestsReceived = new client.Counter({
  name: "app_requests_received_total",
  help: "Total de requisições recebidas",
});

const pdfsGenerated = new client.Counter({
  name: "app_pdfs_generated_total",
  help: "Total de PDFs gerados",
});

const pdfGenerationDuration = new client.Histogram({
  name: "app_pdf_generation_duration_seconds",
  help: "Duração da geração de PDFs em segundos",
  buckets: [0.5, 1, 2, 5, 10],
});

const browserUsageDuration = new client.Histogram({
  name: "app_browser_usage_duration_seconds",
  help: "Duração de uso do navegador em segundos",
  buckets: [0.5, 1, 2, 5, 10],
});

const activeRequests = new client.Gauge({
  name: "app_active_requests",
  help: "Número de requisições ativas no momento",
});

const errorsOccurred = new client.Counter({
  name: "app_errors_total",
  help: "Total de erros ocorridos na aplicação",
});

const pdfSizeHistogram = new client.Histogram({
  name: "app_pdf_size_bytes",
  help: "Tamanho dos PDFs gerados em bytes",
  buckets: [100000, 500000, 1000000, 5000000],
});

module.exports = {
  client,
  requestsReceived,
  pdfsGenerated,
  pdfGenerationDuration,
  browserUsageDuration,
  activeRequests,
  errorsOccurred,
  pdfSizeHistogram,
};
