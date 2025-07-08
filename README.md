# Streamliner Inventory Management System

## Overview
Streamliner is a desktop-based Inventory Management System designed for resource tracking and management in organizations. Built with Java Swing and MySQL, it provides a user-friendly interface for managing products, tracking inventory inflow/outflow, handling transactions, and maintaining user accounts with robust authentication and security features.

## Features
- **User Authentication:** Secure login, registration, password change, and password recovery via email.
- **Product Management:** Add, edit, delete, and view products with details such as quantity, manufacturing date, and price.
- **Inventory Tracking:** Record and monitor product inflow and outflow transactions.
- **Transaction History:** View, search, and edit transaction records for audit and review.
- **Low Stock Alerts:** Automatic alerts for products with low quantity (less than 11 units).
- **Email Notifications:** Sends email alerts for security events (e.g., multiple failed login attempts, password recovery).
- **Role-based Access:** User roles are managed to restrict access to sensitive operations.

## Technologies Used
- **Java Swing:** For the graphical user interface.
- **MySQL:** As the backend database for storing products, users, and transactions.
- **JavaMail API:** For sending email notifications and password recovery emails.
- **JCalendar:** For date selection in forms.

## Setup Instructions
1. **Clone the Repository:**
   ```
   git clone <repository-url>
   ```
2. **Database Setup:**
   - Install MySQL and create a database named `resourceinventorymanagement`.
   - Create the required tables (e.g., `product_table`, `user_table`, `transaction_table`).
   - Update the database connection credentials in the source files if needed (default: user `root`, password `Hari2006`).
3. **Dependencies:**
   - Ensure the following JARs are included in your classpath:
     - `javax.mail.jar` (JavaMail API)
     - `jcalendar-1.4.jar` (JCalendar)
     - `mysql-connector-j-8.1.0.jar` (MySQL Connector/J)
   - These are provided in the `jcalendar-1/lib/` and `mysql-connector-j-8.1.0/` directories.
4. **Build and Run:**
   - Use your preferred Java IDE (e.g., NetBeans) or build tools (e.g., Ant with `build.xml`) to compile and run the application.

## Usage
- **Login/Register:** Start the application and log in or register a new account.
- **Product Management:** Use the sidebar to add, edit, or delete products.
- **Inventory Flow:** Record inflow or outflow of products via the Inflow/Outflow section.
- **Transactions:** View and search transaction history. Edit or delete transactions as needed.
- **Password Management:** Change your password or recover it via email if forgotten.

## Security Notes
- The application sends email alerts for suspicious activity (e.g., more than 5 failed login attempts).
- Passwords are managed securely, and recovery is handled via email.
- Update the default email and password in `Emailsend.java` and `Emailalertsend.java` for production use.

## License
This project is for educational purposes. See individual library licenses for third-party dependencies.

## Author
Developed by Harrishayyanar. 