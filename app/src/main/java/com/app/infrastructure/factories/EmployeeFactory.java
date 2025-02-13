package com.app.infrastructure.factories;

import com.app.application.usecases.employee.RegisterEmployeeUseCase;
import com.app.domain.repositories.EmployeeRepository;
import com.app.domain.repositories.interfaces.IEmployeeRepository;
import com.app.domain.services.EmployeeService;
import com.app.infrastructure.controllers.employee.EmployeeController;
import com.app.infrastructure.controllers.interfaces.IEmployeeController;

public class EmployeeFactory {
	public IEmployeeController registerEmployee() {
		IEmployeeRepository employeeRepository = new EmployeeRepository();
		RegisterEmployeeUseCase registerEmployeeUseCase = new RegisterEmployeeUseCase(employeeRepository);
		EmployeeService employeeService = new EmployeeService(registerEmployeeUseCase);
		
		return new EmployeeController(employeeService);
	}
}
