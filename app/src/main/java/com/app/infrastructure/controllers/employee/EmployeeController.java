package com.app.infrastructure.controllers.employee;

import com.app.domain.entities.employee.EmployeeAddressEntity;
import com.app.domain.entities.employee.EmployeeContactEntity;
import com.app.domain.entities.employee.EmployeeEntity;
import com.app.domain.services.EmployeeService;
import com.app.infrastructure.controllers.interfaces.IEmployeeController;

public class EmployeeController implements IEmployeeController {
	
	private final EmployeeService _employeeServices;
	
	public EmployeeController(EmployeeService employeeServices) {
		this._employeeServices = employeeServices;
	}
	
	public void register(EmployeeEntity employee, EmployeeContactEntity contact, EmployeeAddressEntity address) {
		try {
			this._employeeServices.register(employee, contact, address);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
