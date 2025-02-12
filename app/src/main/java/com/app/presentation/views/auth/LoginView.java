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
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class LoginView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public LoginView() {
		setTitle("Tela de Login");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Componentes da interface
        JLabel lblUsuario = new JLabel("Usuário:");
        lblUsuario.setBounds(107, 91, 104, 34);
        lblUsuario.setHorizontalAlignment(SwingConstants.CENTER);
        lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 15));
        JLabel lblSenha = new JLabel("Senha:");
        lblSenha.setBounds(107, 166, 112, 38);
        lblSenha.setHorizontalAlignment(SwingConstants.CENTER);
        lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 15));
        JTextField txtUsuario = new JTextField();
        txtUsuario.setBounds(189, 98, 231, 25);
        txtUsuario.setHorizontalAlignment(SwingConstants.CENTER);
        JPasswordField txtSenha = new JPasswordField();
        txtSenha.setBounds(189, 173, 231, 25);
        txtSenha.setHorizontalAlignment(SwingConstants.CENTER);
        txtSenha.setFont(new Font("Tahoma", Font.PLAIN, 15));
        JButton btnLogin = new JButton("Entrar");
        btnLogin.setBounds(241, 239, 112, 34);
        btnLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               
            }
        });
        btnLogin.setForeground(SystemColor.textHighlight);
        btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 15));
        getContentPane().setLayout(null);

        // Adicionando componentes à janela
        getContentPane().add(lblUsuario);
        getContentPane().add(txtUsuario);
        getContentPane().add(lblSenha);
        getContentPane().add(txtSenha);
        JLabel label = new JLabel();
        label.setBounds(0, 300, 129, 45);
        getContentPane().add(label); // Espaço vazio
        getContentPane().add(btnLogin);
        JLabel label_1 = new JLabel();
        label_1.setBounds(0, 345, 292, 115);
        getContentPane().add(label_1); // Espaço vazio
        
        JLabel LabelTelaDeLogin = new JLabel("Tela De Login");
        LabelTelaDeLogin.setHorizontalAlignment(SwingConstants.CENTER);
        LabelTelaDeLogin.setFont(new Font("Tahoma", Font.PLAIN, 15));
        LabelTelaDeLogin.setBounds(248, 34, 105, 29);
        getContentPane().add(LabelTelaDeLogin);
        
        JButton btnEsqueceuSenha = new JButton("Esqueceu Senha");
        btnEsqueceuSenha.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
 
            }
        });
        btnEsqueceuSenha.setForeground(SystemColor.textHighlight);
        btnEsqueceuSenha.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnEsqueceuSenha.setBounds(224, 284, 143, 34);
        getContentPane().add(btnEsqueceuSenha);

        setLocationRelativeTo(null); // Centraliza a janela
        setVisible(true);
	}

}
