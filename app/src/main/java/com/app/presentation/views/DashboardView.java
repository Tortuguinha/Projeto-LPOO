package com.app.presentation.views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class DashboardView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public DashboardView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnRegisterClient = new JButton("Cadastrar Cliente");
		btnRegisterClient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JLabel lblPresentation = new JLabel("Olá, usuário!");
		lblPresentation.setBounds(54, 62, 79, 14);
		contentPane.add(lblPresentation);
		
		btnRegisterClient.setBounds(54, 112, 160, 39);
		contentPane.add(btnRegisterClient);
		
		JButton btnManageClient = new JButton("Gerenciar Clientes");
		btnManageClient.setBounds(54, 171, 160, 39);
		contentPane.add(btnManageClient);
		
		JButton btnRegisterSO = new JButton("Registrar OS");
		btnRegisterSO.setBounds(54, 228, 160, 39);
		contentPane.add(btnRegisterSO);
		
		JButton btnManageSO = new JButton("Gerenciar OS");
		btnManageSO.setBounds(54, 285, 160, 39);
		contentPane.add(btnManageSO);
		
		JButton btnServiceHistory = new JButton("Histórico de Serviços");
		btnServiceHistory.setBounds(54, 342, 160, 39);
		contentPane.add(btnServiceHistory);
	}

}
