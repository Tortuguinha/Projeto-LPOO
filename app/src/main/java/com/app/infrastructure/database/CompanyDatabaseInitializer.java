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

			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private static String createCompanyTable() {
		return """
		        CREATE TABLE IF NOT EXISTS client (
				    id INT AUTO_INCREMENT PRIMARY KEY,
				    name VARCHAR(255) NOT NULL,
				    email VARCHAR(255) NOT NULL UNIQUE,
				    cnpj CHAR(11) UNIQUE NOT NULL,
				    telephone VARCHAR(20) NOT NULL,
				    status BOOLEAN DEFAULT TRUE
				);
		    """;
    }
}
