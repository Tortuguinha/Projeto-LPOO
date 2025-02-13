package com.app.application.usecases.employee;

import com.app.domain.entities.employee.EmployeeAddressEntity;
import com.app.domain.entities.employee.EmployeeContactEntity;
import com.app.domain.entities.employee.EmployeeEntity;
import com.app.domain.repositories.interfaces.IEmployeeRepository;

public class RegisterEmployeeUseCase {
	
	private final IEmployeeRepository _employeeRepository;
	
	public RegisterEmployeeUseCase(IEmployeeRepository employeeRepository) {
		this._employeeRepository = employeeRepository;
	}
	
	public void execute(EmployeeEntity employee, EmployeeContactEntity contact, EmployeeAddressEntity address) {
		this._employeeRepository.save(employee, contact, address);
	}
}
