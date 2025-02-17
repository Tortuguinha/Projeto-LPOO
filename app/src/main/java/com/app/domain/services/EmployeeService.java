package com.app.domain.services;

import java.util.List;

import com.app.application.usecases.employee.AuthEmployeeUseCase;
import com.app.application.usecases.employee.FindEmployeeByCPFUseCase;
import com.app.application.usecases.employee.RegisterEmployeeUseCase;
import com.app.application.usecases.employee.ReturnEmployeesUseCase;
import com.app.domain.entities.employee.EmployeeAddressEntity;
import com.app.domain.entities.employee.EmployeeContactEntity;
import com.app.domain.entities.employee.EmployeeEntity;

public class EmployeeService {
	private final RegisterEmployeeUseCase _registerEmployee;
	private final AuthEmployeeUseCase _authEmployee;
	private final ReturnEmployeesUseCase _returnEmployees;
	
	public EmployeeService(
			RegisterEmployeeUseCase registerEmployee,
			AuthEmployeeUseCase authEmployee,
			ReturnEmployeesUseCase returnEmployees
			) {
		this._registerEmployee = registerEmployee;
		this._authEmployee = authEmployee;
		this._returnEmployees = returnEmployees;
	}
	
	public void register(EmployeeEntity employee, EmployeeContactEntity contact, EmployeeAddressEntity address) {
		this._registerEmployee.execute(employee, contact, address);
	}
	
	public EmployeeEntity authenticate(String email, String password) {
		EmployeeEntity employeeData = this._authEmployee.execute(email, password);
		
		return employeeData;
	}
	
	public List<EmployeeEntity> allEmployee() {
		return this._returnEmployees.execute();
	}
}
