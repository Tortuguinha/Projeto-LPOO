package app.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmployeeRegistration extends JFrame {
    private JTextField nomeField, cpfCnpjField, telefoneField, emailField;
    private JButton cadastrarButton, voltarButton;
    private DashboardView parent;

    public EmployeeRegistration(DashboardView parent) {
        this.parent = parent;

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
                String nome = nomeField.getText();
                String cpfCnpj = cpfCnpjField.getText();
                String telefone = telefoneField.getText();
                String email = emailField.getText();

                // Validações
                if (nome.isEmpty() || nome.matches(".*\\d.*")) {
                    System.out.println("Erro: Nome é obrigatório e deve conter apenas letras.");
                    JOptionPane.showMessageDialog(null, "Nome é obrigatório e deve conter apenas letras.", "Erro", JOptionPane.ERROR_MESSAGE);
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
                JOptionPane.showMessageDialog(null, "Funcionário cadastrado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        getContentPane().add(cadastrarButton);

        voltarButton = new JButton("Voltar");
        voltarButton.setBounds(197, 320, 161, 39);
        voltarButton.setForeground(SystemColor.textHighlight);
        voltarButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
        voltarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Fecha a janela atual
                dispose();
                // Reabre a tela de dashboard
                parent.setVisible(true);
            }
        });
        getContentPane().add(voltarButton);
        
        JLabel label = new JLabel();
        label.setBounds(0, 372, 289, 88);
        getContentPane().add(label);
    }
}
