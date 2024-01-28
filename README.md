# Sunbase Customer Application
This project is a simple Customer Management System implemented using Spring Boot. It allows users to register new customers, view a list of available customers, edit customer details, and delete customers.

Getting Started
To run this application locally, follow these steps:

Clone the repository to your local machine:

bash
Copy code
git clone 
Open the project in your preferred Java IDE.

Build and run the application.

Access the application through a web browser: http://localhost:8080

# Features
1. Login
Access the login page by navigating to the root path (/).
Use the default login credentials:
Username: test@sunbasedata.com
Password: Test@123
After successful login, you will be redirected to the list of available customers.

3. Customer Registration
Navigate to /customer_register to register a new customer.
Fill in the required customer details and click "Save" to add the customer.

5. View Available Customers
Access the list of available customers by navigating to /available_customer.
The customer list includes basic information such as first name, last name, email, etc.

7. Edit Customer Details
Click on the "Edit" button next to a customer in the list to edit their details.
You will be redirected to the edit page (/editCustomer/{id}) where you can modify the customer information.

9. Delete Customer
Click on the "Delete" button next to a customer in the list to delete that customer.

10. Find Customer by ID
Access the /findById endpoint by providing the customer ID as a query parameter (/findById?custID={id}).
You will see the details of the customer with the specified ID.

# Database Specification Properties for Spring Boot Sunbase Customer Application

This repository contains the database specification properties for the Spring Boot Sunbase Customer Application. These properties are configured to connect the application to a MySQL database using Spring Data JPA.

Configuration
Database Connection Properties
The database connection properties are specified in the application.properties file. Ensure that you have the correct values for your MySQL database.


Certainly! Below is a sample README file for your GitHub repository's database specification properties:

Database Specification Properties for Spring Boot Sunbase Customer Application
This repository contains the database specification properties for the Spring Boot Sunbase Customer Application. These properties are configured to connect the application to a MySQL database using Spring Data JPA.

Configuration
Database Connection Properties
The database connection properties are specified in the application.properties file. Ensure that you have the correct values for your MySQL database.

properties
Copy code

# Database Connection Properties
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

spring.datasource.url=jdbc:mysql://localhost:3306/SpringBoot_sunbasecustomerapp?createDatabaseIfNotExist=true

spring.datasource.username=root

spring.datasource.password=123456789

spring.datasource.driver-class-name: Specifies the JDBC driver class for MySQL.

spring.datasource.url: Specifies the JDBC URL for connecting to the MySQL database.

spring.datasource.username: Specifies the MySQL database username.

spring.datasource.password: Specifies the MySQL database password.

# JPA Properties

The JPA (Java Persistence API) properties are also configured in the application.properties file. These properties define how Spring Data JPA interacts with the underlying database.

spring.jpa.show-sql: Enables the display of SQL statements in the console.

spring.jpa.hibernate.ddl-auto: Specifies the action to be taken automatically by Hibernate when the application starts. In this case, it is set to update to automatically update the database schema based on the entity classes.

spring.jpa.properties.hibernate.dialect: Specifies the Hibernate dialect for MySQL 8.

spring.jpa.properties.hibernate.format_sql: Formats the SQL statements in the console for better readability.

# Usage
To use these properties, make sure to place them in your application.properties file in your Spring Boot project. Adjust the values as needed for your specific database configuration.





Contributing
Feel free to contribute to the project by opening issues or submitting pull requests. Your feedback and improvements are welcome!







