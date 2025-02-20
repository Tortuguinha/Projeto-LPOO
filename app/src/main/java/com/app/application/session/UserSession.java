/* Singleton */
package com.app.application.session;

import com.app.domain.entities.employee.EmployeeEntity;

public class UserSession {
	private static UserSession instance;
	private EmployeeEntity _employeeEntity;
	
	private UserSession(EmployeeEntity employeeEntity) {
		this._employeeEntity = employeeEntity;
	}
	
	public static void startSesion(EmployeeEntity employeeEntity) {
		if(instance != null) {
			instance = new UserSession(employeeEntity);
		}
	}
	
	public static UserSession getInstance() {
		return instance;
	}
	
	public EmployeeEntity getEmployee() {
		return this._employeeEntity;
	}
	
	public static void closeSession() {
		instance = null;
	}
}
