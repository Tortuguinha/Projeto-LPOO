package com.app.presentation.views.client;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.app.domain.entities.employee.EmployeeEntity;
import com.app.presentation.views.DashboardView;

public class CustomerRegistration {

    private JFrame frmCadastroDePessoa;
    private JTextField CampoNomeDeEmpresa;
    private JTextField CampoCNPJ;
    private JTextField CampoTelefone;
    private JTextField CampoEmail;
    private JTextField CampoCidade;
    private JTextField CampoRua;
    private JTextField CampoComplemento;
    private JTextField CampoBairro;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                CustomerRegistration window = new CustomerRegistration();
                window.frmCadastroDePessoa.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public CustomerRegistration() {
        initialize();
    }

    private void initialize() {
        frmCadastroDePessoa = new JFrame();
        frmCadastroDePessoa.setTitle("Cadastro de Pessoa Jurídica (CNPJ)");
        frmCadastroDePessoa.setBounds(100, 100, 701, 520);
        frmCadastroDePessoa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmCadastroDePessoa.getContentPane().setLayout(null);

        JLabel lblNomeDeEmpresa = new JLabel("Nome De Empresa");
        lblNomeDeEmpresa.setForeground(SystemColor.textHighlight);
        lblNomeDeEmpresa.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNomeDeEmpresa.setBounds(44, 77, 119, 27);
        frmCadastroDePessoa.getContentPane().add(lblNomeDeEmpresa);

        CampoNomeDeEmpresa = new JTextField();
        CampoNomeDeEmpresa.setBounds(44, 102, 218, 20);
        frmCadastroDePessoa.getContentPane().add(CampoNomeDeEmpresa);

        JLabel lblCnpj = new JLabel("CNPJ");
        lblCnpj.setForeground(SystemColor.textHighlight);
        lblCnpj.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblCnpj.setBounds(44, 133, 39, 27);
        frmCadastroDePessoa.getContentPane().add(lblCnpj);

        CampoCNPJ = new JTextField();
        CampoCNPJ.setBounds(44, 153, 218, 20);
        frmCadastroDePessoa.getContentPane().add(CampoCNPJ);

        JButton btnCadastraEmpresa = new JButton("Cadastrar Empresa");
        btnCadastraEmpresa.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String cnpj = CampoCNPJ.getText();

                if (!isValidCNPJ(cnpj)) {
                    JOptionPane.showMessageDialog(frmCadastroDePessoa, "CNPJ inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                JOptionPane.showMessageDialog(frmCadastroDePessoa, "Empresa cadastrada com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        btnCadastraEmpresa.setBounds(466, 246, 165, 27);
        frmCadastroDePessoa.getContentPane().add(btnCadastraEmpresa);

        JButton btnVoltar = new JButton("Voltar");
        btnVoltar.addActionListener(e -> {
            DashboardView dashboardView = new DashboardView(new EmployeeEntity(), null); // Passe os parâmetros corretos
            dashboardView.setVisible(true);
            frmCadastroDePessoa.dispose();
        });
        btnVoltar.setBounds(481, 303, 138, 27);
        frmCadastroDePessoa.getContentPane().add(btnVoltar);
    }

    protected boolean isValidCNPJ(String cnpj) {
        // Implementação da validação de CNPJ
        String CNPJ_PATTERN = "\\d{14}";
        return Pattern.matches(CNPJ_PATTERN, cnpj);
    }

    public void setVisible(boolean b) {
        if (frmCadastroDePessoa != null) {
            frmCadastroDePessoa.setVisible(b);
        }
    }
}
