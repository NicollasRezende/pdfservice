# Usa uma imagem base do Node.js versão 21.7.2-alpine
FROM node:21.7.2-alpine

# Define o diretório de trabalho na imagem
WORKDIR /app

# Cria um novo usuário chamado "next"
RUN adduser -D next


# Copia o arquivo package.json e package-lock.json (se presente)
COPY package*.json ./

# Instala as dependências do projeto
RUN npm install

RUN apk add --no-cache chromium

RUN apk --no-cache add msttcorefonts-installer fontconfig

RUN update-ms-fonts

RUN fc-cache -f


# Copia todo o conteúdo do diretório atual para o WORKDIR na imagem
COPY . .

# Altera as permissões da pasta /app para o usuário "next"
RUN chown -R next:next /app

# Muda para o usuário "next"
USER next

RUN npx puppeteer browsers install chrome -y

RUN npx puppeteer install

RUN npm install puppeteer

# Define a porta que a aplicação vai expor (modifique se necessário)
EXPOSE 3000

# Comando para rodar a aplicação
CMD ["npm", "start"]