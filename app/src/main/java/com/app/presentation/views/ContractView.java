package com.app.presentation.views;

import com.app.domain.models.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class ContractView extends JFrame {
	private static final long serialVersionUID = 1L;
	private JTextField txtCompanyName;
    private JTextField txtCnpj;
    private JTextField txtStartDate;
    private JTextField txtEndDate;
    private JTextField txtContractValue;
    private JTextArea txtObservations;
    private JButton btnSave, btnClear;
    private JTable tableContracts;
    private DefaultTableModel tableModel;

    private List<ContractModel> contracts = new ArrayList<>();

    public ContractView() {
        setTitle("Gestão de Contratos de Empresas");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setLayout(new BorderLayout());

        // Painel do formulário
        JPanel panelForm = new JPanel(new GridLayout(6, 2, 10, 10));
        txtCompanyName = new JTextField();
        txtCnpj = new JTextField();
        txtStartDate = new JTextField();
        txtEndDate = new JTextField();
        txtContractValue = new JTextField();
        txtObservations = new JTextArea(3, 20);

        JLabel label_4 = new JLabel("Nome da Empresa:");
        label_4.setHorizontalAlignment(SwingConstants.CENTER);
        label_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
        panelForm.add(label_4);
        panelForm.add(txtCompanyName);
        JLabel label_3 = new JLabel("CNPJ:");
        label_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
        label_3.setHorizontalAlignment(SwingConstants.CENTER);
        panelForm.add(label_3);
        panelForm.add(txtCnpj);
        JLabel label = new JLabel("Data de Início \r\n");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setFont(new Font("Tahoma", Font.PLAIN, 15));
        panelForm.add(label);
        panelForm.add(txtStartDate);
        JLabel lblDataDeTrmino = new JLabel("Data de Término\r\n");
        lblDataDeTrmino.setHorizontalAlignment(SwingConstants.CENTER);
        lblDataDeTrmino.setFont(new Font("Tahoma", Font.PLAIN, 14));
        panelForm.add(lblDataDeTrmino);
        panelForm.add(txtEndDate);
        JLabel label_2 = new JLabel("Valor do Contrato:");
        label_2.setHorizontalAlignment(SwingConstants.CENTER);
        label_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
        panelForm.add(label_2);
        panelForm.add(txtContractValue);
        JLabel label_1 = new JLabel("Observações:");
        label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
        label_1.setHorizontalAlignment(SwingConstants.CENTER);
        panelForm.add(label_1);
        panelForm.add(new JScrollPane(txtObservations));

        // Botões
        JPanel panelButtons = new JPanel(new FlowLayout());
        btnSave = new JButton("Salvar");
        btnSave.setForeground(SystemColor.textHighlight);
        btnSave.setFont(new Font("Tahoma", Font.PLAIN, 13));
        btnClear = new JButton("Limpar");
        btnClear.setForeground(SystemColor.textHighlight);
        panelButtons.add(btnSave);
        panelButtons.add(btnClear);

        // Tabela de contratos
        tableModel = new DefaultTableModel(new String[]{"Empresa", "CNPJ", "Início", "Término", "Valor"}, 0);
        tableContracts = new JTable(tableModel);
        JScrollPane tableScroll = new JScrollPane(tableContracts);

        getContentPane().add(panelForm, BorderLayout.NORTH);
        getContentPane().add(tableScroll, BorderLayout.CENTER);
        getContentPane().add(panelButtons, BorderLayout.SOUTH);

        // Ações dos botões
        btnSave.addActionListener(e -> saveContract());
        btnClear.addActionListener(e -> clearForm());
    }

    private void saveContract() {
        try {
            String companyName = txtCompanyName.getText();
            String cnpj = txtCnpj.getText();
            LocalDate startDate = LocalDate.parse(txtStartDate.getText(), DateTimeFormatter.ISO_DATE);
            LocalDate endDate = LocalDate.parse(txtEndDate.getText(), DateTimeFormatter.ISO_DATE);
            double contractValue = Double.parseDouble(txtContractValue.getText());
            String observations = txtObservations.getText();

            ContractModel contract = new ContractModel(companyName, cnpj, startDate, endDate, contractValue, observations);
            contracts.add(contract);

            // Adicionar à tabela
            tableModel.addRow(new Object[]{companyName, cnpj, startDate, endDate, contractValue});
            JOptionPane.showMessageDialog(this, "Contrato salvo com sucesso!");
            clearForm();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao salvar contrato: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void clearForm() {
        txtCompanyName.setText("");
        txtCnpj.setText("");
        txtStartDate.setText("");
        txtEndDate.setText("");
        txtContractValue.setText("");
        txtObservations.setText("");
    }
}
