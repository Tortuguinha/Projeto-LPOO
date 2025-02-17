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

public class IndividualTaxpayerRegistration {

    private JFrame frmCatrastroDePessoa;
    private JTextField txtCampoDeString;
    private JTextField CampoCPF;
    private JTextField campodeCidade;
    private JTextField CampoRua;
    private JTextField CampoComplemento;
    private JTextField CampodeBairro;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    IndividualTaxpayerRegistration window = new IndividualTaxpayerRegistration();
                    window.frmCatrastroDePessoa.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public IndividualTaxpayerRegistration() {
        initialize();
    }

    private void initialize() {
        frmCatrastroDePessoa = new JFrame();
        frmCatrastroDePessoa.setTitle("Cadastro de Pessoa Física (CPF)");
        frmCatrastroDePessoa.setBounds(100, 100, 703, 528);
        frmCatrastroDePessoa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmCatrastroDePessoa.getContentPane().setLayout(null);
        
        JLabel lblNewLabel = new JLabel("Cadastro De Cliente");
        lblNewLabel.setForeground(SystemColor.textHighlight);
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNewLabel.setBounds(35, 23, 136, 24);
        frmCatrastroDePessoa.getContentPane().add(lblNewLabel);

        JLabel lblDadosPessoais = new JLabel("Dados Pessoais");
        lblDadosPessoais.setForeground(SystemColor.textHighlight);
        lblDadosPessoais.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblDadosPessoais.setBounds(35, 67, 109, 24);
        frmCatrastroDePessoa.getContentPane().add(lblDadosPessoais);

        txtCampoDeString = new JTextField();
        txtCampoDeString.setBounds(35, 139, 172, 20);
        frmCatrastroDePessoa.getContentPane().add(txtCampoDeString);
        txtCampoDeString.setColumns(10);

        JLabel lblCpf = new JLabel("CPF");
        lblCpf.setForeground(SystemColor.textHighlight);
        lblCpf.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblCpf.setBounds(35, 183, 109, 24);
        frmCatrastroDePessoa.getContentPane().add(lblCpf);

        CampoCPF = new JTextField();
        CampoCPF.setColumns(10);
        CampoCPF.setBounds(35, 202, 172, 20);
        frmCatrastroDePessoa.getContentPane().add(CampoCPF);

        JLabel lblEndereo = new JLabel("Endereço");
        lblEndereo.setForeground(SystemColor.textHighlight);
        lblEndereo.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblEndereo.setBounds(280, 67, 109, 24);
        frmCatrastroDePessoa.getContentPane().add(lblEndereo);

        JLabel lblNomeCliente = new JLabel("Nome Cliente");
        lblNomeCliente.setForeground(SystemColor.textHighlight);
        lblNomeCliente.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNomeCliente.setBounds(35, 114, 109, 24);
        frmCatrastroDePessoa.getContentPane().add(lblNomeCliente);

        JLabel lblCidade = new JLabel("Cidade");
        lblCidade.setForeground(SystemColor.textHighlight);
        lblCidade.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblCidade.setBounds(268, 114, 109, 24);
        frmCatrastroDePessoa.getContentPane().add(lblCidade);

        JLabel lblBairro = new JLabel("Bairro");
        lblBairro.setForeground(SystemColor.textHighlight);
        lblBairro.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblBairro.setBounds(430, 114, 109, 24);
        frmCatrastroDePessoa.getContentPane().add(lblBairro);

        JLabel lblRua = new JLabel("Rua");
        lblRua.setForeground(SystemColor.textHighlight);
        lblRua.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblRua.setBounds(268, 183, 109, 24);
        frmCatrastroDePessoa.getContentPane().add(lblRua);

        JLabel lblComplemento = new JLabel("Complemento");
        lblComplemento.setForeground(SystemColor.textHighlight);
        lblComplemento.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblComplemento.setBounds(430, 183, 109, 24);
        frmCatrastroDePessoa.getContentPane().add(lblComplemento);

        campodeCidade = new JTextField();
        campodeCidade.setColumns(10);
        campodeCidade.setBounds(266, 139, 136, 20);
        frmCatrastroDePessoa.getContentPane().add(campodeCidade);

        CampodeBairro = new JTextField();
        CampodeBairro.setColumns(10);
        CampodeBairro.setBounds(430, 139, 136, 20);
        frmCatrastroDePessoa.getContentPane().add(CampodeBairro);

        CampoRua = new JTextField();
        CampoRua.setColumns(10);
        CampoRua.setBounds(268, 202, 136, 20);
        frmCatrastroDePessoa.getContentPane().add(CampoRua);

        CampoComplemento = new JTextField();
        CampoComplemento.setColumns(10);
        CampoComplemento.setBounds(430, 202, 136, 20);
        frmCatrastroDePessoa.getContentPane().add(CampoComplemento);

        JButton btnCadastrarCliente = new JButton("Cadastrar Cliente");
        btnCadastrarCliente.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnCadastrarCliente.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nomeCliente = txtCampoDeString.getText();
                String cpf = CampoCPF.getText();
                String cidade = campodeCidade.getText();
                String rua = CampoRua.getText();
                String bairro = CampodeBairro.getText();
                String complemento = CampoComplemento.getText();

                // Validação de CPF
                if (!isValidCPF(cpf)) {
                    JOptionPane.showMessageDialog(null, "CPF inválido. Deve ter exatamente 11 dígitos numéricos.", "Erro de Validação", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                // Formatação de CPF
                cpf = formatCPF(cpf);

                // Lógica de cadastro do cliente
                JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!\nCPF: " + cpf, "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        btnCadastrarCliente.setForeground(SystemColor.textHighlight);
        btnCadastrarCliente.setBounds(492, 290, 142, 40);
        frmCatrastroDePessoa.getContentPane().add(btnCadastrarCliente);
        
        // Botão Voltar
        JButton btnVoltar = new JButton("Voltar");
        btnVoltar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CustomerRegistration customerRegistration = new CustomerRegistration();
                customerRegistration.main(null);
                frmCatrastroDePessoa.dispose();
            }
        });
        btnVoltar.setForeground(SystemColor.textHighlight);
        btnVoltar.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnVoltar.setBounds(492, 341, 142, 40);
        frmCatrastroDePessoa.getContentPane().add(btnVoltar);
    }

    // Validação de CPF
    private boolean isValidCPF(String cpf) {
        // Remove todos os caracteres especiais
        cpf = cpf.replaceAll("[^\\d]", "");

        // Verifica se o CPF tem exatamente 11 dígitos
        if (cpf.length() != 11) {
            return false;
        }

        // Verifica se todos os dígitos são iguais (CPF inválido)
        if (cpf.matches("(\\d)\\1{10}")) {
            return false;
        }

        return true;
    }

    // Formatação de CPF
    private String formatCPF(String cpf) {
        cpf = cpf.replaceAll("[^\\d]", ""); // Remove caracteres especiais
        return cpf.replaceAll("(\\d{3})(\\d{3})(\\d{3})(\\d{2})", "$1.$2.$3-$4");
    }
}
