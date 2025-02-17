package com.app.application.usecases.employee;

import java.util.List;

import com.app.domain.entities.employee.EmployeeEntity;
import com.app.domain.repositories.interfaces.IEmployeeRepository;

public class ReturnEmployeesUseCase {
	private IEmployeeRepository _employeeRepository;
	
	public ReturnEmployeesUseCase(IEmployeeRepository employeeRepository) {
		this._employeeRepository = employeeRepository;
	}
	
	public List<EmployeeEntity> execute() {
		return this._employeeRepository.allEmployee();
	}
}
