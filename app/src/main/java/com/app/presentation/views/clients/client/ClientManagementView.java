package com.app.presentation.views.clients.client;

/* Tela com lista de todos os clientes (Pessoa Fisica e Juridica)*/

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ClientManagementView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public ClientManagementView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
	}

}
