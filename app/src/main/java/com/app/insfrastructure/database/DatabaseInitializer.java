package com.app.insfrastructure.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.app.insfrastructure.database.config.DatabaseConfig;

public class DatabaseInitializer {
	
	private DatabaseConfig dbConfig = DatabaseConfig.getInstance();
	
	public  void initialize() {
		
		try (Connection connection = dbConfig.getConnection()) {
			Statement query = connection.createStatement();
			
			query.execute(createEmployeeTable());
			query.execute(createContactsTable());
			query.execute(createAddressesTable());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static String createEmployeeTable() {
	    return """
	        CREATE TABLE IF NOT EXISTS employee (
	            id INT AUTO_INCREMENT PRIMARY KEY,
	            name VARCHAR(255) NOT NULL,
	            cpf CHAR(11) UNIQUE NOT NULL CHECK (cpf REGEXP '^[0-9]{11}$'), 
	            password VARCHAR(255) NOT NULL,
	            role ENUM('ADMIN', 'EMPLOYEE') DEFAULT 'EMPLOYEE',
	            admission_date DATE NOT NULL,
	            status BOOLEAN DEFAULT TRUE,
	            latest_login DATETIME NULL
	        );
	    """;
	}

    private static String createContactsTable() {
        return """
            CREATE TABLE IF NOT EXISTS contacts (
                id INT AUTO_INCREMENT PRIMARY KEY,
                user_id INT NOT NULL,
                telephone VARCHAR(20) NOT NULL CHECK (LENGTH(telephone) BETWEEN 10 AND 15),
                email VARCHAR(255) NOT NULL,
                FOREIGN KEY (user_id) REFERENCES employee(id) ON DELETE CASCADE
            );
        """;
    }

    private static String createAddressesTable() {
        return """
            CREATE TABLE IF NOT EXISTS addresses (
                address_id INT AUTO_INCREMENT PRIMARY KEY,
                user_id INT NOT NULL,
                number INT NOT NULL CHECK (number > 0),
                street VARCHAR(255) NOT NULL,
                district VARCHAR(255) NOT NULL,
                city VARCHAR(255) NOT NULL,
                FOREIGN KEY (user_id) REFERENCES employee(id) ON DELETE CASCADE
            );
        """;
    }
	
}
