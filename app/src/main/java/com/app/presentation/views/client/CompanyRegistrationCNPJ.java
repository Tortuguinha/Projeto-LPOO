package com.app.presentation.views.client;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import java.util.regex.Pattern;

public class CompanyRegistrationCNPJ {

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
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    CompanyRegistrationCNPJ window = new CompanyRegistrationCNPJ();
                    window.frmCadastroDePessoa.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public CompanyRegistrationCNPJ() {
        initialize();
    }

    private void initialize() {
        frmCadastroDePessoa = new JFrame();
        frmCadastroDePessoa.setTitle("Cadastro de Pessoa Jurídica (CNPJ)");
        frmCadastroDePessoa.setBounds(100, 100, 701, 520);
        frmCadastroDePessoa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmCadastroDePessoa.getContentPane().setLayout(null);

        JLabel lblDados = new JLabel("Dados");
        lblDados.setForeground(SystemColor.desktop);
        lblDados.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblDados.setBounds(44, 21, 51, 36);
        frmCadastroDePessoa.getContentPane().add(lblDados);

        JLabel lblNomeDeEmpresa = new JLabel("Nome De Empresa");
        lblNomeDeEmpresa.setForeground(SystemColor.textHighlight);
        lblNomeDeEmpresa.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNomeDeEmpresa.setBounds(44, 77, 119, 27);
        frmCadastroDePessoa.getContentPane().add(lblNomeDeEmpresa);

        CampoNomeDeEmpresa = new JTextField();
        CampoNomeDeEmpresa.setBounds(44, 102, 218, 20);
        frmCadastroDePessoa.getContentPane().add(CampoNomeDeEmpresa);
        CampoNomeDeEmpresa.setColumns(10);

        JLabel lblCnpj = new JLabel("CNPJ");
        lblCnpj.setForeground(SystemColor.textHighlight);
        lblCnpj.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblCnpj.setBounds(44, 133, 39, 27);
        frmCadastroDePessoa.getContentPane().add(lblCnpj);

        CampoCNPJ = new JTextField();
        CampoCNPJ.setColumns(10);
        CampoCNPJ.setBounds(44, 153, 218, 20);
        frmCadastroDePessoa.getContentPane().add(CampoCNPJ);

        JLabel lblContato = new JLabel("Contato");
        lblContato.setForeground(SystemColor.desktop);
        lblContato.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblContato.setBounds(44, 208, 119, 27);
        frmCadastroDePessoa.getContentPane().add(lblContato);

        JLabel lblTelefone = new JLabel("Telefone/Celular");
        lblTelefone.setForeground(SystemColor.textHighlight);
        lblTelefone.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblTelefone.setBounds(44, 246, 119, 27);
        frmCadastroDePessoa.getContentPane().add(lblTelefone);

        CampoTelefone = new JTextField();
        CampoTelefone.setColumns(10);
        CampoTelefone.setBounds(44, 267, 218, 20);
        frmCadastroDePessoa.getContentPane().add(CampoTelefone);

        JLabel lblEmail = new JLabel("Email");
        lblEmail.setForeground(SystemColor.textHighlight);
        lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblEmail.setBounds(44, 303, 39, 27);
        frmCadastroDePessoa.getContentPane().add(lblEmail);

        CampoEmail = new JTextField();
        CampoEmail.setColumns(10);
        CampoEmail.setBounds(44, 325, 218, 20);
        frmCadastroDePessoa.getContentPane().add(CampoEmail);

        JLabel lblEndereco = new JLabel("Endereço");
        lblEndereco.setForeground(SystemColor.desktop);
        lblEndereco.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblEndereco.setBounds(359, 21, 66, 36);
        frmCadastroDePessoa.getContentPane().add(lblEndereco);

        JLabel lblCidade = new JLabel("Cidade");
        lblCidade.setForeground(SystemColor.textHighlight);
        lblCidade.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblCidade.setBounds(359, 80, 57, 20);
        frmCadastroDePessoa.getContentPane().add(lblCidade);

        JLabel lblRua = new JLabel("Rua");
        lblRua.setForeground(SystemColor.textHighlight);
        lblRua.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblRua.setBounds(359, 133, 39, 27);
        frmCadastroDePessoa.getContentPane().add(lblRua);

        CampoCidade = new JTextField();
        CampoCidade.setColumns(10);
        CampoCidade.setBounds(359, 102, 119, 20);
        frmCadastroDePessoa.getContentPane().add(CampoCidade);

        CampoRua = new JTextField();
        CampoRua.setColumns(10);
        CampoRua.setBounds(359, 153, 119, 20);
        frmCadastroDePessoa.getContentPane().add(CampoRua);

        JLabel lblComplemento = new JLabel("Complemento");
        lblComplemento.setForeground(SystemColor.textHighlight);
        lblComplemento.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblComplemento.setBounds(512, 133, 119, 27);
        frmCadastroDePessoa.getContentPane().add(lblComplemento);

        JLabel lblBairro = new JLabel("Bairro");
        lblBairro.setForeground(SystemColor.textHighlight);
        lblBairro.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblBairro.setBounds(512, 77, 51, 27);
        frmCadastroDePessoa.getContentPane().add(lblBairro);

        CampoBairro = new JTextField();
        CampoBairro.setColumns(10);
        CampoBairro.setBounds(512, 102, 119, 20);
        frmCadastroDePessoa.getContentPane().add(CampoBairro);

        CampoComplemento = new JTextField();
        CampoComplemento.setColumns(10);
        CampoComplemento.setBounds(512, 153, 119, 20);
        frmCadastroDePessoa.getContentPane().add(CampoComplemento);

        JButton btnCadastraEmpresa = new JButton("Cadastra Empresa");
        btnCadastraEmpresa.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nomeEmpresa = CampoNomeDeEmpresa.getText();
                String cnpj = CampoCNPJ.getText();
                String telefone = CampoTelefone.getText();
                String email = CampoEmail.getText();
                String cidade = CampoCidade.getText();
                String rua = CampoRua.getText();
                String bairro = CampoBairro.getText();
                String complemento = CampoComplemento.getText();

                // Validação de CNPJ (apenas números)
                if (!cnpj.matches("\\d{14}")) {
                    JOptionPane.showMessageDialog(null, "CNPJ deve conter apenas 14 dígitos numéricos.", "Erro de Validação", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                // Validação de Email
                if (!isValidEmail(email)) {
                    JOptionPane.showMessageDialog(null, "Email inválido.", "Erro de Validação", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                JOptionPane.showMessageDialog(null, "Empresa cadastrada com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        btnCadastraEmpresa.setForeground(SystemColor.textHighlight);
        btnCadastraEmpresa.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnCadastraEmpresa.setBounds(466, 246, 165, 27);
        frmCadastroDePessoa.getContentPane().add(btnCadastraEmpresa);

        JButton btnVoltar = new JButton("Voltar");
        btnVoltar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CustomerRegistration customerRegistration = new CustomerRegistration();
                customerRegistration.main(null);
                frmCadastroDePessoa.dispose();
            }
        });
        btnVoltar.setForeground(SystemColor.textHighlight);
        btnVoltar.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnVoltar.setBounds(481, 303, 138, 27);
        frmCadastroDePessoa.getContentPane().add(btnVoltar);
    }

    // Validação de Email
    private boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pat = Pattern.compile(emailRegex);
        if (email == null) return false;
        return pat.matcher(email).matches();
    }
}
