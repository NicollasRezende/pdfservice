# Serviço em NODE para transformar HTML em PDF

## Como usar

 - Necessário Node v21.7.2 + Chromium

- Na raiz do projeto, instale as dependências NPM:
```npm install```

- Variável de ambiente obrigatorias: PUPPETEER_EXECUTABLE_PATH
```PUPPETEER_EXECUTABLE_PATH=/path/to/chromium```

- Execute o servidor node com o comando
```npm run start```

- Envie um html para o webservice:

```bash
curl --location 'http://localhost:3000/pdf' \
--header 'Content-Type: application/json' \
--data '[{
    "processId": 1,
    "html": "<p style=\"line-height:0;\">TESTE</p>"
  }]'
```