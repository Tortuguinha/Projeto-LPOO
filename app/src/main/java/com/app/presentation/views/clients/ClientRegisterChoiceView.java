package com.app.presentation.views.clients;

import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.app.domain.entities.employee.EmployeeEntity;
import com.app.infrastructure.controllers.interfaces.IEmployeeController;
import com.app.presentation.views.DashboardView;
import com.app.presentation.views.clients.client.ClientRegistrationView;
import com.app.presentation.views.clients.company.CompanyRegistrationView;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/* Tela para registrar cliente */
public class ClientRegisterChoiceView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private EmployeeEntity _employeeLogged;
	private IEmployeeController _employeeController;
	 
	public ClientRegisterChoiceView(
			EmployeeEntity _employeeLogged,
			IEmployeeController employeeController
			) {
		this._employeeLogged = _employeeLogged;
		this._employeeController = employeeController;

		this.components();
	}
	
	public void components() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Olá" + this._employeeLogged.getName());
		lblNewLabel.setBounds(574, 31, 150, 14);
		contentPane.add(lblNewLabel);
		
		JLabel questionLabel = new JLabel("O que você pretende cadastrar");
		questionLabel.setBounds(261, 129, 266, 119);
		questionLabel.setFont(new Font(null, Font.PLAIN, 18));
		contentPane.add(questionLabel);
		
		JButton legalPersonbtn = new JButton("Pessoa Jurídica (CNPJ)");
		legalPersonbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CompanyRegistrationView companyRegisterView = new CompanyRegistrationView(_employeeLogged);
				companyRegisterView.setVisible(true);
				dispose();
			}
		});
		legalPersonbtn.setBounds(268, 240, 253, 58);
		contentPane.add(legalPersonbtn);
		
		JButton btnPessoaFsicacpf = new JButton("Pessoa Física (CPF)");
		btnPessoaFsicacpf.setBounds(268, 336, 253, 58);
		btnPessoaFsicacpf.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				ClientRegistrationView clientRegisterView = new ClientRegistrationView(_employeeLogged);
				clientRegisterView.setVisible(true);
				dispose();
				
			}
		});
		contentPane.add(btnPessoaFsicacpf);
		
		 JButton btnVoltar = new JButton("Voltar");
	        btnVoltar.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	            	DashboardView dashboardView = new DashboardView(_employeeLogged, _employeeController);
	            	dashboardView.setVisible(true);
	            	dispose();
	            }
	        });
	        btnVoltar.setForeground(SystemColor.textHighlight);
	        btnVoltar.setFont(new Font("Tahoma", Font.PLAIN, 14));
	        btnVoltar.setBounds(553, 499, 142, 40);
	        
	        contentPane.add(btnVoltar);
	}
}
