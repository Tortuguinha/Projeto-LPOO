package com.app;

import java.awt.EventQueue;

import com.app.infrastructure.database.ClientDatabaseInitializer;
import com.app.infrastructure.database.CompanyDatabaseInitializer;
import com.app.infrastructure.database.EmployeeDatabaseInitializer;
import com.app.infrastructure.factories.ClientFactory;
import com.app.infrastructure.factories.EmployeeFactory;
import com.app.presentation.views.auth.LoginView;
import com.app.presentation.views.employee.EmployeeRegisterView;

public class Main {
	
    public static void main(String[] args) {
    	// Databases Initialize
    	EmployeeDatabaseInitializer employeeDatabaseInit = new EmployeeDatabaseInitializer();
    	ClientDatabaseInitializer clientDatabaseInit = new ClientDatabaseInitializer();
    	CompanyDatabaseInitializer companyDatabaseInit = new CompanyDatabaseInitializer();
    	
    	// Factories
    	final EmployeeFactory employeeFactory = new EmployeeFactory();
    	
    	// Views
    	final EmployeeRegisterView employeeRegisterView = new EmployeeRegisterView(
    			employeeFactory.createEmployeeController(), 
    			null);
    	
    	EventQueue.invokeLater(new Runnable() {    		
			public void run() {
				try {
					employeeDatabaseInit.execute();
					clientDatabaseInit.execute();
					companyDatabaseInit.execute();
					LoginView frame = new LoginView(
							employeeFactory.createEmployeeController(),
							employeeRegisterView
							);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
    }
}