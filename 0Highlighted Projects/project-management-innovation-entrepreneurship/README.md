## Configuration Guide

### Backend

Inside of the .env file the following variables are defined:

| variable_name   | description                                                         |
| --------------- | ------------------------------------------------------------------- |
| DATABASE_URL    | URL that points to PostgreSQL database                              |
| SMTP_SERVER     | server for the sending of email notifications                       |
| SMTP_PORT       | port for the smtp server                                            |
| SMTP_USERNAME   | email address which will send the notification emails               |
| SMTP_PASSWORD   | app password to access the email address                            |
| API_KEY{number} | key of the nif.pt API, there are many due to free usage constraints |

### Frontend

| context | variable_name     | description                                                                                                                                | location           |
| ------- | ----------------- | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------ |
| MSAL    | clientId          | ID of the frontend app registered in Azure                                                                                                 | auth/authConfig.ts |
| MSAL    | authority         | URL of the Azure authority                                                                                                                 | auth/authConfig.ts |
| MSAL    | redirectUri       | URL that should be redirected to after login                                                                                               | auth/authConfig.ts |
| -       | API_BASE_URL      | URL that points to the API service                                                                                                         | config.ts          |
| App     | ITEMS_PER_PAGE    | variable that lets to define the number of records shown in the dashboard tables                                                           | constants.ts       |
| App     | {name}\_THRESHOLD | variables that lets to define the time thresholds (in minutes) regarding when to apply local and international, lunch or dinner allowances | constants.ts       |

### Docker-compose

| variable_name     | description                                |
| ----------------- | ------------------------------------------ |
| DATABASE_URL      | URL that points to the postgreSQL database |
| POSTGRES_USER     | database user                              |
| POSTGRES_PASSWORD | database password                          |
| POSTGRES_DB       | name of database                           |

### How to run

With docker installed and running, inside of the root directory do these commands in the terminal:

```
docker-compose down -v
docker-compose build --no-cache
docker-compose up
```
