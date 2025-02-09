package com.app.domain.repositories.interfaces;

import com.app.domain.models.EmployeeModel;

public interface IEmployeeRepository {
	public void create(EmployeeModel employee);
	public void update(EmployeeModel employee);
	public void returnAllEmployee();
}
