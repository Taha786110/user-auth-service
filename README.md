# User Authentication Service

![Java](https://img.shields.io/badge/Java-21-orange)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-4.x-brightgreen)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-17-blue)
![JWT](https://img.shields.io/badge/Auth-JWT-yellow)
![Docker](https://img.shields.io/badge/Docker-Containerized-blue)

## Live Demo

🌐 API Base URL

https://user-auth-service-poyz.onrender.com

📖 Swagger Documentation

https://user-auth-service-poyz.onrender.com/swagger-ui/index.html

## Project Description
A production-style RESTful authentication service built with Spring Boot, PostgreSQL, Docker, and JWT.

The project demonstrates secure authentication using BCrypt password hashing, stateless JWT authorization, Spring Security, request validation, global exception handling, and interactive API documentation with Swagger/OpenAPI.

## Features
- User Registration
- User Login
- BCrypt Password Hashing
- JWT Authentication
- Spring Security
- Protected REST Endpoints
- Request Validation
- Global Exception Handling
- Swagger/OpenAPI Documentation
- Dockerized Deployment

## Tech Stack
| Technology      | Purpose                        |
| --------------- | ------------------------------ |
| Java 21         | Programming Language           |
| Spring Boot     | Backend Framework              |
| Spring Security | Authentication & Authorization |
| PostgreSQL      | Database                       |
| Spring Data JPA | ORM                            |
| JWT             | Stateless Authentication       |
| Maven           | Dependency Management          |

## Skills Demonstrated
- REST API Development
- Spring Boot
- Spring Security
- JWT Authentication
- Layered Architecture
- Data Validation
- Exception Handling
- Docker
- PostgreSQL
- API Documentation (Swagger/OpenAPI)
- Cloud Deployment

## Project Structure
### src
-> config

-> controller

-> dto

-> entity

-> exception

-> repository

-> security

-> service

## API Endpoints
| Method | Endpoint         | Description                           |
| ------ | ---------------- | ------------------------------------- |
| POST   | `/auth/register` | Register a new user                   |
| POST   | `/auth/login`    | Authenticate user and receive JWT     |
| GET    | `/user/me`       | Retrieve authenticated user's profile |

### Interactive API Documentation

https://user-auth-service-poyz.onrender.com/swagger-ui/index.html

## Getting Started
To Run this project locally, follow below steps

git clone https://github.com/tahazakir110/user-auth-service.git

cd user-auth-service

mvn spring-boot:run

## Environment Variables
| Variable       | Description             |
| -------------- | ----------------------- |
| DB_URL         | PostgreSQL URL          |
| DB_USERNAME    | Database Username       |
| DB_PASSWORD    | Database Password       |
| JWT_SECRET     | Secret used to sign JWT |

## Future Improvements
- Refresh Tokens
- CI/CD Pipeline
- Role-Based Authorization
- Unit Testing
- Integration Testing
- API Rate Limiting

## License
This project is licensed under the MIT License.

### Author
Developed by Taha Zakir
