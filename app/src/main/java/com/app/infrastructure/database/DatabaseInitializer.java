package com.app.infrastructure.database;

import java.sql.Statement;
import java.sql.Connection;

import com.app.infrastructure.config.DatabaseConfig;
import com.app.infrastructure.database.interfaces.IDatabaseInitializer;

public class DatabaseInitializer implements IDatabaseInitializer {
	public void execute() {
		try (Connection connection = DatabaseConfig.getConnection()) {
			Statement query = connection.createStatement();
			
			query.execute(createEmployeeTable());
			query.execute(createContactsTable());
			query.execute(createAddressesTable());
			
			System.out.print("Sistema: Tabelas criadas com sucesso");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static String createEmployeeTable() {
		return """
		        CREATE TABLE IF NOT EXISTS employee (
				    id INT AUTO_INCREMENT PRIMARY KEY,
				    name VARCHAR(255) NOT NULL,
				    email VARCHAR(255) NOT NULL UNIQUE,
				    password VARCHAR(255) NOT NULL,
				    cpf CHAR(11) UNIQUE NOT NULL,
				    role ENUM('ADMINISTRADOR', 'ATENDENTE', 'TECNICO') DEFAULT 'ATENDENTE',
				    admission_date DATE NOT NULL,
				    status BOOLEAN DEFAULT TRUE
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
                FOREIGN KEY (user_id) REFERENCES employee(id) ON DELETE CASCADE
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
                FOREIGN KEY (user_id) REFERENCES employee(id) ON DELETE CASCADE
            );
        """;
    }
}
