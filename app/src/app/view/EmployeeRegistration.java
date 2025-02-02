package app.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EmployeeRegistration extends JFrame {

    public EmployeeRegistration() {
        setTitle("Cadastro de Funcionário");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new GridLayout(7, 2, 5, 5));

        // Componentes da interface
        JLabel lblNome = new JLabel("Nome:");
        lblNome.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNome.setHorizontalAlignment(SwingConstants.CENTER);
        JTextField txtNome = new JTextField();
        txtNome.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel lblCPF = new JLabel("CPF:");
        lblCPF.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblCPF.setHorizontalAlignment(SwingConstants.CENTER);
        JTextField txtCPF = new JTextField();
        txtCPF.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel lblCargo = new JLabel("Cargo:");
        lblCargo.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblCargo.setHorizontalAlignment(SwingConstants.CENTER);
        JTextField txtCargo = new JTextField();
        txtCargo.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel lblDataNascimento = new JLabel("Data de Nascimento:");
        lblDataNascimento.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblDataNascimento.setHorizontalAlignment(SwingConstants.CENTER);
        JTextField txtDataNascimento = new JTextField();
        txtDataNascimento.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel lblEndereco = new JLabel("Endereço:");
        lblEndereco.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblEndereco.setHorizontalAlignment(SwingConstants.CENTER);
        JTextField txtEndereco = new JTextField();
        txtEndereco.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel lblTelefone = new JLabel("Telefone:");
        lblTelefone.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblTelefone.setHorizontalAlignment(SwingConstants.CENTER);
        JTextField txtTelefone = new JTextField();
        txtTelefone.setHorizontalAlignment(SwingConstants.CENTER);

        JButton btnSalvar = new JButton("Salvar");
        btnSalvar.setForeground(SystemColor.textHighlight);
        btnSalvar.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnSalvar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nome = txtNome.getText();
                String cpf = txtCPF.getText();
                String cargo = txtCargo.getText();
                String dataNascimento = txtDataNascimento.getText();
                String endereco = txtEndereco.getText();
                String telefone = txtTelefone.getText();

                // Validações
                if (nome.isEmpty() || nome.length() > 100 || nome.matches(".*\\d.*")) {
                    System.out.println("Erro: Nome é obrigatório, deve conter apenas letras e ter no máximo 100 caracteres.");
                    JOptionPane.showMessageDialog(null, "Nome é obrigatório, deve conter apenas letras e ter no máximo 100 caracteres.", "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                if (cpf.isEmpty() || !cpf.matches("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}")) {
                    System.out.println("Erro: CPF é obrigatório e deve estar no formato XXX.XXX.XXX-XX.");
                    JOptionPane.showMessageDialog(null, "CPF é obrigatório e deve estar no formato XXX.XXX.XXX-XX.", "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                if (cargo.isEmpty() || cargo.length() > 60 || cargo.matches(".*\\d.*")) {
                    System.out.println("Erro: Cargo é obrigatório, deve conter apenas letras e ter no máximo 60 caracteres.");
                    JOptionPane.showMessageDialog(null, "Cargo é obrigatório, deve conter apenas letras e ter no máximo 60 caracteres.", "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                if (!dataNascimento.matches("\\d{2}/\\d{2}/\\d{4}") || !validarData(dataNascimento)) {
                    System.out.println("Erro: Data de Nascimento deve estar no formato DD/MM/AAAA e ser válida.");
                    JOptionPane.showMessageDialog(null, "Data de Nascimento deve estar no formato DD/MM/AAAA e ser válida.", "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                if (endereco.isEmpty() || endereco.matches(".*\\d.*")) {
                    System.out.println("Erro: Endereço é obrigatório e deve conter apenas letras.");
                    JOptionPane.showMessageDialog(null, "Endereço é obrigatório e deve conter apenas letras.", "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                if (telefone.isEmpty() || telefone.length() != 11 || !telefone.matches("\\d+")) {
                    System.out.println("Erro: Telefone é obrigatório e deve conter exatamente 12 dígitos.");
                    JOptionPane.showMessageDialog(null, "Telefone é obrigatório e deve conter exatamente 12 dígitos.", "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                // Exibindo os dados no terminal
                System.out.println("Nome: " + nome);
                System.out.println("CPF: " + cpf);
                System.out.println("Cargo: " + cargo);
                System.out.println("Data de Nascimento: " + dataNascimento);
                System.out.println("Endereço: " + endereco);
                System.out.println("Telefone: " + telefone);
            }
        });

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

    private boolean validarData(String data) {
        String[] partes = data.split("/");
        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);
        int ano = Integer.parseInt(partes[2]);

        if (mes < 1 || mes > 12 || dia < 1 || dia > 31 || ano != 2025) {
            return false;
        }

        // Verifica os dias máximos de cada mês
        if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) {
            return false;
        }
        if (mes == 2) {
            if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
                if (dia > 29) {
                    return false;
                }
            } else {
                if (dia > 28) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        new EmployeeRegistration();
    }
}
