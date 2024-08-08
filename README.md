# Employee-Managment-System

This is a full-stack web application designed to manage employee records efficiently. The system allows users to perform various operations such as adding new employees, retrieving details of specific employees, fetching all employee records, updating employee information, and deleting employee records. 

## Features

- **Add Employee**: Add new employees to the database with all necessary details.
- **Get Employee Details**: Retrieve specific details of an individual employee.
- **Get All Employees**: Fetch a list of all employees stored in the database.
- **Update Employee**: Update the information of existing employees.
- **Delete Employee**: Remove an employee from the database.

## Backend

- **Framework**: Spring Boot 3
- **Data Persistence**: Spring Data JPA
- **Database**: MySQL
- **Build Tool**: Maven

### Technologies Used

1. **Spring Boot 3**: A robust, easy-to-use framework for building Java applications, providing a range of functionalities and integrations.
2. **Spring Data JPA**: Simplifies the implementation of data access layers, offering an abstraction layer over the JPA.
3. **MySQL**: A popular relational database management system used to store employee data.
4. **Maven**: A build automation tool used for project management and dependency management.

## Frontend

- **Library**: React.js
- **Build Tool**: Vite
- **Styling**: Bootstrap CSS
- **Programming Language**: JavaScript

### Technologies Used

1. **React.js**: A powerful JavaScript library for building user interfaces, providing a reactive and component-based architecture.
2. **Vite**: A modern build tool that offers fast and optimized development and build processes for modern web projects.
3. **Bootstrap CSS**: A popular CSS framework that simplifies the design of responsive and mobile-first websites.
4. **JavaScript**: The primary programming language used to add interactivity to the frontend.

## Project Setup

### Backend Setup

1. Clone the repository.
2. Navigate to the backend directory.
3. Configure the MySQL database connection in the `application.properties` file.
4. Build the project using Maven:
    ```bash
    mvn clean install
    ```
5. Run the Spring Boot application:
    ```bash
    mvn spring-boot:run
    ```

### Frontend Setup

1. Navigate to the frontend directory.
2. Install dependencies:
    ```bash
    npm install
    ```
3. Start the development server:
    ```bash
    npm run dev
    ```

## Usage

1. Access the frontend application via the development server URL provided by Vite.
2. Use the interface to add, retrieve, update, and delete employee records.
3. The frontend communicates with the backend Spring Boot API to perform these operations.

## Conclusion

This project demonstrates a complete full-stack application using modern web development technologies. It provides a solid foundation for building scalable and maintainable web applications with a clear separation between frontend and backend concerns.
