FROM node:18-alpine

WORKDIR /redux-intro

COPY package.json /redux-intro/
COPY package-lock.json /redux-intro/
COPY src /redux-intro/src
COPY public /redux-intro/public

RUN npm install --legacy-peer-deps

CMD ["npm", "start"]
