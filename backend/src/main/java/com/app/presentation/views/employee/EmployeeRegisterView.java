package com.app.presentation.views.employee;

import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

/* Tela para cadastro de funcionário */

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class EmployeeRegisterView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	JTextField nomeField;
	JTextField cpfCnpjField;
	JTextField telefoneField;
	JTextField emailField;
	JButton cadastrarButton;
	JButton voltarButton;
	
	public EmployeeRegisterView() {
		setTitle("Cadastro de Funcionário");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        getContentPane().setLayout(null);

        JLabel nomeLabel = new JLabel("Nome:");
        nomeLabel.setBounds(65, 39, 71, 39);
        nomeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        nomeLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        getContentPane().add(nomeLabel);

        nomeField = new JTextField();
        nomeField.setBounds(125, 48, 255, 22);
        nomeField.setFont(new Font("Tahoma", Font.PLAIN, 13));
        getContentPane().add(nomeField);

        JLabel cpfCnpjLabel = new JLabel("CPF/CNPJ:");
        cpfCnpjLabel.setBounds(51, 89, 83, 39);
        cpfCnpjLabel.setHorizontalAlignment(SwingConstants.CENTER);
        cpfCnpjLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        getContentPane().add(cpfCnpjLabel);

        cpfCnpjField = new JTextField();
        cpfCnpjField.setBounds(130, 98, 250, 22);
        cpfCnpjField.setFont(new Font("Tahoma", Font.PLAIN, 13));
        getContentPane().add(cpfCnpjField);

        JLabel telefoneLabel = new JLabel("Telefone:");
        telefoneLabel.setBounds(39, 131, 107, 51);
        telefoneLabel.setHorizontalAlignment(SwingConstants.CENTER);
        telefoneLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        getContentPane().add(telefoneLabel);

        telefoneField = new JTextField();
        telefoneField.setBounds(130, 146, 250, 22);
        telefoneField.setFont(new Font("Tahoma", Font.PLAIN, 13));
        getContentPane().add(telefoneField);

        JLabel emailLabel = new JLabel("E-mail:");
        emailLabel.setBounds(39, 181, 107, 39);
        emailLabel.setHorizontalAlignment(SwingConstants.CENTER);
        emailLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        getContentPane().add(emailLabel);

        emailField = new JTextField();
        emailField.setBounds(125, 190, 255, 22);
        emailField.setFont(new Font("Tahoma", Font.PLAIN, 13));
        getContentPane().add(emailField);

        cadastrarButton = new JButton("Cadastrar");
        cadastrarButton.setBounds(379, 320, 161, 39);
        cadastrarButton.setForeground(SystemColor.textHighlight);
        cadastrarButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
        cadastrarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        getContentPane().add(cadastrarButton);

        voltarButton = new JButton("Voltar");
        voltarButton.setBounds(197, 320, 161, 39);
        voltarButton.setForeground(SystemColor.textHighlight);
        voltarButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
        voltarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        getContentPane().add(voltarButton);
        
        JLabel label = new JLabel();
        label.setBounds(0, 372, 289, 88);
        getContentPane().add(label);
	}

}
