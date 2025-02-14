package com.app.domain.services;

import com.app.application.usecases.employee.AuthEmployeeUseCase;
import com.app.application.usecases.employee.RegisterEmployeeUseCase;
import com.app.domain.entities.employee.EmployeeAddressEntity;
import com.app.domain.entities.employee.EmployeeContactEntity;
import com.app.domain.entities.employee.EmployeeEntity;

public class EmployeeService {
	private final RegisterEmployeeUseCase _registerEmployee;
	private final AuthEmployeeUseCase _authEmployee;
	
	public EmployeeService(
			RegisterEmployeeUseCase registerEmployee,
			AuthEmployeeUseCase authEmployee
			) {
		this._registerEmployee = registerEmployee;
		this._authEmployee = authEmployee;
	}
	
	public void register(EmployeeEntity employee, EmployeeContactEntity contact, EmployeeAddressEntity address) {
		this._registerEmployee.execute(employee, contact, address);
	}
	
	public EmployeeEntity authenticate(String email, String password) {
		EmployeeEntity employeeData = this._authEmployee.execute(email, password);
		
		return employeeData;
	}
}
