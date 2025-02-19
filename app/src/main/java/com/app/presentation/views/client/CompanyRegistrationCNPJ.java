package com.app.presentation.views.client;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.regex.Pattern;
import javax.swing.*;

public class CompanyRegistrationCNPJ {

    private JFrame frmCadastroDeEmpresa;
    private JTextField campoNomeEmpresa, campoCNPJ, campoTelefone, campoEmail, campoCidade, campoRua, campoComplemento, campoBairro, campoEquipamento;
    private DefaultListModel<String> listaEquipamentosModel;
    private JList<String> listaEquipamentos;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                CompanyRegistrationCNPJ window = new CompanyRegistrationCNPJ();
                window.frmCadastroDeEmpresa.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public CompanyRegistrationCNPJ() {
        initialize();
    }

    private void initialize() {
        frmCadastroDeEmpresa = new JFrame();
        frmCadastroDeEmpresa.setTitle("Cadastro de Empresa");
        frmCadastroDeEmpresa.setBounds(100, 100, 750, 550);
        frmCadastroDeEmpresa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmCadastroDeEmpresa.getContentPane().setLayout(null);

        JLabel lblDados = new JLabel("Dados da Empresa");
        lblDados.setBounds(44, 20, 150, 30);
        lblDados.setFont(new Font("Tahoma", Font.BOLD, 14));
        frmCadastroDeEmpresa.getContentPane().add(lblDados);

        JLabel lblNomeEmpresa = new JLabel("Nome da Empresa:");
        lblNomeEmpresa.setBounds(44, 60, 150, 25);
        lblNomeEmpresa.setFont(new Font("Tahoma", Font.PLAIN, 14));
        frmCadastroDeEmpresa.getContentPane().add(lblNomeEmpresa);

        campoNomeEmpresa = new JTextField();
        campoNomeEmpresa.setBounds(44, 85, 250, 25);
        frmCadastroDeEmpresa.getContentPane().add(campoNomeEmpresa);

        JLabel lblCNPJ = new JLabel("CNPJ:");
        lblCNPJ.setBounds(44, 120, 150, 25);
        lblCNPJ.setFont(new Font("Tahoma", Font.PLAIN, 14));
        frmCadastroDeEmpresa.getContentPane().add(lblCNPJ);

        campoCNPJ = new JTextField();
        campoCNPJ.setBounds(44, 145, 250, 25);
        frmCadastroDeEmpresa.getContentPane().add(campoCNPJ);

        JLabel lblTelefone = new JLabel("Telefone:");
        lblTelefone.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblTelefone.setBounds(44, 180, 150, 25);
        frmCadastroDeEmpresa.getContentPane().add(lblTelefone);

        campoTelefone = new JTextField();
        campoTelefone.setBounds(44, 205, 250, 25);
        frmCadastroDeEmpresa.getContentPane().add(campoTelefone);

        JLabel lblEmail = new JLabel("Email:");
        lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblEmail.setBounds(44, 240, 150, 25);
        frmCadastroDeEmpresa.getContentPane().add(lblEmail);

        campoEmail = new JTextField();
        campoEmail.setBounds(44, 265, 250, 25);
        frmCadastroDeEmpresa.getContentPane().add(campoEmail);

        JLabel lblEndereco = new JLabel("Endereço");
        lblEndereco.setBounds(350, 20, 100, 30);
        lblEndereco.setFont(new Font("Tahoma", Font.BOLD, 14));
        frmCadastroDeEmpresa.getContentPane().add(lblEndereco);

        JLabel lblCidade = new JLabel("Cidade:");
        lblCidade.setBounds(350, 60, 150, 25);
        lblCidade.setFont(new Font("Tahoma", Font.PLAIN, 14));
        frmCadastroDeEmpresa.getContentPane().add(lblCidade);

        campoCidade = new JTextField();
        campoCidade.setBounds(350, 85, 250, 25);
        frmCadastroDeEmpresa.getContentPane().add(campoCidade);

        JLabel lblRua = new JLabel("Rua:");
        lblRua.setBounds(350, 120, 150, 25);
        lblRua.setFont(new Font("Tahoma", Font.PLAIN, 14));
        frmCadastroDeEmpresa.getContentPane().add(lblRua);

        campoRua = new JTextField();
        campoRua.setBounds(350, 145, 250, 25);
        frmCadastroDeEmpresa.getContentPane().add(campoRua);

        JLabel lblBairro = new JLabel("Bairro:");
        lblBairro.setBounds(350, 180, 150, 25);
        lblBairro.setFont(new Font("Tahoma", Font.PLAIN, 14));
        frmCadastroDeEmpresa.getContentPane().add(lblBairro);

        campoBairro = new JTextField();
        campoBairro.setBounds(350, 205, 250, 25);
        frmCadastroDeEmpresa.getContentPane().add(campoBairro);

        JLabel lblEquipamentos = new JLabel("Equipamentos:");
        lblEquipamentos.setBounds(44, 300, 150, 25);
        frmCadastroDeEmpresa.getContentPane().add(lblEquipamentos);

        campoEquipamento = new JTextField();
        campoEquipamento.setBounds(44, 325, 250, 25);
        frmCadastroDeEmpresa.getContentPane().add(campoEquipamento);

        JButton btnAdicionarEquipamento = new JButton("Adicionar");
        btnAdicionarEquipamento.setBounds(299, 325, 100, 25);
        btnAdicionarEquipamento.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnAdicionarEquipamento.setForeground(SystemColor.textHighlight);
        frmCadastroDeEmpresa.getContentPane().add(btnAdicionarEquipamento);

        listaEquipamentosModel = new DefaultListModel<>();
        listaEquipamentos = new JList<>(listaEquipamentosModel);
        JScrollPane scrollPane = new JScrollPane(listaEquipamentos);
        scrollPane.setBounds(44, 360, 250, 100);
        frmCadastroDeEmpresa.getContentPane().add(scrollPane);

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
        frmCadastroDeEmpresa.getContentPane().add(btnCadastrar);

        btnCadastrar.addActionListener(e -> {
            if (validarDados()) {
                JOptionPane.showMessageDialog(frmCadastroDeEmpresa, "Empresa cadastrada com sucesso!");
            }
        });
    }

    private boolean validarDados() {
        if (!campoCNPJ.getText().matches("\\d{14}")) {
            JOptionPane.showMessageDialog(frmCadastroDeEmpresa, "CNPJ deve conter 14 dígitos.", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (!isValidEmail(campoEmail.getText())) {
            JOptionPane.showMessageDialog(frmCadastroDeEmpresa, "Email inválido.", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    private boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        return Pattern.compile(emailRegex).matcher(email).matches();
    }
}
