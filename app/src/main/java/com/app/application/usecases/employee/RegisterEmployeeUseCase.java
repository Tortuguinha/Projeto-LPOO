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
	    if (employee == null) {
	        throw new IllegalArgumentException("O funcionário não pode ser nulo");
	    }
	    if (contact == null) {
	        throw new IllegalArgumentException("O contato não pode ser nulo");
	    }
	    if (address == null) {
	        throw new IllegalArgumentException("O endereço não pode ser nulo");
	    }
	    this._employeeRepository.save(employee, contact, address);
	}
}
