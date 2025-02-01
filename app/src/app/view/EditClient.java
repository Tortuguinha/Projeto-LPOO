package app.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EditClient extends JFrame {
    private static final long serialVersionUID = 1L;

    private JTextField txtNome, txtEmail, txtTelefone;
    private JComboBox<String> cmbStatus;
    private JButton btnSalvar, btnCancelar;
    private Client client;

    public EditClient(JFrame parent, Client client) {
        this.client = client;
//
        // Configurações da janela
        setTitle("Editar Cliente");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(parent);
        setLayout(new GridLayout(5, 2));

        // Adicionando os campos de edição
        JLabel lblNome = new JLabel("Nome:");
        JLabel lblEmail = new JLabel("Email:");
        JLabel lblTelefone = new JLabel("Telefone:");
        JLabel lblStatus = new JLabel("Status:");

        txtNome = new JTextField(client.getNome());
        txtEmail = new JTextField(client.getEmail());
        txtTelefone = new JTextField(client.getTelefone());

        String[] statusOptions = {"Ativo", "Inativo"};
        cmbStatus = new JComboBox<>(statusOptions);
        cmbStatus.setSelectedItem(client.getStatus());

        btnSalvar = new JButton("Salvar");
        btnCancelar = new JButton("Cancelar");

        // Ação para salvar as alterações
        btnSalvar.addActionListener(e -> {
            String nome = txtNome.getText();
            String email = txtEmail.getText();
            String telefone = txtTelefone.getText();
            String status = (String) cmbStatus.getSelectedItem();

            // Atualizando o cliente com os novos valores
            client = new Client(client.getId(), nome, email, telefone, status);

            // Fechar a tela de edição
            JOptionPane.showMessageDialog(this, "Cliente editado com sucesso!");
            dispose();
        });

        // Ação para cancelar
        btnCancelar.addActionListener(e -> {
            dispose(); // Apenas fecha a janela de edição sem salvar
        });

        // Adicionando os componentes à tela
        add(lblNome);
        add(txtNome);
        add(lblEmail);
        add(txtEmail);
        add(lblTelefone);
        add(txtTelefone);
        add(lblStatus);
        add(cmbStatus);
        add(btnSalvar);
        add(btnCancelar);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Client client = new Client(1, "João Silva", "joao@exemplo.com", "123456789", "Ativo");
            new EditClient(null, client).setVisible(true);
        });
    }
}
