package app.view;

import javax.swing.*;
import java.awt.*;

public class EmployeeRegistration extends JFrame {
    

	public EmployeeRegistration () {
        setTitle("Cadastro de Funcionário");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new GridLayout(7, 2, 5, 5));

        // Componentes da interface
        JLabel lblNome = new JLabel("Nome:");
        lblNome.setHorizontalAlignment(SwingConstants.CENTER);
        JTextField txtNome = new JTextField();

        JLabel lblCPF = new JLabel("CPF:");
        lblCPF.setHorizontalAlignment(SwingConstants.CENTER);
        JTextField txtCPF = new JTextField();

        JLabel lblCargo = new JLabel("Cargo:");
        lblCargo.setHorizontalAlignment(SwingConstants.CENTER);
        JTextField txtCargo = new JTextField();

        JLabel lblDataNascimento = new JLabel("Data de Nascimento:");
        lblDataNascimento.setHorizontalAlignment(SwingConstants.CENTER);
        JTextField txtDataNascimento = new JTextField();

        JLabel lblEndereco = new JLabel("Endereço:");
        lblEndereco.setHorizontalAlignment(SwingConstants.CENTER);
        JTextField txtEndereco = new JTextField();

        JLabel lblTelefone = new JLabel("Telefone:");
        lblTelefone.setHorizontalAlignment(SwingConstants.CENTER);
        JTextField txtTelefone = new JTextField();

        JButton btnSalvar = new JButton("Salvar");

        // Adicionando componentes à janela
        getContentPane().add(lblNome);
        getContentPane().add(txtNome);
        getContentPane().add(lblCPF);
        getContentPane().add(txtCPF);
        getContentPane().add(lblCargo);
        getContentPane().add(txtCargo);
        getContentPane().add(lblDataNascimento);
        getContentPane().add(txtDataNascimento);
        getContentPane().add(lblEndereco);
        getContentPane().add(txtEndereco);
        getContentPane().add(lblTelefone);
        getContentPane().add(txtTelefone);
        getContentPane().add(new JLabel()); // Espaço vazio
        getContentPane().add(btnSalvar);

        setLocationRelativeTo(null); // Centraliza a janela
        setVisible(true);
    }

    public static void main(String[] args) {
        new EmployeeRegistration ();
    }
}
