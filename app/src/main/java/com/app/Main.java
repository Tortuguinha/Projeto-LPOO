package com.app;

import java.awt.EventQueue;

import com.app.infrastructure.database.DatabaseInitializer;
import com.app.infrastructure.factories.EmployeeFactory;
import com.app.presentation.views.auth.LoginView;
import com.app.presentation.views.employee.EmployeeRegisterView;

public class Main {
	
    public static void main(String[] args) {
    	// Database
    	DatabaseInitializer databaseInit = new DatabaseInitializer();
    	
    	// Factories
    	final EmployeeFactory employeeFactory = new EmployeeFactory();
    	
    	// Views
    	final EmployeeRegisterView employeeRegisterView = new EmployeeRegisterView(employeeFactory.createEmployeeController(), null);
    	
    	EventQueue.invokeLater(new Runnable() {    		
			public void run() {
				try {
					databaseInit.execute();
					LoginView frame = new LoginView(employeeFactory.createEmployeeController(), employeeRegisterView);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
    }
}