package com.app.presentation.views.clients;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.SystemColor;

public class Customerbudget<RequestQuote> {

    private JFrame frmOrcamentoCliente;
    private DefaultListModel<String> listModelServicos;
    private DefaultListModel<String> listModelEquipamentos;
    private JList<String> listServicos, listEquipamentos;
    private JTextField campoTextServico, campoTextCustomerName, campoTextCPF, campoTextTelephone, campoTextEmail, campoTextBrandModel, textFieldDefeito;

    

    public Customerbudget() {
        initialize();
    }

    private void initialize() {
        frmOrcamentoCliente = new JFrame("Orçamento Cliente");
        frmOrcamentoCliente.setBounds(100, 100, 800, 600);
        frmOrcamentoCliente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmOrcamentoCliente.getContentPane().setLayout(null);

        JLabel lblTitle = new JLabel("Orçamento Cliente", SwingConstants.CENTER);
        lblTitle.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblTitle.setBounds(250, 10, 300, 30);
        frmOrcamentoCliente.getContentPane().add(lblTitle);

        addLabelsAndFields();
        addServiceSection();
        addEquipmentSection();
        addButtons();
    }

    private void addLabelsAndFields() {
        JLabel lblCustomerName = new JLabel("Nome do Cliente:");
        lblCustomerName.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblCustomerName.setBounds(24, 50, 150, 25);
        frmOrcamentoCliente.getContentPane().add(lblCustomerName);
        
        campoTextCustomerName = new JTextField();
        campoTextCustomerName.setBounds(24, 75, 200, 25);
        frmOrcamentoCliente.getContentPane().add(campoTextCustomerName);
        
        JLabel lblCPF = new JLabel("CPF:");
        lblCPF.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblCPF.setBounds(24, 110, 100, 25);
        frmOrcamentoCliente.getContentPane().add(lblCPF);
        
        campoTextCPF = new JTextField();
        campoTextCPF.setBounds(24, 135, 200, 25);
        frmOrcamentoCliente.getContentPane().add(campoTextCPF);
        
        JLabel lblTelephone = new JLabel("Telefone:");
        lblTelephone.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblTelephone.setBounds(24, 170, 100, 25);
        frmOrcamentoCliente.getContentPane().add(lblTelephone);
        
        campoTextTelephone = new JTextField();
        campoTextTelephone.setBounds(24, 195, 200, 25);
        frmOrcamentoCliente.getContentPane().add(campoTextTelephone);
        
        JLabel lblEmail = new JLabel("Email:");
        lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblEmail.setBounds(24, 230, 100, 25);
        frmOrcamentoCliente.getContentPane().add(lblEmail);
        
        campoTextEmail = new JTextField();
        campoTextEmail.setBounds(24, 255, 200, 25);
        frmOrcamentoCliente.getContentPane().add(campoTextEmail);
        
        JLabel lblBrandModel = new JLabel("Marca/Modelo:");
        lblBrandModel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblBrandModel.setBounds(24, 290, 100, 25);
        frmOrcamentoCliente.getContentPane().add(lblBrandModel);
        
        campoTextBrandModel = new JTextField();
        campoTextBrandModel.setBounds(24, 315, 200, 25);
        frmOrcamentoCliente.getContentPane().add(campoTextBrandModel);
        
        JLabel lblDefeito = new JLabel("Defeito/Necessidade:");
        lblDefeito.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblDefeito.setBounds(24, 350, 150, 25);
        frmOrcamentoCliente.getContentPane().add(lblDefeito);
        
        textFieldDefeito = new JTextField();
        textFieldDefeito.setBounds(24, 375, 200, 25);
        frmOrcamentoCliente.getContentPane().add(textFieldDefeito);
    }

