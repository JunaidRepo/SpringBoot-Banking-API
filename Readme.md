# Online Banking API

## 📌 Project Overview

This project is a **RESTful Online Banking API** that allows users to create accounts, perform transactions (deposit, withdrawal), and manage balances securely. The backend is built using **Spring Boot, Hibernate, and MySQL**.

## 🚀 Technologies Used

- **Java 8+**
- **Spring Boot** (REST API Development)
- **Spring Data JPA & Hibernate** (Database Interaction)
- **MySQL** (Relational Database)
- **Maven** (Dependency Management)
- **Postman** (API Testing)
- **Git & GitHub** (Version Control)

## ⚙️ Features

- **User Account Management**: Create, update, and fetch account details.
- **Transactions**: Perform **deposit and withdrawal** operations securely.
- **Validation & Exception Handling**: Prevents invalid transactions.
- **Spring Data JPA**: Efficient database operations with Hibernate ORM.
- **RESTful APIs**: Follows best practices with `@RestController` and `@RequestMapping`.

## 📂 Project Structure

```
OnlineBankingAPI/
│-- src/main/java/com/bank
│   ├── controller/  # REST API Controllers
│   ├── service/     # Business Logic
│   ├── repository/  # Data Access Layer
│   ├── exception/   # Custom Exception Handling
│   ├── model/       # Entity Classes
│-- src/main/resources/
│   ├── application.properties  # Database Configuration
│-- pom.xml  # Maven Dependencies
```

## 🔥 API Endpoints

### **1️⃣ Account Management**

| Method | Endpoint         | Description          |
| ------ | ---------------- | -------------------- |
| `POST` | `/accounts`      | Create a new account |
| `GET`  | `/accounts/{id}` | Get account details  |

### **2️⃣ Transactions**

| Method | Endpoint                  | Description                    |
| ------ | ------------------------- | ------------------------------ |
| `PUT`  | `/deposit/{id}/{amount}`  | Deposit money into an account  |
| `PUT`  | `/withdraw/{id}/{amount}` | Withdraw money from an account |

### **3️⃣ Exception Handling**

| Exception               | HTTP Status       | Description                |
| ----------------------- | ----------------- | -------------------------- |
| `IdNotPresentException` | `404 NOT FOUND`   | Account not found          |
| `IdPresentException`    | `409 CONFLICT`    | Duplicate account ID       |
| other                   | `400 BAD REQUEST` | Invalid transaction amount |

## 🔧 Setup & Installation

### **Prerequisites**

- Install **Java 8+**
- Install **MySQL** and create a database
- Install **Maven**

### **Steps to Run**

1. **Clone the repository**
   ```sh
   git clone https://github.com/yourusername/OnlineBankingAPI.git
   cd OnlineBankingAPI
   ```
2. **Configure Database** (`src/main/resources/application.properties`)
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/bank_db
   spring.datasource.username=root
   spring.datasource.password=yourpassword
   ```
3. **Build and Run the Application**
   ```sh
   mvn spring-boot:run
   ```
4. **Test API using Postman or Browser**
   ```sh
   http://localhost:8080/accounts
   ```

## 📜 License

This project is open-source and available under the **MIT License**.

---

### 🎯 **Final Notes**

- Ensure **MySQL service** is running before launching the application.
- Use **Postman or Swagger** to test API endpoints.
- Feel free to contribute and improve the project!

🚀 **Happy Coding!** 😊

