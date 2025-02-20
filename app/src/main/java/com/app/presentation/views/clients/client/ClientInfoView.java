package com.app.presentation.views.clients.client;

/* Tela com dados do cliente */

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ClientInfoView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public ClientInfoView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
	}

}
