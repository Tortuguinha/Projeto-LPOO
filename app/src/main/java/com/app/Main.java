package com.app;

import java.awt.EventQueue;

import com.app.infrastructure.database.DatabaseInitializer;
import com.app.presentation.views.auth.LoginView;

public class Main {
	

    public static void main(String[] args) {
    	DatabaseInitializer databaseInit = new DatabaseInitializer();
    	
    	EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					databaseInit.execute();
					LoginView frame = new LoginView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
    }
}