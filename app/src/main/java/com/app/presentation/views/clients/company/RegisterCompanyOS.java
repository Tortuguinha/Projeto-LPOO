package com.app.presentation.views.clients.company;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegisterCompanyOS {

	private JFrame frame;
	private JTextField txtDados;
	private JTextField txtC;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterCompanyOS window = new RegisterCompanyOS();
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
	public RegisterCompanyOS() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 716, 465);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Voltar ao Início");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setForeground(SystemColor.textHighlight);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(553, 299, 137, 34);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Continuar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setForeground(SystemColor.textHighlight);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1.setBounds(553, 344, 137, 34);
		frame.getContentPane().add(btnNewButton_1);
		
		txtDados = new JTextField();
		txtDados.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtDados.setBounds(10, 61, 196, 20);
		frame.getContentPane().add(txtDados);
		txtDados.setColumns(10);
		
		txtC = new JTextField();
		txtC.setBounds(10, 120, 196, 20);
		frame.getContentPane().add(txtC);
		txtC.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Dados");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 11, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("CPNJ da empresa (Para validação)");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(10, 36, 180, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Código do Orçamento (Para validação)");
		lblNewLabel_2.setBounds(10, 92, 196, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Dados do equipamento");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(10, 151, 180, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Descrição do Equipamento");
		lblNewLabel_4.setBounds(10, 176, 143, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setBounds(10, 201, 196, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Marca/Modelo");
		lblNewLabel_5.setBounds(10, 232, 127, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 254, 196, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Número de Série");
		lblNewLabel_6.setBounds(10, 285, 127, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		textField_2 = new JTextField();
		textField_2.setBounds(10, 307, 196, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Informações");
		lblNewLabel_7.setBounds(283, 13, 137, 14);
		frame.getContentPane().add(lblNewLabel_7);
		
		textField_3 = new JTextField();
		textField_3.setBounds(283, 58, 188, 82);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Detalhes sobre defeitos ou necessidade");
		lblNewLabel_8.setBounds(283, 36, 237, 14);
		frame.getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Sintomas Apresentados (Se houver)");
		lblNewLabel_9.setBounds(283, 153, 188, 14);
		frame.getContentPane().add(lblNewLabel_9);
		
		textField_4 = new JTextField();
		textField_4.setBounds(282, 173, 189, 88);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("Prioridade e Prazo");
		lblNewLabel_10.setBounds(526, 13, 137, 14);
		frame.getContentPane().add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Nível de Urgência");
		lblNewLabel_11.setBounds(530, 36, 123, 14);
		frame.getContentPane().add(lblNewLabel_11);
		
		textField_5 = new JTextField();
		textField_5.setBounds(526, 120, 115, 20);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("Data de Entrega");
		lblNewLabel_12.setBounds(525, 95, 97, 14);
		frame.getContentPane().add(lblNewLabel_12);
	}
}
