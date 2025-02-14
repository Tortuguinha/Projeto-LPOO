package com.app.infrastructure.config;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class DatabaseConfig {
	
	private static String url;
    private static String username;
    private static String password;
	
	static {
		try (InputStream input = DatabaseConfig.class.getClassLoader().getResourceAsStream("database.properties")) {
			Properties prop = new Properties();
			
			if(input == null) {
				System.out.println("Não foi possível encontrar o caminho para database.properties");
			}
			
			prop.load(input);
			url = prop.getProperty("jdbc.url");
            username = prop.getProperty("jdbc.username");
            password = prop.getProperty("jdbc.password");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(url, username, password);
	}
}
