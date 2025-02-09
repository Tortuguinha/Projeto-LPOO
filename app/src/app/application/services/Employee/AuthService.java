package app.application.services.Employee;

import app.infraestructure.repositories.interfaces.IEmployeeRepository;

public class AuthService {
	private final IEmployeeRepository _employeeRepository;
	
	public AuthService(IEmployeeRepository employeeRepository) {
		this._employeeRepository = employeeRepository;
	}
	
	public String authenticate(String email, String password) {
		
		if(email.isBlank() || email.length() < 6 || password.isBlank() || password.length() < 8 || password.length() > 16) {
			throw new Error("Email is wrong");
		}
		
		var user = this._employeeRepository.findByEmail(email);
		
		return user.getEmail();
	}
}
