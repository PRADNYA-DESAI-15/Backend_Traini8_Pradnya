# Backend_Traini8_Pradnya
# Traini8 - Training Center Registry API

## Introduction
Traini8 is a simple API that allows users to register and retrieve government-funded training centers. This project is built using Java with the Spring Boot framework.

## Features
- Register a training center with validation
- Retrieve a list of registered training centers
- Uses H2 database for storage (in-memory for easy setup)



## Prerequisites
Before running the project, ensure you have the following installed:
- Java 17 or later
- Maven
- An IDE (VS Code, Eclipse)


## Project Setup

### 1. Clone the Repository

git clone https://github.com/your-repository/traini8.git
cd traini8


### 2. Build the Project

mvn clean install


### 3. Run the Application

mvn spring-boot:run


The server will start on `http://localhost:8080`.

## API Endpoints

### 1. Register a Training Center
**Endpoint:** `POST /api/training-centers`
- Request Body (JSON):
```json
{
  "name": "ABC Training Center",
  "address": "123 Main St, City",
  "email": "contact@abctraining.com",
  "phone": "9876543210"
}
```
- Response:
```json
{
  "id": 1,
  "name": "ABC Training Center",
  "address": "123 Main St, City",
  "email": "contact@abctraining.com",
  "phone": "9876543210"
}
```

### 2. Retrieve All Training Centers
Endpoint: `GET /api/training-centers`
- **Response:**
```json
[
  {
    "id": 1,
    "name": "ABC Training Center",
    "address": "123 Main St, City",
    "email": "contact@abctraining.com",
    "phone": "9876543210"
  }
]
```



