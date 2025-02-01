package app.view;

import javax.swing.*;
import java.awt.*;

public class EmployeeRegistration extends JFrame {
    public EmployeeRegistration () {
        setTitle("Cadastro de Funcionário");
        setSize(350, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new GridLayout(7, 2, 5, 5));

        // Componentes da interface
        JLabel lblNome = new JLabel("Nome:");
        JTextField txtNome = new JTextField();

        JLabel lblCPF = new JLabel("CPF:");
        JTextField txtCPF = new JTextField();

        JLabel lblCargo = new JLabel("Cargo:");
        JTextField txtCargo = new JTextField();

        JLabel lblDataNascimento = new JLabel("Data de Nascimento:");
        JTextField txtDataNascimento = new JTextField();

        JLabel lblEndereco = new JLabel("Endereço:");
        JTextField txtEndereco = new JTextField();

        JLabel lblTelefone = new JLabel("Telefone:");
        JTextField txtTelefone = new JTextField();

        JButton btnSalvar = new JButton("Salvar");

        // Adicionando componentes à janela
        add(lblNome);
        add(txtNome);
        add(lblCPF);
        add(txtCPF);
        add(lblCargo);
        add(txtCargo);
        add(lblDataNascimento);
        add(txtDataNascimento);
        add(lblEndereco);
        add(txtEndereco);
        add(lblTelefone);
        add(txtTelefone);
        add(new JLabel()); // Espaço vazio
        add(btnSalvar);

        setLocationRelativeTo(null); // Centraliza a janela
        setVisible(true);
    }

    public static void main(String[] args) {
        new EmployeeRegistration ();
    }
}
