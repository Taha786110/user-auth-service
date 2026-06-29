# User Authentication Service

## Project Description
A production-style RESTful authentication service built with Spring Boot and PostgreSQL. The project demonstrates secure user registration, JWT-based authentication, password hashing using BCrypt, request validation, global exception handling, and Spring Security for protecting API endpoints.

## Features
✅ User Registration

✅ User Login

✅ BCrypt Password Hashing

✅ JWT Authentication

✅ Spring Security

✅ Protected Endpoints

✅ Request Validation

✅ Global Exception Handling

✅ RESTful API Design

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
### https://user-auth-service-poyz.onrender.com/auth/register
This will be used to register a user

### https://user-auth-service-poyz.onrender.com/auth/login
This API will generate a JWT bearer token valid for next 1 hour.

### https://user-auth-service-poyz.onrender.com/user/me
This API will display details of the user on if an auth token is valid.

### You can test all these live APIs at 
https://user-auth-service-poyz.onrender.com/swagger-ui/index.html#/Authentication/login

## Getting Started
To Run this project locally, follow below steps

- git clone ...

- cd user-auth-service

- Configure Environment Variables

- mvn spring-boot:run

## Environment Variables
| Variable       | Description             |
| -------------- | ----------------------- |
| DB_URL         | PostgreSQL URL          |
| DB_USERNAME    | Database Username       |
| DB_PASSWORD    | Database Password       |
| JWT_SECRET     | Secret used to sign JWT |

## Future Improvements
- Refresh Tokens

- Docker

- CI/CD Pipeline

- Role-Based Authorization

- Unit Testing

- Integration Testing

- API Rate Limiting

### Author
Developed by Taha Zakir
