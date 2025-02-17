package com.app.presentation.views.client;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import com.app.presentation.views.DashboardView;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CustomerRegistration {

    private JFrame frmCadrastroCliente;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    CustomerRegistration window = new CustomerRegistration();
                    window.frmCadrastroCliente.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public CustomerRegistration() {
        initialize();
    }

    private void initialize() {
        frmCadrastroCliente = new JFrame();
        frmCadrastroCliente.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 14));
        frmCadrastroCliente.setTitle("Cadastro Cliente");
        frmCadrastroCliente.setBounds(100, 100, 600, 500);
        frmCadrastroCliente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmCadrastroCliente.getContentPane().setLayout(null);
        
        JLabel lblLabelCadrastrar = new JLabel("O Que Pretende Cadastrar?");
        lblLabelCadrastrar.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblLabelCadrastrar.setBounds(178, 88, 199, 40);
        frmCadrastroCliente.getContentPane().add(lblLabelCadrastrar);
        
        JButton btnPessoaJuridicaCNPJ = new JButton("Pessoa Juridica(CNPJ)");
        btnPessoaJuridicaCNPJ.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CompanyRegistrationCNPJ companyRegistration = new CompanyRegistrationCNPJ();
                companyRegistration.main(null);
                frmCadrastroCliente.dispose();
            }
        });
        btnPessoaJuridicaCNPJ.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnPessoaJuridicaCNPJ.setForeground(SystemColor.textHighlight);
        btnPessoaJuridicaCNPJ.setBounds(178, 160, 199, 45);
        frmCadrastroCliente.getContentPane().add(btnPessoaJuridicaCNPJ);
        
        JButton btnPessoaFisicacpf = new JButton("Pessoa Fisica(CPF)");
        btnPessoaFisicacpf.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                IndividualTaxpayerRegistration individualTaxpayerRegistration = new IndividualTaxpayerRegistration();
                individualTaxpayerRegistration.main(null);
                frmCadrastroCliente.dispose();
            }
        });
        btnPessoaFisicacpf.setForeground(SystemColor.textHighlight);
        btnPessoaFisicacpf.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnPessoaFisicacpf.setBounds(178, 227, 199, 45);
        frmCadrastroCliente.getContentPane().add(btnPessoaFisicacpf);
        
        JButton btnNewButton = new JButton("Voltar");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                DashboardView dashboardView = new DashboardView(null, null); // Passe os parâmetros necessários
                dashboardView.setVisible(true);
                frmCadrastroCliente.dispose();
            }
        });
        btnNewButton.setForeground(SystemColor.textHighlight);
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnNewButton.setBounds(229, 293, 97, 34);
        frmCadrastroCliente.getContentPane().add(btnNewButton);
    }
}
