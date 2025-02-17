package com.app.infrastructure.factories;

import com.app.application.usecases.employee.AuthEmployeeUseCase;
import com.app.application.usecases.employee.FindEmployeeByCPFUseCase;
import com.app.application.usecases.employee.RegisterEmployeeUseCase;
import com.app.application.usecases.employee.ReturnEmployeesUseCase;
import com.app.domain.repositories.EmployeeRepository;
import com.app.domain.repositories.interfaces.IEmployeeRepository;
import com.app.domain.services.EmployeeService;
import com.app.infrastructure.controllers.employee.EmployeeController;
import com.app.infrastructure.controllers.interfaces.IEmployeeController;

public class EmployeeFactory {
	public IEmployeeController createEmployeeController() {
		IEmployeeRepository employeeRepository = new EmployeeRepository();
		
		RegisterEmployeeUseCase registerEmployeeUseCase = new RegisterEmployeeUseCase(employeeRepository);
		AuthEmployeeUseCase authEmployeeUseCase = new AuthEmployeeUseCase(employeeRepository);
		ReturnEmployeesUseCase returnEmployeesUseCase = new ReturnEmployeesUseCase(employeeRepository);
		FindEmployeeByCPFUseCase findEmployeeByCPFUseCase = new FindEmployeeByCPFUseCase(employeeRepository);
		
		EmployeeService employeeService = new EmployeeService(
				registerEmployeeUseCase, 
				authEmployeeUseCase, 
				returnEmployeesUseCase
				);
		
		return new EmployeeController(employeeService, findEmployeeByCPFUseCase);
	}
	
}
