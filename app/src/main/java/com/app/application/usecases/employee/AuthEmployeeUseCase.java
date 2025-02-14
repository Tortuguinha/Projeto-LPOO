package com.app.application.usecases.employee;

import com.app.domain.entities.employee.EmployeeEntity;
import com.app.domain.repositories.interfaces.IEmployeeRepository;

public class AuthEmployeeUseCase {
	
	private final IEmployeeRepository _employeeRepository;
	
	public AuthEmployeeUseCase(IEmployeeRepository employeeRepository) {
		this._employeeRepository = employeeRepository;
	}
	
	public EmployeeEntity execute(String email, String password) {
		EmployeeEntity employeeData = this._employeeRepository.findByEmail(email);
		
		if(employeeData == null) {
			throw new RuntimeException("Funcionário " + email + " não existe.");
		}
		
		if(!password.equals(employeeData.getPassword())) {
			throw new RuntimeException("Senha incorreta");
		}
		
		return employeeData;
	}
}
