package com.app.presentation.views.auth;

import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class RecoveryPwdView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	JTextField usuarioField;
	JTextField novoUsuarioField;
	JPasswordField novaSenhaField;
	JPasswordField confirmarSenhaField;


	public RecoveryPwdView() {
		setTitle("Recuperação de Senha");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel usuarioLabel = new JLabel("Usuário Atual:");
        usuarioLabel.setBounds(31, 76, 120, 25);
        usuarioLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));

        usuarioField = new JTextField();
        usuarioField.setBounds(132, 77, 200, 25);
        usuarioField.setFont(new Font("Tahoma", Font.PLAIN, 13));

        JLabel novoUsuarioLabel = new JLabel("Novo Usuário:");
        novoUsuarioLabel.setBounds(31, 125, 120, 25);
        novoUsuarioLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));

        novoUsuarioField = new JTextField();
        novoUsuarioField.setBounds(132, 126, 200, 25);
        novoUsuarioField.setFont(new Font("Tahoma", Font.PLAIN, 13));

        JLabel novaSenhaLabel = new JLabel("Nova Senha:");
        novaSenhaLabel.setBounds(31, 179, 120, 25);
        novaSenhaLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));

        novaSenhaField = new JPasswordField();
        novaSenhaField.setBounds(132, 180, 200, 25);
        novaSenhaField.setFont(new Font("Tahoma", Font.PLAIN, 13));

        JLabel confirmarSenhaLabel = new JLabel("Confirmar Senha:");
        confirmarSenhaLabel.setBounds(10, 230, 150, 25);
        confirmarSenhaLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));

        confirmarSenhaField = new JPasswordField();
        confirmarSenhaField.setBounds(132, 231, 200, 25);
        confirmarSenhaField.setFont(new Font("Tahoma", Font.PLAIN, 13));

        JButton btnAtualizar = new JButton("Atualizar");
        btnAtualizar.setBounds(280, 291, 200, 30);
        btnAtualizar.setForeground(SystemColor.textHighlight);
        btnAtualizar.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnAtualizar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              
            }
        });

        getContentPane().setLayout(null);
        getContentPane().add(usuarioLabel);
        getContentPane().add(usuarioField);
        getContentPane().add(novoUsuarioLabel);
        getContentPane().add(novoUsuarioField);
        getContentPane().add(novaSenhaLabel);
        getContentPane().add(novaSenhaField);
        getContentPane().add(confirmarSenhaLabel);
        getContentPane().add(confirmarSenhaField);
        getContentPane().add(btnAtualizar);
	}

}
