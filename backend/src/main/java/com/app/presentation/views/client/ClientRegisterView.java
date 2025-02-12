package com.app.presentation.views.client;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/* Tela para registrar cliente */
public class ClientRegisterView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public ClientRegisterView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
	}

}
