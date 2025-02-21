package com.app.presentation.views.clients.company;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class ManageOS {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManageOS window = new ManageOS();
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
	public ManageOS() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 702, 412);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Dados");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 11, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(" CPF do Cliente");
		lblNewLabel_1.setBounds(10, 36, 152, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(10, 61, 179, 31);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Código de Orde de Serviço");
		lblNewLabel_2.setBounds(10, 103, 169, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 128, 179, 28);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Código do Orçamento");
		lblNewLabel_3.setBounds(10, 159, 169, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(10, 182, 179, 28);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Prioridade e Prazo");
		lblNewLabel_4.setBounds(10, 221, 122, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setBounds(10, 271, 86, 28);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Nível de Urgência");
		lblNewLabel_5.setBounds(10, 246, 137, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Data de Entrega");
		lblNewLabel_6.setBounds(12, 304, 103, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		textField_4 = new JTextField();
		textField_4.setBounds(10, 329, 86, 33);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Informações");
		lblNewLabel_7.setBounds(253, 13, 146, 14);
		frame.getContentPane().add(lblNewLabel_7);
		
		textField_5 = new JTextField();
		textField_5.setBounds(253, 61, 181, 72);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Detalhes sobre o defeito ou necessidade");
		lblNewLabel_8.setBounds(253, 36, 245, 14);
		frame.getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Sintomas Apresentados (se houver)");
		lblNewLabel_9.setBounds(258, 159, 179, 14);
		frame.getContentPane().add(lblNewLabel_9);
		
		textField_6 = new JTextField();
		textField_6.setBounds(256, 186, 181, 74);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("Dados do Equipamento");
		lblNewLabel_10.setBounds(513, 13, 122, 14);
		frame.getContentPane().add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Descriçao do equipamento");
		lblNewLabel_11.setBounds(513, 36, 163, 14);
		frame.getContentPane().add(lblNewLabel_11);
		
		textField_7 = new JTextField();
		textField_7.setBounds(513, 63, 160, 26);
		frame.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("Marca/Modelo");
		lblNewLabel_12.setBounds(516, 103, 146, 14);
		frame.getContentPane().add(lblNewLabel_12);
		
		textField_8 = new JTextField();
		textField_8.setBounds(513, 132, 160, 20);
		frame.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("Número de Série");
		lblNewLabel_13.setBounds(516, 176, 109, 14);
		frame.getContentPane().add(lblNewLabel_13);
		
		textField_9 = new JTextField();
		textField_9.setBounds(513, 201, 86, 20);
		frame.getContentPane().add(textField_9);
		textField_9.setColumns(10);
		
		JButton btnNewButton = new JButton("Atualizar O.S");
		btnNewButton.setForeground(SystemColor.textHighlight);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(546, 329, 130, 33);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Voltar ao Início");
		btnNewButton_1.setForeground(SystemColor.textHighlight);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1.setBounds(546, 292, 127, 31);
		frame.getContentPane().add(btnNewButton_1);
	}

}
