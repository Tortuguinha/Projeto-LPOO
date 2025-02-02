package app.view;

import app.model.Company;

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

    private List<Company> companies = new ArrayList<>();

    public CompanyView() {
        setTitle("Cadastro de Empresas");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setLayout(new BorderLayout());

        // Painel do formulário
        JPanel panelForm = new JPanel(new GridLayout(5, 2, 10, 10));
        txtCompanyName = new JTextField();
        txtCnpj = new JTextField();
        txtPhone = new JTextField();
        txtAddress = new JTextField();
        txtEmail = new JTextField();

        JLabel label = new JLabel("Nome da Empresa:");
        label.setFont(new Font("Tahoma", Font.PLAIN, 14));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        panelForm.add(label);
        panelForm.add(txtCompanyName);
        JLabel label_1 = new JLabel("CNPJ:");
        label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
        label_1.setHorizontalAlignment(SwingConstants.CENTER);
        panelForm.add(label_1);
        panelForm.add(txtCnpj);
        JLabel label_2 = new JLabel("Telefone:");
        label_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
        label_2.setHorizontalAlignment(SwingConstants.CENTER);
        panelForm.add(label_2);
        panelForm.add(txtPhone);
        JLabel label_3 = new JLabel("Endereço:");
        label_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
        label_3.setHorizontalAlignment(SwingConstants.CENTER);
        panelForm.add(label_3);
        panelForm.add(txtAddress);
        JLabel label_4 = new JLabel("E-mail:");
        label_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
        label_4.setHorizontalAlignment(SwingConstants.CENTER);
        panelForm.add(label_4);
        panelForm.add(txtEmail);

        // Botões
        JPanel panelButtons = new JPanel(new FlowLayout());
        btnSave = new JButton("Salvar");
        btnSave.setForeground(SystemColor.textHighlight);
        btnSave.setFont(new Font("Tahoma", Font.PLAIN, 12));
        btnClear = new JButton("Limpar");
        btnClear.setForeground(SystemColor.textHighlight);
        btnClear.setFont(new Font("Tahoma", Font.PLAIN, 12));
        panelButtons.add(btnSave);
        panelButtons.add(btnClear);

        // Tabela de empresas
        tableModel = new DefaultTableModel(new String[]{"Empresa", "CNPJ", "Telefone", "Endereço", "E-mail"}, 0);
        tableCompanies = new JTable(tableModel);
        JScrollPane tableScroll = new JScrollPane(tableCompanies);

        getContentPane().add(panelForm, BorderLayout.NORTH);
        getContentPane().add(tableScroll, BorderLayout.CENTER);
        getContentPane().add(panelButtons, BorderLayout.SOUTH);

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
            Company company = new Company(companyName, cnpj, phone, address, email);
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
