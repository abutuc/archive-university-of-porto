FROM node:18-alpine

WORKDIR /app

RUN rm -rf node_modules package-lock.json

COPY package*.json ./

RUN npm install --legacy-peer-deps


COPY . .

EXPOSE 5173

CMD ["npm", "run", "dev"]
