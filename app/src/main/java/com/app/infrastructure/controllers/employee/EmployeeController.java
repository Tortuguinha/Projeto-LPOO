package com.app.infrastructure.controllers.employee;

import java.util.List;

import javax.swing.JOptionPane;

import com.app.application.usecases.employee.FindEmployeeByCPFUseCase;
import com.app.domain.entities.employee.EmployeeAddressEntity;
import com.app.domain.entities.employee.EmployeeContactEntity;
import com.app.domain.entities.employee.EmployeeEntity;
import com.app.domain.services.EmployeeService;
import com.app.infrastructure.controllers.interfaces.IEmployeeController;

public class EmployeeController implements IEmployeeController {
	
	private final EmployeeService _employeeServices;
	private final FindEmployeeByCPFUseCase _findEmployeeByCPFUseCase;
	
	public EmployeeController(EmployeeService employeeServices, FindEmployeeByCPFUseCase  findEmployeeByCPFUseCase) {
		this._employeeServices = employeeServices;
		this._findEmployeeByCPFUseCase = findEmployeeByCPFUseCase;
	}
	
	public void register(EmployeeEntity employee, EmployeeContactEntity contact, EmployeeAddressEntity address) {
		try {
			this._employeeServices.register(employee, contact, address);
			JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
			
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public EmployeeEntity authenticate(String email, String password) {
		EmployeeEntity employeeData = this._employeeServices.authenticate(email, password);
		
		if(employeeData == null) {
			throw new RuntimeException("Erro na autenticação");
		}
		
		return employeeData;
	}
	
	public EmployeeEntity findEmployeeByCPF(String cpf) {
		
		return this._findEmployeeByCPFUseCase.execute(cpf);
	}
	
	public List<EmployeeEntity> returnAllEmployees() {
		return this._employeeServices.allEmployee();
	}
}
