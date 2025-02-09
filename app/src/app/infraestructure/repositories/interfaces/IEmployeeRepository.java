package app.infraestructure.repositories.interfaces;

import app.model.EmployeeModel;

public interface IEmployeeRepository {
	void create(EmployeeModel Employee);
	EmployeeModel findByEmail(String email);
}
