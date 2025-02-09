package com.app.presentation.views;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.app.presentation.components.button.ButtonComponent;
import com.app.presentation.components.input.InputComponent;
import javax.swing.JButton;
import javax.swing.JLabel;

public class LoginView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel loginPanel;

	InputComponent inputLogin;
	InputComponent inputPwd;
	ButtonComponent btnLogin;
	JLabel windowTitle;
	
	public LoginView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		loginPanel = new JPanel();
		loginPanel.setBorder(new EmptyBorder(5, 5, 5, 5));

		windowTitle = new JLabel("Login");
		windowTitle.setBounds(371, 124, 71, 44);
		windowTitle.setFont(new Font("Arial", Font.BOLD, 22));
		loginPanel.add(windowTitle);
		
		inputLogin = new InputComponent();
		inputLogin.setBounds(305, 179, 191, 30);
		
		inputLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		loginPanel.add(inputLogin);
		
		setContentPane(loginPanel);
		loginPanel.setLayout(null);
		
		inputPwd = new InputComponent();
		inputPwd.setBounds(305, 222, 191, 30);
		loginPanel.add(inputPwd);
		
		btnLogin = new ButtonComponent("Login");
		btnLogin.setBounds(305, 311, 191, 30);
		
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DashboardView dashboardView = new DashboardView();
				dashboardView.setVisible(true);
				dispose();
			}
		});
		
		loginPanel.add(btnLogin);
	}
}
