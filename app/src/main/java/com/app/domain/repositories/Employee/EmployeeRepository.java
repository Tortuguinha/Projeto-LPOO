package com.app.domain.repositories.Employee;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.app.domain.models.EmployeeModel;
import com.app.domain.repositories.interfaces.IEmployeeRepository;
import com.app.insfrastructure.database.config.DatabaseConfig;

public class EmployeeRepository implements IEmployeeRepository {
	
	private DatabaseConfig dbConfig = DatabaseConfig.getInstance();

	public void create(EmployeeModel employee) {
		
		String sql = """
                INSERT INTO employees (name, email, password, role, admission_date, status, latest_login)
                VALUES (?, ?, ?, ?, ?, ?, ?)
                """;
		
		try(Connection con = dbConfig.getConnection(); 
			PreparedStatement query = con.prepareStatement(sql)) {
			
			query.setString(1, employee.getName());
			query.setString(2, employee.getEmail());
			query.setString(3, employee.getPassword());
			query.setString(4, employee.getRole().toString());
			query.setDate(5, new java.sql.Date(employee.getAdmissionDate().getTime()));
			query.setBoolean(6, employee.getStatus());
			query.executeUpdate();
		
			
		} catch (Exception e) {
			 e.printStackTrace();
		}
		
	}

	public void update(EmployeeModel employee) {

		
	}

	public void returnAllEmployee() {

		
	}
}
