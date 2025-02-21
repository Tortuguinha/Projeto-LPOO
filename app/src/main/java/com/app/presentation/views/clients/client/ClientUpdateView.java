package com.app.presentation.views.clients.client;

import java.awt.Font;

import javax.swing.JButton;

/* Tela para atualizar cliente */

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class ClientUpdateView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public ClientUpdateView() {
		setTitle("Editar Cliente");
        setSize(600, 500);
        setLocationRelativeTo(null);

        // Painel para os campos de edição
        JPanel panel = new JPanel();
        panel.setLayout(null);

        // Campo para Nome
        JLabel lblNome = new JLabel("Nome :");
        lblNome.setBounds(30, 27, 172, 48);
        lblNome.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNome.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(lblNome);
        JTextField nomeField = new JTextField();
        nomeField.setBounds(192, 30, 332, 46);
        nomeField.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(nomeField);

        // Campo para Email
        JLabel lblEmail = new JLabel("Email :");
        lblEmail.setBounds(30, 72, 172, 58);
        lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(lblEmail);
        JTextField emailField = new JTextField();
        emailField.setBounds(192, 80, 332, 46);
        emailField.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(emailField);

        // Campo para Telefone
        JLabel label_2 = new JLabel("Telefone:");
        label_2.setBounds(30, 125, 158, 48);
        label_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
        label_2.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(label_2);
        JTextField telefoneField = new JTextField();
        telefoneField.setBounds(192, 128, 332, 46);
        telefoneField.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(telefoneField);

        // Campo para Status
        JLabel label = new JLabel("Status:");
        label.setBounds(52, 177, 117, 48);
        label.setFont(new Font("Tahoma", Font.PLAIN, 14));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(label);
        JTextField statusField = new JTextField();
        statusField.setBounds(192, 179, 332, 48);
        statusField.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(statusField);

        // Botão para salvar as alterações
        JButton saveButton = new JButton("Salvar");
        saveButton.setBounds(409, 306, 117, 35);
        saveButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
        saveButton.addActionListener(e -> {
        });

        // Adicionando os campos e botão ao painel
        JLabel label_4 = new JLabel();
        label_4.setBounds(0, 306, 292, 76);
        panel.add(label_4); // Campo vazio para alinhamento
        panel.add(saveButton);

        // Adiciona o painel à janela
        getContentPane().add(panel);
	}

}
