package com.app;

import java.awt.EventQueue;

import com.app.insfrastructure.database.DatabaseInitializer;
import com.app.presentation.views.LoginView;

public class Main {
	
    public static void main(String[] args) {
    	
    	DatabaseInitializer databaseStart = new DatabaseInitializer();
    	
    	EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					databaseStart.initialize();
					LoginView frame = new LoginView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
    }
}