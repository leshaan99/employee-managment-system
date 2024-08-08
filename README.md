# Employee-Managment-System
This is a full-stack web application designed to manage employee records efficiently. The system allows users to perform various operations such as adding new employees, retrieving details of specific employees, fetching all employee records, updating employee information, and deleting employee records.

Features
Add Employee: Add new employees to the database with all necessary details.
Get Employee Details: Retrieve specific details of an individual employee.
Get All Employees: Fetch a list of all employees stored in the database.
Update Employee: Update the information of existing employees.
Delete Employee: Remove an employee from the database.
Backend
Framework: Spring Boot 3
Data Persistence: Spring Data JPA
Database: MySQL
Build Tool: Maven
Technologies Used
Spring Boot 3: A robust, easy-to-use framework for building Java applications, providing a range of functionalities and integrations.
Spring Data JPA: Simplifies the implementation of data access layers, offering an abstraction layer over the JPA.
MySQL: A popular relational database management system used to store employee data.
Maven: A build automation tool used for project management and dependency management.
Frontend
Library: React.js
Build Tool: Vite
Styling: Bootstrap CSS
Programming Language: JavaScript
Technologies Used
React.js: A powerful JavaScript library for building user interfaces, providing a reactive and component-based architecture.
Vite: A modern build tool that offers fast and optimized development and build processes for modern web projects.
Bootstrap CSS: A popular CSS framework that simplifies the design of responsive and mobile-first websites.
JavaScript: The primary programming language used to add interactivity to the frontend.
Project Setup
Backend Setup
Clone the repository.
Navigate to the backend directory.
Configure the MySQL database connection in the application.properties file.
Build the project using Maven:
bash
Copy code
mvn clean install
Run the Spring Boot application:
bash
Copy code
mvn spring-boot:run
Frontend Setup
Navigate to the frontend directory.
Install dependencies:
bash
Copy code
npm install
Start the development server:
bash
Copy code
npm run dev
Usage
Access the frontend application via the development server URL provided by Vite.
Use the interface to add, retrieve, update, and delete employee records.
The frontend communicates with the backend Spring Boot API to perform these operations.
Conclusion
This project demonstrates a complete full-stack application using modern web development technologies. It provides a solid foundation for building scalable and maintainable web applications with a clear separation between frontend and backend concerns.
