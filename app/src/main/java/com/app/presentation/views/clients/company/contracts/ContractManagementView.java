package com.app.presentation.views.clients.company.contracts;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ContractManagementView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public ContractManagementView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
	}

}
