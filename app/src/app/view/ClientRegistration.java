package app.view;

import javax.swing.*;
import java.awt.*;

public class ClientRegistration extends JFrame {
    private JTextField nomeField, cpfCnpjField, telefoneField, emailField;
    private JButton cadastrarButton;
    
    public ClientRegistration() {
        setTitle("Cadastro de Cliente");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(5, 2, 5, 5));
        
        JLabel nomeLabel = new JLabel("Nome:");
        nomeField = new JTextField();
        JLabel cpfCnpjLabel = new JLabel("CPF/CNPJ:");
        cpfCnpjField = new JTextField();
        JLabel telefoneLabel = new JLabel("Telefone:");
        telefoneField = new JTextField();
        JLabel emailLabel = new JLabel("E-mail:");
        emailField = new JTextField();
        cadastrarButton = new JButton("Cadastrar");
        
        add(nomeLabel);
        add(nomeField);
        add(cpfCnpjLabel);
        add(cpfCnpjField);
        add(telefoneLabel);
        add(telefoneField);
        add(emailLabel);
        add(emailField);
        add(new JLabel());
        add(cadastrarButton);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ClientRegistration().setVisible(true));
    }
}
