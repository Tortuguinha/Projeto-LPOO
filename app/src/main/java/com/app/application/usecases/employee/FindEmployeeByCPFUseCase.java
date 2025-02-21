package com.app.application.usecases.employee;

import com.app.domain.entities.employee.EmployeeEntity;
import com.app.domain.repositories.interfaces.IEmployeeRepository;

public class FindEmployeeByCPFUseCase {
	private IEmployeeRepository _employeeRepository;

		public FindEmployeeByCPFUseCase(IEmployeeRepository employeeRepository) {
			this._employeeRepository = employeeRepository;
		}

		public EmployeeEntity execute(String cpf) {
		    if (cpf == null) {
		        throw new IllegalArgumentException("O CPF não pode ser nulo");
		    }
		    if (cpf.isEmpty()) {
		        throw new IllegalArgumentException("O CPF não pode ser vazio");
		    }
		    if (!cpf.matches("\\d{11}")) {
		        throw new IllegalArgumentException("O CPF deve conter 11 dígitos numéricos");
		    }
		    EmployeeEntity employee = this._employeeRepository.findByCPF(cpf);

		    return employee;
		}

}
