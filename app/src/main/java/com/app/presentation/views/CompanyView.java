package com.app.presentation.views;

import com.app.domain.models.CompanyModel;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class CompanyView extends JFrame {
	private static final long serialVersionUID = 1L;
	private JTextField txtCompanyName;
    private JTextField txtCnpj;
    private JTextField txtPhone;
    private JTextField txtAddress;
    private JTextField txtEmail;
    private JButton btnSave, btnClear;
    private JTable tableCompanies;
    private DefaultTableModel tableModel;

    private List<CompanyModel> companies = new ArrayList<>();

    public CompanyView() {
        setTitle("Cadastro de Empresas");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Painel do formulário
        JPanel panelForm = new JPanel(new GridLayout(5, 2, 10, 10));
        txtCompanyName = new JTextField();
        txtCnpj = new JTextField();
        txtPhone = new JTextField();
        txtAddress = new JTextField();
        txtEmail = new JTextField();

        panelForm.add(new JLabel("Nome da Empresa:"));
        panelForm.add(txtCompanyName);
        panelForm.add(new JLabel("CNPJ:"));
        panelForm.add(txtCnpj);
        panelForm.add(new JLabel("Telefone:"));
        panelForm.add(txtPhone);
        panelForm.add(new JLabel("Endereço:"));
        panelForm.add(txtAddress);
        panelForm.add(new JLabel("E-mail:"));
        panelForm.add(txtEmail);

        // Botões
        JPanel panelButtons = new JPanel(new FlowLayout());
        btnSave = new JButton("Salvar");
        btnClear = new JButton("Limpar");
        panelButtons.add(btnSave);
        panelButtons.add(btnClear);

        // Tabela de empresas
        tableModel = new DefaultTableModel(new String[]{"Empresa", "CNPJ", "Telefone", "Endereço", "E-mail"}, 0);
        tableCompanies = new JTable(tableModel);
        JScrollPane tableScroll = new JScrollPane(tableCompanies);

        add(panelForm, BorderLayout.NORTH);
        add(tableScroll, BorderLayout.CENTER);
        add(panelButtons, BorderLayout.SOUTH);

        // Ações dos botões
        btnSave.addActionListener(e -> saveCompany());
        btnClear.addActionListener(e -> clearForm());
    }

    private void saveCompany() {
        try {
            String companyName = txtCompanyName.getText();
            String cnpj = txtCnpj.getText();
            String phone = txtPhone.getText();
            String address = txtAddress.getText();
            String email = txtEmail.getText();

            // Criar uma nova empresa
            CompanyModel company = new CompanyModel(companyName, cnpj, phone, address, email);
            companies.add(company);

            // Adicionar à tabela
            tableModel.addRow(new Object[]{companyName, cnpj, phone, address, email});
            JOptionPane.showMessageDialog(this, "Empresa salva com sucesso!");
            clearForm();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao salvar empresa: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void clearForm() {
        txtCompanyName.setText("");
        txtCnpj.setText("");
        txtPhone.setText("");
        txtAddress.setText("");
        txtEmail.setText("");
    }

}
