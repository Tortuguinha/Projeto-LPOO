package com.app.presentation.views.clients.company;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;
import javax.swing.*;

public class CompanyRegistrationView extends JFrame {

    private JTextField campoNomeEmpresa, campoCNPJ, campoTelefone, campoEmail, campoCidade, campoRua, campoComplemento, campoBairro, campoEquipamento;
    private DefaultListModel<String> listaEquipamentosModel;
    private JList<String> listaEquipamentos;

    public CompanyRegistrationView() {
        setTitle("Cadastro de Empresa");
        setBounds(100, 100, 750, 550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel contentPane = new JPanel();
        contentPane.setLayout(null);
        setContentPane(contentPane);

        JLabel lblDados = new JLabel("Dados da Empresa");
        lblDados.setBounds(44, 20, 150, 30);
        lblDados.setFont(new Font("Tahoma", Font.BOLD, 14));
        contentPane.add(lblDados);

        JLabel lblNomeEmpresa = new JLabel("Nome da Empresa:");
        lblNomeEmpresa.setBounds(44, 60, 150, 25);
        lblNomeEmpresa.setFont(new Font("Tahoma", Font.PLAIN, 14));
        contentPane.add(lblNomeEmpresa);

        campoNomeEmpresa = new JTextField();
        campoNomeEmpresa.setBounds(44, 85, 250, 25);
        contentPane.add(campoNomeEmpresa);

        JLabel lblCNPJ = new JLabel("CNPJ:");
        lblCNPJ.setBounds(44, 120, 150, 25);
        lblCNPJ.setFont(new Font("Tahoma", Font.PLAIN, 14));
        contentPane.add(lblCNPJ);

        campoCNPJ = new JTextField();
        campoCNPJ.setBounds(44, 145, 250, 25);
        contentPane.add(campoCNPJ);

        JLabel lblTelefone = new JLabel("Telefone:");
        lblTelefone.setBounds(44, 180, 150, 25);
        lblTelefone.setFont(new Font("Tahoma", Font.PLAIN, 14));
        contentPane.add(lblTelefone);

        campoTelefone = new JTextField();
        campoTelefone.setBounds(44, 205, 250, 25);
        contentPane.add(campoTelefone);

        JLabel lblEmail = new JLabel("Email:");
        lblEmail.setBounds(44, 240, 150, 25);
        lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 14));
        contentPane.add(lblEmail);

        campoEmail = new JTextField();
        campoEmail.setBounds(44, 265, 250, 25);
        contentPane.add(campoEmail);

        JLabel lblEquipamentos = new JLabel("Equipamentos:");
        lblEquipamentos.setBounds(44, 300, 150, 25);
        contentPane.add(lblEquipamentos);

        campoEquipamento = new JTextField();
        campoEquipamento.setBounds(44, 325, 250, 25);
        contentPane.add(campoEquipamento);

        JButton btnAdicionarEquipamento = new JButton("Adicionar");
        btnAdicionarEquipamento.setBounds(299, 325, 100, 25);
        btnAdicionarEquipamento.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnAdicionarEquipamento.setForeground(SystemColor.textHighlight);
        contentPane.add(btnAdicionarEquipamento);

        listaEquipamentosModel = new DefaultListModel<>();
        listaEquipamentos = new JList<>(listaEquipamentosModel);
        JScrollPane scrollPane = new JScrollPane(listaEquipamentos);
        scrollPane.setBounds(44, 360, 250, 100);
        contentPane.add(scrollPane);

        btnAdicionarEquipamento.addActionListener(e -> {
            String equipamento = campoEquipamento.getText().trim();
            if (!equipamento.isEmpty()) {
                listaEquipamentosModel.addElement(equipamento);
                campoEquipamento.setText("");
            }
        });

        JButton btnCadastrar = new JButton("Cadastrar");
        btnCadastrar.setBounds(470, 381, 150, 30);
        btnCadastrar.setForeground(SystemColor.textHighlight);
        contentPane.add(btnCadastrar);

        btnCadastrar.addActionListener(e -> {
            if (validarDados()) {
                JOptionPane.showMessageDialog(this, "Empresa cadastrada com sucesso!");
            }
        });
    }

    private boolean validarDados() {
        if (!campoCNPJ.getText().matches("\\d{14}")) {
            JOptionPane.showMessageDialog(this, "CNPJ deve conter 14 dígitos.", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (!isValidEmail(campoEmail.getText())) {
            JOptionPane.showMessageDialog(this, "Email inválido.", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    private boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        return Pattern.compile(emailRegex).matcher(email).matches();
    }
}
