package com.app.presentation.views.service_order;

/* Tela com dados da ordem de serviço */

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class SOInfoView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public SOInfoView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
	}

}
