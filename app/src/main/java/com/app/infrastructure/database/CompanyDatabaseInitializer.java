package com.app.infrastructure.database;

import java.sql.Statement;
import java.sql.Connection;

import com.app.infrastructure.config.DatabaseConfig;
import com.app.infrastructure.database.interfaces.IDatabaseInitializer;

public class CompanyDatabaseInitializer implements IDatabaseInitializer {
	public void execute() {
		try (Connection connection = DatabaseConfig.getConnection()) {
			Statement query = connection.createStatement();
			
			query.execute(createCompanyTable());
			query.execute(createContactsTable());
			query.execute(createAddressesTable());
			query.execute(createServiceOrderTable());

			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private static String createCompanyTable() {
		return """
		        CREATE TABLE IF NOT EXISTS company (
				    id INT AUTO_INCREMENT PRIMARY KEY,
				    name VARCHAR(255) NOT NULL,
				    email VARCHAR(255) NOT NULL UNIQUE,
				    cnpj CHAR(14) UNIQUE NOT NULL,
				    status BOOLEAN DEFAULT TRUE,
				    createdAt DATE NOT NULL
				);
		    """;
	}

    private static String createContactsTable() {
    	return """
                CREATE TABLE IF NOT EXISTS contact (
                    id INT AUTO_INCREMENT PRIMARY KEY,
                    user_id INT NOT NULL,
                    telephone VARCHAR(20) NOT NULL,
                    email VARCHAR(255) NOT NULL UNIQUE,
                    FOREIGN KEY (user_id) REFERENCES company(id) ON DELETE CASCADE
                );
            """;
    }

    private static String createAddressesTable() {
    	return """
                CREATE TABLE IF NOT EXISTS address (
                    address_id INT AUTO_INCREMENT PRIMARY KEY,
                    user_id INT NOT NULL,
                    number INT NOT NULL,
                    street VARCHAR(255) NOT NULL,
                    district VARCHAR(255) NOT NULL,
                    city VARCHAR(255) NOT NULL,
                    FOREIGN KEY (user_id) REFERENCES company(id) ON DELETE CASCADE
                );
            """;
    }
    
    private static String createServiceOrderTable() {
        return """
            CREATE TABLE IF NOT EXISTS service_order (
                id INT AUTO_INCREMENT PRIMARY KEY,
                document_id CHAR(14) NOT NULL,
                budget_code VARCHAR(50) NOT NULL,
                equip_desc VARCHAR(255) NOT NULL,
                model VARCHAR(100) NOT NULL,
                serial_num VARCHAR(100) NOT NULL,
                details TEXT NOT NULL,
                problems TEXT NOT NULL,
                urgency_level VARCHAR(50) NOT NULL,
                delivery_date DATETIME NOT NULL,
                created_at DATETIME DEFAULT CURRENT_TIMESTAMP,
                tech_response TEXT,
                final_cost DECIMAL(10,2) NOT NULL,
                payment_form VARCHAR(100) NOT NULL,
                FOREIGN KEY (document_id) REFERENCES client(cnpj) ON DELETE CASCADE
            );
        """;
    }
}
