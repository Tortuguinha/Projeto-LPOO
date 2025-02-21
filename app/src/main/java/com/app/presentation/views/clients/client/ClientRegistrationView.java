package com.app.presentation.views.clients.client;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.regex.Pattern;
import javax.swing.*;

import com.app.domain.entities.client.ClientAddressEntity;
import com.app.domain.entities.client.ClientContactEntity;
import com.app.domain.entities.client.ClientEntity;
import com.app.domain.entities.employee.EmployeeEntity;
import com.app.infrastructure.controllers.interfaces.IClientController;
import com.app.infrastructure.factories.ClientFactory;

public class ClientRegistrationView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField campoNomeCliente, campoCPF, campoTelefone, campoEmail;
    
    private IClientController clientController = ClientFactory.getInstance();

    EmployeeEntity _employeeLogged;
    private JTextField cidadeField;
    private JTextField bairroField;
    private JTextField ruaField;
    private JTextField numeroField;
    
    public ClientRegistrationView(EmployeeEntity employeeLogged) {
    	
    	this._employeeLogged = employeeLogged;
    	
        setTitle("Cadastro de Clientes");
        setBounds(100, 100, 750, 550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel contentPane = new JPanel();
        contentPane.setLayout(null);
        setContentPane(contentPane);

        JLabel lblDados = new JLabel("Dados do Cliente");
        lblDados.setBounds(69, 52, 150, 30);
        lblDados.setFont(new Font("Tahoma", Font.BOLD, 14));
        contentPane.add(lblDados);

        JLabel lblNomeEmpresa = new JLabel("Nome do Cliente:");
        lblNomeEmpresa.setBounds(69, 92, 150, 25);
        lblNomeEmpresa.setFont(new Font("Tahoma", Font.PLAIN, 14));
        contentPane.add(lblNomeEmpresa);

        campoNomeCliente = new JTextField();
        campoNomeCliente.setBounds(69, 117, 207, 25);
        contentPane.add(campoNomeCliente);

        JLabel lblCPF = new JLabel("CPF:");
        lblCPF.setBounds(69, 144, 150, 25);
        lblCPF.setFont(new Font("Tahoma", Font.PLAIN, 14));
        contentPane.add(lblCPF);

        campoCPF = new JTextField();
        campoCPF.setBounds(69, 169, 207, 25);
        contentPane.add(campoCPF);

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
        	
        	ClientEntity client = new ClientEntity(
        			campoNomeCliente.getText(),
        			campoEmail.getText(),
        			campoCPF.getText(),
        			true,
        			new Date()
        			);
        	
        	ClientContactEntity clientContact = new ClientContactEntity(
        				campoTelefone.getText(),
        				campoEmail.getText()
        			);
        	
        	ClientAddressEntity clientAddress = new ClientAddressEntity(
        			Integer.parseInt(numeroField.getText()),
        			ruaField.getText(),
        			bairroField.getText(),
        			cidadeField.getText()
        			);
        	
        	clientController.register(client, clientContact, clientAddress);
        	
        	
        });
    }

    private boolean validarDados() {
        if (!campoCPF.getText().matches("\\d{11}")) {
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