    private void addServiceSection() {
        JLabel lblServices = new JLabel("Serviços:");
        lblServices.setBounds(550, 50, 100, 25);
        frmOrcamentoCliente.getContentPane().add(lblServices);

        listModelServicos = new DefaultListModel<>();
        listServicos = new JList<>(listModelServicos);
        JScrollPane scrollPaneServicos = new JScrollPane(listServicos);
        scrollPaneServicos.setBounds(550, 75, 200, 150);
        frmOrcamentoCliente.getContentPane().add(scrollPaneServicos);

        campoTextServico = new JTextField();
        campoTextServico.setBounds(550, 240, 140, 25);
        frmOrcamentoCliente.getContentPane().add(campoTextServico);

        JButton btnAdicionarServico = new JButton("Adicionar");
        btnAdicionarServico.setForeground(SystemColor.textHighlight);
        btnAdicionarServico.setBounds(550, 270, 100, 30);
        frmOrcamentoCliente.getContentPane().add(btnAdicionarServico);

        btnAdicionarServico.addActionListener(e -> {
            String servico = campoTextServico.getText().trim();
            if (!servico.isEmpty() && listModelServicos.size() < 15) {
                listModelServicos.addElement(servico);
                campoTextServico.setText("");
            }
        });
    }

    private void addEquipmentSection() {
        JLabel lblEquipamentos = new JLabel("Equipamentos:");
        lblEquipamentos.setBounds(300, 50, 150, 25);
        frmOrcamentoCliente.getContentPane().add(lblEquipamentos);

        listModelEquipamentos = new DefaultListModel<>();
        listEquipamentos = new JList<>(listModelEquipamentos);
        JScrollPane scrollPaneEquipamentos = new JScrollPane(listEquipamentos);
        scrollPaneEquipamentos.setBounds(300, 75, 200, 150);
        frmOrcamentoCliente.getContentPane().add(scrollPaneEquipamentos);

        JComboBox<String> comboBoxEquipamentos = new JComboBox<>();
        comboBoxEquipamentos.setModel(new DefaultComboBoxModel<>(new String[]{"Desktop", "Celular", "Notebook", "Impressora"}));
        comboBoxEquipamentos.setBounds(300, 240, 140, 25);
        frmOrcamentoCliente.getContentPane().add(comboBoxEquipamentos);

        JButton btnAdicionarEquipamento = new JButton("Adicionar");
        btnAdicionarEquipamento.setForeground(SystemColor.textHighlight);
        btnAdicionarEquipamento.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnAdicionarEquipamento.setBounds(300, 270, 100, 30);
        frmOrcamentoCliente.getContentPane().add(btnAdicionarEquipamento);

        btnAdicionarEquipamento.addActionListener(e -> {
            String equipamento = comboBoxEquipamentos.getSelectedItem().toString();
            if (!equipamento.isEmpty() && listModelEquipamentos.size() < 1) {
                listModelEquipamentos.addElement(equipamento);
            }
        });
    }

    private void addButtons() {
        JButton btnVoltar = new JButton("Voltar");
        btnVoltar.setBounds(620, 450, 130, 30);
        frmOrcamentoCliente.getContentPane().add(btnVoltar);

//        btnVoltar.addActionListener(e -> {
//            RequestQuote requestQuote = new RequestQuote();
//            requestQuote.main(null);
//            frmOrcamentoCliente.dispose();
//        });

        JButton btnContinuar = new JButton("Continuar");
        btnContinuar.setBounds(620, 490, 130, 30);
        frmOrcamentoCliente.getContentPane().add(btnContinuar);

        btnContinuar.addActionListener(e -> {
            if (validarDados()) {
                JOptionPane.showMessageDialog(frmOrcamentoCliente, "Cliente cadastrado com sucesso!");
            }
        });
    }

    private boolean validarDados() {
        String email = campoTextEmail.getText().trim();
        if (email.length() > 50) {
            JOptionPane.showMessageDialog(frmOrcamentoCliente, "Email inválido. Máximo de 50 caracteres.");
            return false;
        }

        String cpf = campoTextCPF.getText().trim();
        if (!cpf.matches("\\d{11}")) {
            JOptionPane.showMessageDialog(frmOrcamentoCliente, "CPF inválido. Deve conter exatamente 11 dígitos.");
            return false;
        }

        String telefone = campoTextTelephone.getText().trim();
        if (!telefone.matches("\\d{11}")) {
            JOptionPane.showMessageDialog(frmOrcamentoCliente, "Telefone inválido. Deve conter exatamente 11 dígitos.");
            return false;
        }

        return true;
    }
}
