package com.app.presentation.views.client;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.app.domain.entities.employee.EmployeeEntity;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/* Tela para registrar cliente */
public class ClientRegisterView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private EmployeeEntity _employeeLogged;

	public ClientRegisterView(EmployeeEntity _employeeLogged) {
		this._employeeLogged = _employeeLogged;
	}
	
	public void components() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Olá" + " " + "user");
		lblNewLabel.setBounds(574, 31, 150, 14);
		contentPane.add(lblNewLabel);
		
		JLabel questionLabel = new JLabel("O que você pretende cadastrar");
		questionLabel.setBounds(261, 129, 266, 119);
		questionLabel.setFont(new Font(null, Font.PLAIN, 18));
		contentPane.add(questionLabel);
		
		JButton btnNewButton = new JButton("Pessoa Jurídica (CNPJ)");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(268, 240, 253, 58);
		contentPane.add(btnNewButton);
		
		JButton btnPessoaFsicacpf = new JButton("Pessoa Física (CPF)");
		btnPessoaFsicacpf.setBounds(268, 336, 253, 58);
		contentPane.add(btnPessoaFsicacpf);
	}
}
