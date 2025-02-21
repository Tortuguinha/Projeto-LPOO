package com.app.presentation.views.clients.company;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ResgisterCompanyOS {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ResgisterCompanyOS window = new ResgisterCompanyOS();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ResgisterCompanyOS() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 546, 460);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Informações Adicionais");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(21, 11, 204, 20);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Técnico Responsável");
		lblNewLabel_1.setBounds(21, 42, 143, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(21, 67, 204, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Financeiro");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(21, 125, 107, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Custo Final");
		lblNewLabel_3.setBounds(21, 150, 79, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setBounds(21, 190, 133, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Forma de Pgamento");
		lblNewLabel_4.setBounds(24, 215, 104, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("Criar O.S");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setForeground(SystemColor.textHighlight);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(368, 337, 107, 36);
		frame.getContentPane().add(btnNewButton);
		
		textField_2 = new JTextField();
		textField_2.setBounds(21, 242, 133, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
	}
}
