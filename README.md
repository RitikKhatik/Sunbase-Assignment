# Sunbase Customer Application

# Overview

This project is a Sunbase Customer Application implemented using Spring Boot. It provides a simple web-based interface for managing customer information. The application uses Spring Data JPA for data persistence, Thymeleaf for server-side templating, and Spring Boot for easy development and deployment.

This web application provides a simple interface for managing customer details. Users can login, view a list of customers, add new customers, and perform actions such as editing and deleting customer records and also find the customer by using customer id.

# Technologies Used
Frontend: HTML, Bootstrap 5
Backend: Spring Boot
Database: MySQL
 
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

2. Customer Registration
Navigate to /customer_register to register a new customer.
Fill in the required customer details and click "Save" to add the customer.

3. View Available Customers
Access the list of available customers by navigating to /available_customer.
The customer list includes basic information such as first name, last name, email, etc.

4. Edit Customer Details
Click on the "Edit" button next to a customer in the list to edit their details.
You will be redirected to the edit page (/editCustomer/{id}) where you can modify the customer information.

5. Delete Customer
Click on the "Delete" button next to a customer in the list to delete that customer.

6. Find Customer by ID
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

# Usage
To use these properties, make sure to place them in your application.properties file in your Spring Boot project. Adjust the values as needed for your specific database configuration.

# Project Structure
The project follows the standard Maven project structure and leverages the Spring Boot Starter Parent for managing dependencies and configuration.

The project includes the following main dependencies:

Spring Boot Starter Data JPA: Provides support for data access using Java Persistence API (JPA).

Spring Boot Starter Thymeleaf: Integrates Thymeleaf as the template engine for server-side rendering.

Spring Boot Starter Web: Includes the necessary dependencies for building a web application.

Spring Boot DevTools: Offers tools for fast application development with automatic restarts.

MySQL Connector/J: Enables the application to connect to a MySQL database.

Spring Boot Starter Test: Includes testing dependencies for unit and integration testing.



# Features

View All Customers: Navigate to All Customer to view a list of all customers.

Find Customer by ID: Use the search bar to find a specific customer by entering their ID.

Add Customer: Click Add Customer to register a new customer.

Edit Customer: Use the edit icon (
) to edit customer details.
Delete Customer: Use the delete icon (
) to delete a customer.

# How to Use
View All Customers:

Click on All Customer to see a list of all registered customers.
Find Customer by ID:

Enter the customer ID in the search bar to find a specific customer.
Add Customer:

Click Add Customer to register a new customer.
Fill in the customer details and submit the form.
Edit Customer:

Click the edit icon (
) next to a customer to edit their details.
Update the customer information and save the changes.
Delete Customer:

Click the delete icon (
) next to a customer to delete them.

Feel free to contribute to the project by opening issues or submitting pull requests. Your feedback and improvements are welcome!
