package app.view;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;

public class EditClient extends JFrame {
    private Client client;

    public EditClient(ClientGerency clientGerency, Client client) {
        this.client = client;
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
        JTextField nomeField = new JTextField(client.getNome());
        nomeField.setBounds(192, 30, 332, 46);
        nomeField.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(nomeField);

        // Campo para Email
        JLabel lblEmail = new JLabel("Email :");
        lblEmail.setBounds(30, 72, 172, 58);
        lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(lblEmail);
        JTextField emailField = new JTextField(client.getEmail());
        emailField.setBounds(192, 80, 332, 46);
        emailField.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(emailField);

        // Campo para Telefone
        JLabel label_2 = new JLabel("Telefone:");
        label_2.setBounds(30, 125, 158, 48);
        label_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
        label_2.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(label_2);
        JTextField telefoneField = new JTextField(client.getTelefone());
        telefoneField.setBounds(192, 128, 332, 46);
        telefoneField.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(telefoneField);

        // Campo para Status
        JLabel label = new JLabel("Status:");
        label.setBounds(52, 177, 117, 48);
        label.setFont(new Font("Tahoma", Font.PLAIN, 14));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(label);
        JTextField statusField = new JTextField(client.getStatus());
        statusField.setBounds(192, 179, 332, 48);
        statusField.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(statusField);

        // Botão para salvar as alterações
        JButton saveButton = new JButton("Salvar");
        saveButton.setBounds(409, 306, 117, 35);
        saveButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
        saveButton.addActionListener(e -> {
            // Validações
            String nome = nomeField.getText();
            String email = emailField.getText();
            String telefone = telefoneField.getText();
            String status = statusField.getText();

            if (nome.isEmpty() || nome.matches(".*\\d.*")) {
                System.out.println("Erro: Nome é obrigatório e deve conter apenas letras.");
                JOptionPane.showMessageDialog(this, "Nome é obrigatório e deve conter apenas letras.", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (email.isEmpty() || email.length() > 50 || !email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$")) {
                System.out.println("Erro: Email é obrigatório, deve ter no máximo 50 caracteres e estar no formato correto.");
                JOptionPane.showMessageDialog(this, "Email é obrigatório, deve ter no máximo 50 caracteres e estar no formato correto.", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (telefone.isEmpty() || telefone.length() != 12 || !telefone.matches("\\d+")) {
                System.out.println("Erro: Telefone é obrigatório e deve conter exatamente 12 dígitos.");
                JOptionPane.showMessageDialog(this, "Telefone é obrigatório e deve conter exatamente 12 dígitos.", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (status.isEmpty() || status.length() > 8 || status.matches(".*\\d.*")) {
                System.out.println("Erro: Status é obrigatório, deve conter apenas letras e ter no máximo 8 caracteres.");
                JOptionPane.showMessageDialog(this, "Status é obrigatório, deve conter apenas letras e ter no máximo 8 caracteres.", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Lógica para salvar as alterações
            client.setNome(nome);
            client.setEmail(email);
            client.setTelefone(telefone);
            client.setStatus(status);

            // Mensagem de confirmação
            JOptionPane.showMessageDialog(this, "Cliente atualizado!");
            dispose(); // Fecha a tela de edição
        });

        // Adicionando os campos e botão ao painel
        JLabel label_4 = new JLabel();
        label_4.setBounds(0, 306, 292, 76);
        panel.add(label_4); // Campo vazio para alinhamento
        panel.add(saveButton);

        // Adiciona o painel à janela
        getContentPane().add(panel);
    }

    public static void main(String[] args) {
        Client client = new Client("Nome Exemplo", "email@example.com", "123456789012", "Ativo");
        EditClient editClient = new EditClient(client);
        editClient.setVisible(true);
    }
}
