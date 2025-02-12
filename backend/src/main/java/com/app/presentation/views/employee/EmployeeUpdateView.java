package com.app.presentation.views.employee;

/* Tela para atualização de dados do funcionário */

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class EmployeeUpdateView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public EmployeeUpdateView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
	}

}
