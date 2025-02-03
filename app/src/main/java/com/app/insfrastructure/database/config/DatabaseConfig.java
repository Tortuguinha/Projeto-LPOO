package com.app.insfrastructure.database.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConfig {
	
	private static final String URL = "jdbc:mysql://172.19.209.56:3306/mydb";
	private static final String USER = "root";
	private static final String PASSWORD = "root";
	
	private static DatabaseConfig instance;
	
	private DatabaseConfig() {}
	
	public static DatabaseConfig getInstance() {
		if(instance == null) {
			instance = new DatabaseConfig();
		}
		
		return instance;
	}
	
	public Connection getConnection() throws SQLException {
		return DriverManager.getConnection(URL, USER, PASSWORD);
	}
}
