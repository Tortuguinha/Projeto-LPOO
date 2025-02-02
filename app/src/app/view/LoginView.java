package app.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginView extends JFrame {

    public LoginView() {
        setTitle("Tela de Login");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(new GridLayout(4, 2));

        // Componentes da interface
        JLabel lblUsuario = new JLabel("Usuário:");
        lblUsuario.setHorizontalAlignment(SwingConstants.CENTER);
        lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 15));
        JLabel lblSenha = new JLabel("Senha:");
        lblSenha.setHorizontalAlignment(SwingConstants.CENTER);
        lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 15));
        JTextField txtUsuario = new JTextField();
        txtUsuario.setHorizontalAlignment(SwingConstants.CENTER);
        JPasswordField txtSenha = new JPasswordField();
        txtSenha.setHorizontalAlignment(SwingConstants.CENTER);
        txtSenha.setFont(new Font("Tahoma", Font.PLAIN, 15));
        JButton btnLogin = new JButton("Entrar");
        btnLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String usuario = txtUsuario.getText();
                char[] senhaChar = txtSenha.getPassword();
                String senha = new String(senhaChar);

                // Verificação de caracteres
                if (usuario.matches(".*\\d.*")) {
                    JOptionPane.showMessageDialog(null, "Nome de usuário não pode conter números.", "Erro", JOptionPane.ERROR_MESSAGE);
                    System.out.println("Nome de usuário não pode conter números.");
                    return;
                }

                if (senha.length() >= 9) {
                    JOptionPane.showMessageDialog(null, "Senha deve ter menos de 9 caracteres.", "Erro", JOptionPane.ERROR_MESSAGE);
                    System.out.println("Senha deve ter menos de 9 caracteres.");
                    return;
                }

                // Lógica de login
                if (usuario.equals("administrador") && senha.equals("12345687")) {
                    JOptionPane.showMessageDialog(null, "Login bem-sucedido!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    System.out.println("Login bem-sucedido!");
                    System.out.println("Usuário: " + usuario);
                    System.out.println("Senha: " + senha);
                } else {
                    JOptionPane.showMessageDialog(null, "Nome de usuário ou senha incorretos.", "Erro", JOptionPane.ERROR_MESSAGE);
                    System.out.println("Nome de usuário ou senha incorretos.");
                }
            }
        });
        btnLogin.setForeground(SystemColor.textHighlight);
        btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 15));
        JButton btnCadastrar = new JButton("Cadastrar Funcionário");
        btnCadastrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String usuario = txtUsuario.getText();
                char[] senhaChar = txtSenha.getPassword();
                String senha = new String(senhaChar);

                if (usuario.isEmpty() || senha.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos obrigatórios.", "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                if (usuario.matches(".*\\d.*")) {
                    JOptionPane.showMessageDialog(null, "Nome de usuário não pode conter números.", "Erro", JOptionPane.ERROR_MESSAGE);
                    System.out.println("Nome de usuário não pode conter números.");
                    return;
                }

                if (senha.length() >= 9) {
                    JOptionPane.showMessageDialog(null, "Senha deve ter menos de 9 caracteres.", "Erro", JOptionPane.ERROR_MESSAGE);
                    System.out.println("Senha deve ter menos de 9 caracteres.");
                    return;
                }

                // Lógica de cadastro
                System.out.println("Usuário: " + usuario);
                System.out.println("Senha: " + senha);
            }
        });
        btnCadastrar.setForeground(SystemColor.textHighlight);
        btnCadastrar.setFont(new Font("Tahoma", Font.PLAIN, 15));

        // Adicionando componentes à janela
        getContentPane().add(lblUsuario);
        getContentPane().add(txtUsuario);
        getContentPane().add(lblSenha);
        getContentPane().add(txtSenha);
        getContentPane().add(new JLabel()); // Espaço vazio
        getContentPane().add(btnLogin);
        getContentPane().add(new JLabel()); // Espaço vazio
        getContentPane().add(btnCadastrar);

        setLocationRelativeTo(null); // Centraliza a janela
        setVisible(true);
    }

    public static void main(String[] args) {
        new LoginView();
    }
}

