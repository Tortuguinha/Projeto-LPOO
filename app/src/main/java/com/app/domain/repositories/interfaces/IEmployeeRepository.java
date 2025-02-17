package com.app.domain.repositories.interfaces;

import java.util.List;

import com.app.domain.entities.employee.EmployeeAddressEntity;
import com.app.domain.entities.employee.EmployeeContactEntity;
import com.app.domain.entities.employee.EmployeeEntity;

public interface IEmployeeRepository {
	public void save(EmployeeEntity employee, EmployeeContactEntity contact, EmployeeAddressEntity address);
	public EmployeeEntity findByEmail(String email);
	public EmployeeEntity findByCPF(String cpf);
	public List<EmployeeEntity> allEmployee();
}
