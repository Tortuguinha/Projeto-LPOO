package app.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ClientRegistration extends JFrame {
    private JTextField nomeField, cpfCnpjField, telefoneField, emailField;
    private JButton cadastrarButton;
    
    public ClientRegistration() {
        setTitle("Cadastro de Cliente");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setLayout(new GridLayout(5, 2, 5, 5));
        
        JLabel nomeLabel = new JLabel("Nome:");
        nomeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        nomeLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        nomeField = new JTextField();
        nomeField.setFont(new Font("Tahoma", Font.PLAIN, 13));
        JLabel cpfCnpjLabel = new JLabel("CPF/CNPJ:");
        cpfCnpjLabel.setHorizontalAlignment(SwingConstants.CENTER);
        cpfCnpjLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        cpfCnpjField = new JTextField();
        cpfCnpjField.setFont(new Font("Tahoma", Font.PLAIN, 13));
        JLabel telefoneLabel = new JLabel("Telefone:");
        telefoneLabel.setHorizontalAlignment(SwingConstants.CENTER);
        telefoneLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        telefoneField = new JTextField();
        telefoneField.setFont(new Font("Tahoma", Font.PLAIN, 13));
        JLabel emailLabel = new JLabel("E-mail:");
        emailLabel.setHorizontalAlignment(SwingConstants.CENTER);
        emailLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        emailField = new JTextField();
        emailField.setFont(new Font("Tahoma", Font.PLAIN, 13));
        cadastrarButton = new JButton("Cadastrar");
        cadastrarButton.setForeground(SystemColor.textHighlight);
        cadastrarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nome = nomeField.getText();
                String cpfCnpj = cpfCnpjField.getText();
                String telefone = telefoneField.getText();
                String email = emailField.getText();

                // Validações
                if (nome.isEmpty() || nome.length() > 50 || nome.matches(".*\\d.*")) {
                    System.out.println("Erro: Nome é obrigatório, deve conter apenas letras e ter no máximo 50 caracteres.");
                    JOptionPane.showMessageDialog(null, "Nome é obrigatório, deve conter apenas letras e ter no máximo 50 caracteres.", "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                if (cpfCnpj.isEmpty() || (!cpfCnpj.matches("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}") && !cpfCnpj.matches("\\d{2}\\.\\d{3}\\.\\d{3}/\\d{4}-\\d{2}"))) {
                    System.out.println("Erro: CPF/CNPJ é obrigatório e deve estar no formato correto.");
                    JOptionPane.showMessageDialog(null, "CPF/CNPJ é obrigatório e deve estar no formato correto.", "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                if (telefone.isEmpty() || telefone.length() != 12 || !telefone.matches("\\d+")) {
                    System.out.println("Erro: Telefone é obrigatório e deve conter exatamente 12 dígitos.");
                    JOptionPane.showMessageDialog(null, "Telefone é obrigatório e deve conter exatamente 12 dígitos.", "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                if (email.isEmpty() || email.length() > 50 || !email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$")) {
                    System.out.println("Erro: Email é obrigatório, deve ter no máximo 50 caracteres e estar no formato correto.");
                    JOptionPane.showMessageDialog(null, "Email é obrigatório, deve ter no máximo 50 caracteres e estar no formato correto.", "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                // Exibindo os dados no terminal
                System.out.println("Nome: " + nome);
                System.out.println("CPF/CNPJ: " + cpfCnpj);
                System.out.println("Telefone: " + telefone);
                System.out.println("E-mail: " + email);
                JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        cadastrarButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
        
        getContentPane().add(nomeLabel);
        getContentPane().add(nomeField);
        getContentPane().add(cpfCnpjLabel);
        getContentPane().add(cpfCnpjField);
        getContentPane().add(telefoneLabel);
        getContentPane().add(telefoneField);
        getContentPane().add(emailLabel);
        getContentPane().add(emailField);
        getContentPane().add(new JLabel());
        getContentPane().add(cadastrarButton);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ClientRegistration().setVisible(true));
    }
}
