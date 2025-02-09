package app.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import app.model.User;

import java.util.ArrayList;
import java.util.List;

public class ResetPassword extends JFrame {
    private JTextField usuarioField;
    private JTextField novoUsuarioField;
    private JPasswordField novaSenhaField;
    private JPasswordField confirmarSenhaField;
    private List<User> users;

    public ResetPassword(List<User> users) {
        this.users = users;

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
                String usuario = usuarioField.getText();
                String novoUsuario = novoUsuarioField.getText();
                String novaSenha = new String(novaSenhaField.getPassword());
                String confirmarSenha = new String(confirmarSenhaField.getPassword());

                // Validação dos campos
                if (usuario.isEmpty()) {
                    System.out.println("Erro: Nome de usuário atual é obrigatório.");
                    JOptionPane.showMessageDialog(null, "Nome de usuário atual é obrigatório.", "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                if (novoUsuario.isEmpty() || novoUsuario.matches(".*\\d.*")) {
                    System.out.println("Erro: Novo nome de usuário é obrigatório e não deve conter números.");
                    JOptionPane.showMessageDialog(null, "Novo nome de usuário é obrigatório e não deve conter números.", "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                if (novaSenha.isEmpty() || novaSenha.length() >= 9) {
                    System.out.println("Erro: Nova senha é obrigatória e deve ter menos de 9 caracteres.");
                    JOptionPane.showMessageDialog(null, "Nova senha é obrigatória e deve ter menos de 9 caracteres.", "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                if (!novaSenha.equals(confirmarSenha)) {
                    System.out.println("Erro: As senhas não coincidem.");
                    JOptionPane.showMessageDialog(null, "As senhas não coincidem.", "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                // Atualização de usuário e senha
                boolean userFound = false;
                for (User user : users) {
                    if (user.getUsername().equals(usuario)) {
                        user.setUsername(novoUsuario);
                        user.setPassword(novaSenha);
                        userFound = true;
                        break;
                    }
                }

                if (userFound) {
                    System.out.println("Usuário e senha atualizados com sucesso!");
                    JOptionPane.showMessageDialog(null, "Usuário e senha atualizados com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    dispose();
                    // Voltar para a tela de login
                    new LoginView(users).setVisible(true);
                } else {
                    System.out.println("Erro: Usuário não encontrado.");
                    JOptionPane.showMessageDialog(null, "Usuário não encontrado.", "Erro", JOptionPane.ERROR_MESSAGE);
                }
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

    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("administrador", "12345687")); // Lista de usuários de exemplo
        SwingUtilities.invokeLater(() -> new ResetPassword(users).setVisible(true));
    }
}
