package com.app.application.usecases.employee;

import com.app.domain.entities.employee.EmployeeEntity;
import com.app.domain.repositories.interfaces.IEmployeeRepository;

public class FindEmployeeByCPFUseCase {
	private IEmployeeRepository _employeeRepository;
		
		public FindEmployeeByCPFUseCase(IEmployeeRepository employeeRepository) {
			this._employeeRepository = employeeRepository;
		}
		
		public EmployeeEntity execute(String cpf) {
			EmployeeEntity employee = this._employeeRepository.findByCPF(cpf);
			
			return employee;
		}
		
}
