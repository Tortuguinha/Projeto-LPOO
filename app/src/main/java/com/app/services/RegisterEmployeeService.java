package com.app.services;

import com.app.domain.models.EmployeeModel;
import com.app.domain.repositories.interfaces.IEmployeeRepository;

import java.util.Date;

public class RegisterEmployeeService {
	
	private final IEmployeeRepository _employeeRepository;
	
	public RegisterEmployeeService(IEmployeeRepository employeeRepository) {
		this._employeeRepository = employeeRepository;
	}
	
	public void createEmployee(String name, String email, String password, EmployeeModel.Role role) {

		EmployeeModel newEmployee = new EmployeeModel(name, email);
		newEmployee.setPassword(password);
		newEmployee.setRole(role);
		newEmployee.setAdmissionDate(new Date());
		newEmployee.setStatus(true);
		newEmployee.setLatestLogin(null);

		this._employeeRepository.create(newEmployee);
	}
}
