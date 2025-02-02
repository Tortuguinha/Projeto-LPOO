package app.view;

import javax.swing.*;
import java.awt.*;

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
        JLabel cpfCnpjLabel = new JLabel("CPF/CNPJ:");
        cpfCnpjLabel.setHorizontalAlignment(SwingConstants.CENTER);
        cpfCnpjLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        cpfCnpjField = new JTextField();
        JLabel telefoneLabel = new JLabel("Telefone:");
        telefoneLabel.setHorizontalAlignment(SwingConstants.CENTER);
        telefoneLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        telefoneField = new JTextField();
        JLabel emailLabel = new JLabel("E-mail:");
        emailLabel.setHorizontalAlignment(SwingConstants.CENTER);
        emailLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        emailField = new JTextField();
        cadastrarButton = new JButton("Cadastrar");
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
