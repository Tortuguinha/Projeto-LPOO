package com.app.presentation.views.clients.company;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.regex.Pattern;
import javax.swing.*;

import com.app.domain.entities.company.CompanyAddressEntity;
import com.app.domain.entities.company.CompanyContactEntity;
import com.app.domain.entities.company.CompanyEntity;
import com.app.domain.entities.employee.EmployeeEntity;
import com.app.infrastructure.controllers.interfaces.ICompanyController;
import com.app.infrastructure.factories.CompanyFactory;

public class CompanyRegistrationView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField campoNomeEmpresa, campoCNPJ, campoTelefone, campoEmail;
    
    private ICompanyController companyController = CompanyFactory.getInstance();

    EmployeeEntity _employeeLogged;
    private JTextField cidadeField;
    private JTextField bairroField;
    private JTextField ruaField;
    private JTextField numeroField;
    
    public CompanyRegistrationView(EmployeeEntity employeeLogged) {
    	
    	this._employeeLogged = employeeLogged;
    	
        setTitle("Cadastro de Empresa");
        setBounds(100, 100, 750, 550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel contentPane = new JPanel();
        contentPane.setLayout(null);
        setContentPane(contentPane);

        JLabel lblDados = new JLabel("Dados da Empresa");
        lblDados.setBounds(69, 52, 150, 30);
        lblDados.setFont(new Font("Tahoma", Font.BOLD, 14));
        contentPane.add(lblDados);

        JLabel lblNomeEmpresa = new JLabel("Nome Fantasia da Empresa:");
        lblNomeEmpresa.setBounds(69, 92, 150, 25);
        lblNomeEmpresa.setFont(new Font("Tahoma", Font.PLAIN, 14));
        contentPane.add(lblNomeEmpresa);

        campoNomeEmpresa = new JTextField();
        campoNomeEmpresa.setBounds(69, 117, 207, 25);
        contentPane.add(campoNomeEmpresa);

        JLabel lblCNPJ = new JLabel("CNPJ:");
        lblCNPJ.setBounds(69, 144, 150, 25);
        lblCNPJ.setFont(new Font("Tahoma", Font.PLAIN, 14));
        contentPane.add(lblCNPJ);

        campoCNPJ = new JTextField();
        campoCNPJ.setBounds(69, 169, 207, 25);
        contentPane.add(campoCNPJ);

        JLabel lblTelefone = new JLabel("Telefone:");
        lblTelefone.setBounds(69, 212, 150, 25);
        lblTelefone.setFont(new Font("Tahoma", Font.PLAIN, 14));
        contentPane.add(lblTelefone);

        campoTelefone = new JTextField();
        campoTelefone.setBounds(69, 237, 207, 25);
        contentPane.add(campoTelefone);

        JLabel lblEmail = new JLabel("Email:");
        lblEmail.setBounds(69, 272, 150, 25);
        lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 14));
        contentPane.add(lblEmail);

        campoEmail = new JTextField();
        campoEmail.setBounds(69, 297, 207, 25);
        contentPane.add(campoEmail);

        JButton btnCadastrar = new JButton("Cadastrar");
        btnCadastrar.setBounds(470, 381, 150, 30);
        btnCadastrar.setForeground(SystemColor.textHighlight);
        contentPane.add(btnCadastrar);
        
        JLabel lblCidade = new JLabel("Cidade");
        lblCidade.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblCidade.setBounds(470, 152, 150, 25);
        contentPane.add(lblCidade);
        
        cidadeField = new JTextField();
        cidadeField.setBounds(469, 179, 151, 25);
        contentPane.add(cidadeField);
        
        bairroField = new JTextField();
        bairroField.setBounds(469, 121, 151, 25);
        contentPane.add(bairroField);
        
        ruaField = new JTextField();
        ruaField.setBounds(340, 179, 119, 25);
        contentPane.add(ruaField);
        
        JLabel lblEndereo = new JLabel("Endereço");
        lblEndereo.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblEndereo.setBounds(340, 54, 150, 30);
        contentPane.add(lblEndereo);
        
        JLabel lblBairro = new JLabel("Bairro");
        lblBairro.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblBairro.setBounds(470, 94, 150, 25);
        contentPane.add(lblBairro);
        
        JLabel lblRua = new JLabel("Rua");
        lblRua.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblRua.setBounds(340, 154, 119, 25);
        contentPane.add(lblRua);
        
        numeroField = new JTextField();
        numeroField.setBounds(340, 119, 119, 25);
        contentPane.add(numeroField);
        
        JLabel lblNumero = new JLabel("Numero");
        lblNumero.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNumero.setBounds(340, 94, 119, 25);
        contentPane.add(lblNumero);

        btnCadastrar.addActionListener(e -> {       	
//        	
//        	if (validarDados()) {
//        		
//                JOptionPane.showMessageDialog(this, "Cliente cadastrado com sucesso!");
//            }
        	
        	CompanyEntity client = new CompanyEntity(
        			campoNomeEmpresa.getText(),
        			campoEmail.getText(),
        			campoCNPJ.getText(),
        			true,
        			new Date()
        			);
        	
        	CompanyContactEntity clientContact = new CompanyContactEntity(
        				campoTelefone.getText(),
        				campoEmail.getText()
        			);
        	
        	CompanyAddressEntity clientAddress = new CompanyAddressEntity(
        			Integer.parseInt(numeroField.getText()),
        			ruaField.getText(),
        			bairroField.getText(),
        			cidadeField.getText()
        			);
        	
        	companyController.register(client, clientContact, clientAddress);
        	
        	
        });
    }

    private boolean validarDados() {
        if (!campoCNPJ.getText().matches("\\d{14}")) {
            JOptionPane.showMessageDialog(this, "CPF deve conter 11 dígitos.", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (!isValidEmail(campoEmail.getText())) {
            JOptionPane.showMessageDialog(this, "Email inválido.", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    private boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        return Pattern.compile(emailRegex).matcher(email).matches();
    }
}
