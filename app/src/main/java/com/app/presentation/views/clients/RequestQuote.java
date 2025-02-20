package com.app.presentation.views.clients;

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

public class RequestQuote extends JFrame  {

    private JFrame frmCadastroDePessoa;
    private JTextField CampoNomeDeEmpresa;
    private JTextField CampoCNPJ;
    private JTextField CampoTelefone;
    private JTextField CampoEmail;
    private JTextField CampoCidade;
    private JTextField CampoRua;
    private JTextField CampoComplemento;
    private JTextField CampoBairro;

    public RequestQuote() {
        initialize();
    }

    private void initialize() {
        frmCadastroDePessoa = new JFrame();
        frmCadastroDePessoa.setTitle("Cadastro de Pessoa Jurídica (CNPJ)");
        frmCadastroDePessoa.setBounds(100, 100, 716, 544);
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

        JLabel lblTelefone = new JLabel("Telefone");
        lblTelefone.setForeground(SystemColor.textHighlight);
        lblTelefone.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblTelefone.setBounds(44, 183, 100, 25);
        frmCadastroDePessoa.getContentPane().add(lblTelefone);

        CampoTelefone = new JTextField();
        CampoTelefone.setBounds(44, 208, 218, 20);
        frmCadastroDePessoa.getContentPane().add(CampoTelefone);

        JLabel lblEmail = new JLabel("Email");
        lblEmail.setForeground(SystemColor.textHighlight);
        lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblEmail.setBounds(44, 238, 100, 25);
        frmCadastroDePessoa.getContentPane().add(lblEmail);

        CampoEmail = new JTextField();
        CampoEmail.setBounds(44, 263, 218, 20);
        frmCadastroDePessoa.getContentPane().add(CampoEmail);

        JLabel lblCidade = new JLabel("Cidade");
        lblCidade.setForeground(SystemColor.textHighlight);
        lblCidade.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblCidade.setBounds(44, 293, 100, 25);
        frmCadastroDePessoa.getContentPane().add(lblCidade);

        CampoCidade = new JTextField();
        CampoCidade.setBounds(44, 318, 218, 20);
        frmCadastroDePessoa.getContentPane().add(CampoCidade);

        JLabel lblRua = new JLabel("Rua");
        lblRua.setForeground(SystemColor.textHighlight);
        lblRua.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblRua.setBounds(44, 348, 100, 25);
        frmCadastroDePessoa.getContentPane().add(lblRua);

        CampoRua = new JTextField();
        CampoRua.setBounds(44, 373, 218, 20);
        frmCadastroDePessoa.getContentPane().add(CampoRua);

        JLabel lblComplemento = new JLabel("Complemento");
        lblComplemento.setForeground(SystemColor.textHighlight);
        lblComplemento.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblComplemento.setBounds(44, 403, 100, 25);
        frmCadastroDePessoa.getContentPane().add(lblComplemento);

        CampoComplemento = new JTextField();
        CampoComplemento.setBounds(44, 428, 218, 20);
        frmCadastroDePessoa.getContentPane().add(CampoComplemento);

        JLabel lblBairro = new JLabel("Bairro");
        lblBairro.setForeground(SystemColor.textHighlight);
        lblBairro.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblBairro.setBounds(329, 78, 100, 25);
        frmCadastroDePessoa.getContentPane().add(lblBairro);

        CampoBairro = new JTextField();
        CampoBairro.setBounds(329, 102, 218, 20);
        frmCadastroDePessoa.getContentPane().add(CampoBairro);

        JButton btnCadastraEmpresa = new JButton("Cadastrar Empresa");
        btnCadastraEmpresa.setForeground(SystemColor.textHighlight);
        btnCadastraEmpresa.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnCadastraEmpresa.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String cnpj = CampoCNPJ.getText();

               

                JOptionPane.showMessageDialog(frmCadastroDePessoa, "Empresa cadastrada com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        btnCadastraEmpresa.setBounds(487, 404, 165, 27);
        frmCadastroDePessoa.getContentPane().add(btnCadastraEmpresa);

        
  

   
	}
    }

