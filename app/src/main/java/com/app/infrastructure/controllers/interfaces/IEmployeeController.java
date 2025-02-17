package com.app.infrastructure.controllers.interfaces;

import java.util.List;

import com.app.domain.entities.employee.EmployeeAddressEntity;
import com.app.domain.entities.employee.EmployeeContactEntity;
import com.app.domain.entities.employee.EmployeeEntity;

public interface IEmployeeController {
	public void register(EmployeeEntity employee, EmployeeContactEntity contact, EmployeeAddressEntity address);
	public EmployeeEntity authenticate(String email, String password);
	 EmployeeEntity findEmployeeByCPF(String cpf);
	public List<EmployeeEntity> returnAllEmployees();
}
