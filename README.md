📦 Amazon Order Management REST API

A Spring Boot–based RESTful web service that provides full CRUD (Create, Read, Update, Delete) operations for managing Amazon-style orders. This application demonstrates real-world backend development using Spring Boot, Spring Data JPA, and RESTful API principles.

🚀 Features

Create a new order

Fetch order by ID

Update existing order

Delete an order

RESTful API design

Layered architecture (Controller, Service, Repository)

Uses Spring Data JPA & Hibernate

MySQL database integration

🛠️ Tech Stack

Java 17

Spring Boot

Spring Web

Spring Data JPA (Hibernate)

MySQL

Maven

Eclipse IDE

📂 Project Structure
com.zepto
│
├── controller
│   └── AmazonController.java
│
├── entity
│   └── AmazonEntity.java
│
├── repository
│   └── AmazonRepository.java
│
├── request
│   └── AmazonRequest.java
│
├── service
│   └── AmazonService.java
│
└── AmazonApiApplication.java

📌 API Endpoints
1️⃣ Save Order

POST /amazon/save

Request Body:

{
  "itemName": "Laptop",
  "price": 55000,
  "qty": 1,
  "description": "Dell Inspiron"
}

2️⃣ Get Order by ID

GET /amazon/getOrder/{id}

Example:

/amazon/getOrder/1

3️⃣ Update Order

PUT /amazon/updateOrder/{id}

Request Body:

{
  "itemName": "Gaming Mouse",
  "price": 1200,
  "qty": 2,
  "description": "RGB gaming mouse"
}

4️⃣ Delete Order

DELETE /amazon/deleteOrder/{id}

Example:

/amazon/deleteOrder/1

🗄️ Database Configuration

Update application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/amazon_db
spring.datasource.username=root
spring.datasource.password=yourpassword

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.database-platform=org.hibernate.dialect.MySQL8Dialect

▶️ How to Run

Clone the repository

git clone https://github.com/your-username/amazon-api.git


Open in Eclipse

Update database details in application.properties

Run

AmazonApiApplication.java


Test APIs using Postman or browser.

🎯 Learning Outcomes

This project helps in understanding:

Spring Boot REST API development

CRUD operations using Spring Data JPA

RESTful URL design

Request handling using @RequestBody and @PathVariable

Layered architecture

📌 Author

Anurag
Java & Spring Boot Developer
