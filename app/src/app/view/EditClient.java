// EditClient.java
package app.view;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class EditClient extends JFrame {
    private Client client;

    public EditClient(JFrame parent, Client client) {
        this.client = client;
        setTitle("Editar Cliente");
        setSize(600, 500);
        setLocationRelativeTo(parent);

        // Painel para os campos de edição
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 2)); // Para organizar melhor os campos e botões

        // Campo para Nome
        panel.add(new JLabel("Nome:"));
        JTextField nomeField = new JTextField(client.getNome());
        nomeField.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(nomeField);

        // Campo para Email
        panel.add(new JLabel("Email:"));
        JTextField emailField = new JTextField(client.getEmail());
        emailField.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(emailField);

        // Campo para Telefone
        panel.add(new JLabel("Telefone:"));
        JTextField telefoneField = new JTextField(client.getTelefone());
        telefoneField.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(telefoneField);

        // Campo para Status
        JLabel label = new JLabel("Status:");
        label.setHorizontalAlignment(SwingConstants.LEFT);
        panel.add(label);
        JTextField statusField = new JTextField(client.getStatus());
        statusField.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(statusField);

        // Botão para salvar as alterações
        JButton saveButton = new JButton("Salvar");
        saveButton.addActionListener(e -> {
            // Lógica para salvar as alterações
            client.setNome(nomeField.getText());
            client.setEmail(emailField.getText());
            client.setTelefone(telefoneField.getText());
            client.setStatus(statusField.getText());

            // Mensagem de confirmação
            JOptionPane.showMessageDialog(this, "Cliente atualizado!");
            dispose(); // Fecha a tela de edição
        });

        // Adicionando os campos e botão ao painel
        panel.add(new JLabel()); // Campo vazio para alinhamento
        panel.add(saveButton);

        // Adiciona o painel à janela
        getContentPane().add(panel);
    }
}
