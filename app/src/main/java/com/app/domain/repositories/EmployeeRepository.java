package com.app.domain.repositories;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.app.domain.entities.employee.EmployeeAddressEntity;
import com.app.domain.entities.employee.EmployeeContactEntity;
import com.app.domain.entities.employee.EmployeeEntity;
import com.app.domain.repositories.interfaces.IEmployeeRepository;
import com.app.infrastructure.config.DatabaseConfig;

public class EmployeeRepository implements IEmployeeRepository {

	public void save(EmployeeEntity employee, EmployeeContactEntity contact, EmployeeAddressEntity address) {
		String sqlEmployee = """
				INSERT INTO employee (name, email, password, cpf, role, admission_date, status)
				VALUES (?, ?, ?, ?, ?, ?, ?)
            """;
		
		String sqlContact = """
				INSERT INTO contact (user_id, telephone, email)
				VALUES (?, ?, ?)
	        """;

	    String sqlAddress = """
	    		INSERT INTO address (user_id, number, street, district, city)
	            VALUES (?, ?, ?, ?, ?)
	        """;
	    
		try (Connection connection = DatabaseConfig.getConnection()) {
			
			
			PreparedStatement queryEmployee = connection.prepareStatement(sqlEmployee, PreparedStatement.RETURN_GENERATED_KEYS);
			
			queryEmployee.setString(1, employee.getName());
			queryEmployee.setString(2, employee.getEmail());
			queryEmployee.setString(3, employee.getPassword());
			queryEmployee.setString(4, employee.getCPF());
			queryEmployee.setString(5, employee.getRole().toString());
			queryEmployee.setDate(6, new Date(employee.getAdmissionDate().getTime()));
			queryEmployee.setBoolean(7, employee.getStatus());
			queryEmployee.execute();
			
			var generetedKeys = queryEmployee.getGeneratedKeys();
			
			if(generetedKeys.next()) {
				int employeeId = generetedKeys.getInt(1);
			
	            PreparedStatement queryContact = connection.prepareStatement(sqlContact);
	            queryContact.setInt(1, employeeId);
	            queryContact.setString(2, contact.getTelephone());
	            queryContact.setString(3, contact.getEmail());
	            queryContact.executeUpdate();
	
	            PreparedStatement queryAddress = connection.prepareStatement(sqlAddress);
	            queryAddress.setInt(1, employeeId);
	            queryAddress.setInt(2, address.getNumber());
	            queryAddress.setString(3, address.getStreet());
	            queryAddress.setString(4, address.getDistrict());
	            queryAddress.setString(5, address.getCity());
	            queryAddress.executeUpdate();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public EmployeeEntity findByEmail(String email) {
		
		
		String sql = "SELECT id, name, email, password, cpf, role, admission_date, status FROM employee WHERE email = ?";
		
		try (Connection connection = DatabaseConfig.getConnection()) {
		
			PreparedStatement query = connection.prepareStatement(sql);
			query.setString(1, email);
			
			ResultSet resultSet = query.executeQuery();
			
			if(resultSet.next()) {
				int id = resultSet.getInt("id");
	            String name = resultSet.getString("name");
	            String employeeEmail = resultSet.getString("email");
	            String password = resultSet.getString("password");
	            String cpf = resultSet.getString("cpf");
	            EmployeeEntity.ROLE role = EmployeeEntity.ROLE.valueOf(resultSet.getString("role"));
	            Date admissionDate = resultSet.getDate("admission_date");
	            Boolean status = resultSet.getBoolean("status");
	            
	            EmployeeEntity employee = new EmployeeEntity(name, employeeEmail, password, cpf, role, admissionDate, status);
	            employee.setId(id);
	            
	            return employee;
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
}
