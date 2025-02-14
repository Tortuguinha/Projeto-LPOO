package com.app.domain.repositories.interfaces;

import com.app.domain.entities.employee.EmployeeAddressEntity;
import com.app.domain.entities.employee.EmployeeContactEntity;
import com.app.domain.entities.employee.EmployeeEntity;

public interface IEmployeeRepository {
	public void save(EmployeeEntity employee, EmployeeContactEntity contact, EmployeeAddressEntity address);
	public EmployeeEntity findByEmail(String email);
}
