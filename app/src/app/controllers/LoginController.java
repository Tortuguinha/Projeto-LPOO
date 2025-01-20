package app.controllers;

import app.infraestructure.repositories.interfaces.IEmployeeRepository;
import app.application.services.Employee.AuthService;

public class LoginController {

	private AuthService authService;
	
	public LoginController(IEmployeeRepository _employeeRepository) {
		this.authService = new AuthService(_employeeRepository);
	}

	public void handleLogin(String email, String password) {
		try {
			this.authService.authenticate(email, password);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
