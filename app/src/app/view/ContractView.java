package app.view;

import app.model.Contract;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class ContractView extends JFrame {
    /**
	 * 
	 */
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

    private List<Contract> contracts = new ArrayList<>();

    public ContractView() {
        setTitle("Gestão de Contratos de Empresas");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Painel do formulário
        JPanel panelForm = new JPanel(new GridLayout(6, 2, 10, 10));
        txtCompanyName = new JTextField();
        txtCnpj = new JTextField();
        txtStartDate = new JTextField();
        txtEndDate = new JTextField();
        txtContractValue = new JTextField();
        txtObservations = new JTextArea(3, 20);

        panelForm.add(new JLabel("Nome da Empresa:"));
        panelForm.add(txtCompanyName);
        panelForm.add(new JLabel("CNPJ:"));
        panelForm.add(txtCnpj);
        panelForm.add(new JLabel("Data de Início (yyyy-MM-dd):"));
        panelForm.add(txtStartDate);
        panelForm.add(new JLabel("Data de Término (yyyy-MM-dd):"));
        panelForm.add(txtEndDate);
        panelForm.add(new JLabel("Valor do Contrato:"));
        panelForm.add(txtContractValue);
        panelForm.add(new JLabel("Observações:"));
        panelForm.add(new JScrollPane(txtObservations));

        // Botões
        JPanel panelButtons = new JPanel(new FlowLayout());
        btnSave = new JButton("Salvar");
        btnClear = new JButton("Limpar");
        panelButtons.add(btnSave);
        panelButtons.add(btnClear);

        // Tabela de contratos
        tableModel = new DefaultTableModel(new String[]{"Empresa", "CNPJ", "Início", "Término", "Valor"}, 0);
        tableContracts = new JTable(tableModel);
        JScrollPane tableScroll = new JScrollPane(tableContracts);

        add(panelForm, BorderLayout.NORTH);
        add(tableScroll, BorderLayout.CENTER);
        add(panelButtons, BorderLayout.SOUTH);

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

            Contract contract = new Contract(companyName, cnpj, startDate, endDate, contractValue, observations);
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
