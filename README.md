# Event Microservice

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
[![Licence](https://img.shields.io/github/license/Ileriayo/markdown-badges?style=for-the-badge)](./LICENSE)

This project is an API built using **Java, Java Spring, H2 as the database.**

## Table of Contents

- [Installation](#installation)
- [Configuration](#configuration)
- [Usage](#usage)
- [API Endpoints](#api-endpoints)
- [Database](#database)

## Installation

1. Clone the repository:

```bash
git clone https://github.com/gwenilorac/microservice-java.git
```

2. Install dependencies with Maven

3. Clone the [Email Microservice](https://github.com/gwenilorac/desafio-backend-uber) repository and follow his installation process

```bash
git clone https://github.com/gwenilorac/desafio-backend-uber.git
```

4. Adjust Email Microservice application.properties to run on port `8090`

```yaml
server.port=8090
```

5. Run both Microservices

## Usage

1. Start the application with Maven
2. The API will be accessible at http://localhost:8080

## API Endpoints
The API provides the following endpoints:

**GET EVENTS**
```markdown
GET /events - Retrieve a list of all events.
```
```json
[
  {
    "id": "ae413540-515d-4add-8cd1-1702c7d280d7",
    "maxParticipants": 20,
    "registeredParticipants": 0,
    "date": "28/11/2023",
    "title": "Frontin Floripa",
    "description": "Evento Tech em Floripa!!"
  }
]
```

**GET UPCOMING EVENTS**
```markdown
GET /events/upcoming - List all upcoming events (which the date is greather then current date).
```

```json
[
  {
    "id": "ae413540-515d-4add-8cd1-1702c7d280d7",
    "maxParticipants": 20,
    "registeredParticipants": 0,
    "date": "28/11/2023",
    "title": "Frontin Floripa",
    "description": "Evento Tech em Floripa!!"
  }
]
```

**POST EVENT**
```markdown
POST /events - Register a new event into the App
```
```json
{
	"maxParticipants": 20,
	"registeredParticipants": 0,
	"date": "28/11/2023",
	"title": "Frontin Floripa",
	"description": "Evento Tech em Floripa!!"
}
```

**POST REGISTRATION**
```markdown
POST /events/${id} - Register a user into a Event if event is not full
```

```json
{
  "participantEmail": "emailteste@gmail.com"
}
```

## Database
The project utilizes [H2 Database](https://www.h2database.com/html/tutorial.html) as the database.



