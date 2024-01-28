#Sunbase Customer Application
This project is a simple Customer Management System implemented using Spring Boot. It allows users to register new customers, view a list of available customers, edit customer details, and delete customers.

Getting Started
To run this application locally, follow these steps:

Clone the repository to your local machine:

bash
Copy code
git clone https://github.com/your-username/SunbaseCustomerApp.git
Open the project in your preferred Java IDE.

Build and run the application.

Access the application through a web browser: http://localhost:8080

Features
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
Contributing
Feel free to contribute to the project by opening issues or submitting pull requests. Your feedback and improvements are welcome!







