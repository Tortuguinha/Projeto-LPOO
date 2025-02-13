package com.app.domain.services;

import com.app.application.usecases.employee.RegisterEmployeeUseCase;
import com.app.domain.entities.employee.EmployeeAddressEntity;
import com.app.domain.entities.employee.EmployeeContactEntity;
import com.app.domain.entities.employee.EmployeeEntity;

public class EmployeeService {
	private final RegisterEmployeeUseCase _registerEmployee;
	
	public EmployeeService(RegisterEmployeeUseCase registerEmployee) {
		this._registerEmployee = registerEmployee;
	}
	
	public void register(EmployeeEntity employee, EmployeeContactEntity contact, EmployeeAddressEntity address) {
		this._registerEmployee.execute(employee, contact, address);
	}
}
