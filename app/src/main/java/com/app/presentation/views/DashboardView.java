package com.app.presentation.views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.app.domain.entities.employee.EmployeeEntity;
import com.app.infrastructure.controllers.interfaces.IEmployeeController;
import com.app.presentation.views.client.ClientManagementView;
import com.app.presentation.views.client.ClientRegisterView;
import com.app.presentation.views.employee.EmployeeRegisterView;

public class DashboardView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	private EmployeeEntity _loggedEmployee;
	private final IEmployeeController _employeeController;

	public DashboardView(EmployeeEntity loggedEmployee, IEmployeeController employeeController) {
		this._loggedEmployee = loggedEmployee;
		this._employeeController = employeeController;
		this.components();
	}
	
	public void components() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 750, 550);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JButton btnRegisterClient = new JButton("Cadastrar Cliente");
        btnRegisterClient.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	ClientRegisterView clientRegister = new ClientRegisterView();
            	clientRegister.setVisible(true);
            	dispose();
            }
        });
        
        JLabel lblPresentation = new JLabel("Olá, " + _loggedEmployee.getName() + "!");
        lblPresentation.setBounds(54, 62, 150, 14);
        contentPane.add(lblPresentation);
        
        btnRegisterClient.setBounds(54, 112, 160, 39);
        contentPane.add(btnRegisterClient);
        
        JButton btnManageClient = new JButton("Gerenciar Clientes");
        btnManageClient.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	ClientManagementView clientManage = new ClientManagementView();
            	clientManage.setVisible(true);
            	dispose();
            }
        });
        btnManageClient.setBounds(54, 171, 160, 39);
        contentPane.add(btnManageClient);
        
        JButton btnRegisterEmployee = new JButton("Cadastrar Funcionário");
        btnRegisterEmployee.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	EmployeeRegisterView employeeRegister = new EmployeeRegisterView(_employeeController, _loggedEmployee);
            	employeeRegister.setVisible(true);
            	dispose();
            }
        });
        btnRegisterEmployee.setBounds(54, 228, 160, 39);
        contentPane.add(btnRegisterEmployee);
        
        JButton btnManageSO = new JButton("Gerenciar OS");
        btnManageSO.setBounds(54, 285, 160, 39);
        contentPane.add(btnManageSO);
        
        JButton btnServiceHistory = new JButton("Histórico de Serviços");
        btnServiceHistory.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });
        btnServiceHistory.setBounds(54, 342, 160, 39);
        contentPane.add(btnServiceHistory);
	}

}
