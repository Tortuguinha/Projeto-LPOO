package com.app.presentation.views.clients.company;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegisterClientOS {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField txtDetalhesSobrreDefeitos;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterClientOS window = new RegisterClientOS();
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
	public RegisterClientOS() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 730, 477);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Dados");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 11, 46, 31);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("CPF do Cliente (para validação)");
		lblNewLabel_1.setBounds(10, 53, 175, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(10, 77, 194, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Código do Orçamento (Para validação)");
		lblNewLabel_2.setBounds(10, 108, 202, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Dados do Equipamento");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(10, 174, 162, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 133, 194, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Descrição do equipamento");
		lblNewLabel_4.setBounds(10, 199, 175, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		textField_2 = new JTextField();
		textField_2.setBounds(10, 225, 194, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Marca/Modelo");
		lblNewLabel_5.setBounds(10, 261, 117, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		textField_3 = new JTextField();
		textField_3.setBounds(10, 282, 194, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Número de Série");
		lblNewLabel_6.setBounds(10, 313, 106, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		textField_4 = new JTextField();
		textField_4.setBounds(10, 338, 194, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Informações");
		lblNewLabel_7.setBounds(275, 21, 106, 14);
		frame.getContentPane().add(lblNewLabel_7);
		
		txtDetalhesSobrreDefeitos = new JTextField();
		txtDetalhesSobrreDefeitos.setBounds(275, 77, 202, 76);
		frame.getContentPane().add(txtDetalhesSobrreDefeitos);
		txtDetalhesSobrreDefeitos.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Detalhes sobre o defeito ou necessidade");
		lblNewLabel_8.setBounds(275, 46, 202, 14);
		frame.getContentPane().add(lblNewLabel_8);
		
		textField_5 = new JTextField();
		textField_5.setBounds(275, 225, 202, 77);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Sintomas Apresentados (Se houver)");
		lblNewLabel_9.setBounds(275, 199, 194, 14);
		frame.getContentPane().add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Prioridade e Prazo");
		lblNewLabel_10.setBounds(538, 21, 135, 14);
		frame.getContentPane().add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Nívelde Urgência");
		lblNewLabel_11.setBounds(538, 46, 116, 14);
		frame.getContentPane().add(lblNewLabel_11);
		
		textField_6 = new JTextField();
		textField_6.setBounds(532, 69, 145, 20);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("Data de Entrega");
		lblNewLabel_12.setBounds(535, 112, 138, 14);
		frame.getContentPane().add(lblNewLabel_12);
		
		textField_7 = new JTextField();
		textField_7.setBounds(533, 133, 144, 20);
		frame.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		JButton btnNewButton = new JButton("Voltar ao Início");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setForeground(SystemColor.textHighlight);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(538, 338, 135, 36);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Continuar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setForeground(SystemColor.textHighlight);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1.setBounds(538, 385, 135, 31);
		frame.getContentPane().add(btnNewButton_1);
	}

}
