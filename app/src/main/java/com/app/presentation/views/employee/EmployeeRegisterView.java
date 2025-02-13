/* Tela para cadastro de funcionário */

package com.app.presentation.views.employee;

import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JComboBox;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import com.app.domain.entities.employee.EmployeeAddressEntity;
import com.app.domain.entities.employee.EmployeeContactEntity;
import com.app.domain.entities.employee.EmployeeEntity;
import com.app.infrastructure.controllers.interfaces.IEmployeeController;

public class EmployeeRegisterView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	// Dados pessoais
	private JLabel personalDataLabel;
	private JLabel nameLabel;
	private JTextField nameField;
	private JLabel cpfLabel;
	private JTextField cpfField;
	private JPasswordField tempPwdField;
	private JLabel tempPwdLabel;
	
	// Contato
	private JLabel contactLabel;
	private JLabel telephoneLabel;
	private JTextField telephoneField;
	private JLabel emailLabel;
	private JTextField emailField;
	
	// Endereco
	private JLabel addressLabel;
	private JLabel numberLabel;
	private JTextField numberField;
	private JLabel streetLabel;
	private JTextField streetField;
	private JLabel districtLabel;
	private JTextField districtField;
	private JLabel cityLabel;
	private JTextField cityField;
	

	private JLabel roleLabel;
	private JComboBox<String> roleComboBox;
	
	private JButton cadastrarButton;
	private JButton voltarButton;
	
	private final IEmployeeController _employeeController;
	

	public EmployeeRegisterView(IEmployeeController employeeController) {
		this._employeeController = employeeController;
		this.components();
	}
	
	public void personal_data() {
		personalDataLabel = new JLabel("Dados Pessoais");
        personalDataLabel.setHorizontalAlignment(SwingConstants.CENTER);
        personalDataLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        personalDataLabel.setBounds(31, 34, 135, 39);
        getContentPane().add(personalDataLabel);
		
		nameLabel = new JLabel("Nome do funcionário:");
        nameLabel.setBounds(41, 72, 171, 39);
        nameLabel.setHorizontalAlignment(SwingConstants.CENTER);
        nameLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        getContentPane().add(nameLabel);
        
        nameField = new JTextField();
        nameField.setBounds(51, 107, 212, 29);
        nameField.setFont(new Font("Tahoma", Font.PLAIN, 13));
        getContentPane().add(nameField);
        
        cpfLabel = new JLabel("CPF:");
        cpfLabel.setBounds(31, 136, 83, 39);
        cpfLabel.setHorizontalAlignment(SwingConstants.CENTER);
        cpfLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        getContentPane().add(cpfLabel);
        
        cpfField = new JTextField();
        cpfField.setBounds(51, 175, 161, 29);
        cpfField.setFont(new Font("Tahoma", Font.PLAIN, 13));
        getContentPane().add(cpfField);
	}

	public void contact() {
		contactLabel = new JLabel("Contato");
        contactLabel.setHorizontalAlignment(SwingConstants.CENTER);
        contactLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        contactLabel.setBounds(283, 34, 83, 39);
        getContentPane().add(contactLabel);
        
        telephoneField = new JTextField();
        telephoneField.setFont(new Font("Tahoma", Font.PLAIN, 13));
        telephoneField.setBounds(293, 107, 227, 29);
        getContentPane().add(telephoneField);
        
        telephoneLabel = new JLabel("Telefone/Celular");
        telephoneLabel.setHorizontalAlignment(SwingConstants.CENTER);
        telephoneLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        telephoneLabel.setBounds(260, 72, 171, 39);
        getContentPane().add(telephoneLabel);
        
        emailLabel = new JLabel("E-mail");
        emailLabel.setHorizontalAlignment(SwingConstants.CENTER);
        emailLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        emailLabel.setBounds(285, 136, 58, 39);
        getContentPane().add(emailLabel);
        
        emailField = new JTextField();
        emailField.setFont(new Font("Tahoma", Font.PLAIN, 13));
        emailField.setBounds(293, 175, 227, 29);
        getContentPane().add(emailField);
	}
	
	public void address() {
		addressLabel = new JLabel("Endereco");
        addressLabel.setHorizontalAlignment(SwingConstants.CENTER);
        addressLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        addressLabel.setBounds(283, 234, 83, 39);
        getContentPane().add(addressLabel);
        
        numberField = new JTextField();
        numberField.setFont(new Font("Tahoma", Font.PLAIN, 13));
        numberField.setBounds(293, 315, 96, 29);
        getContentPane().add(numberField);
        
        numberLabel = new JLabel("Número");
        numberLabel.setHorizontalAlignment(SwingConstants.CENTER);
        numberLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        numberLabel.setBounds(283, 279, 83, 39);
        getContentPane().add(numberLabel);
        
        streetField = new JTextField();
        streetField.setFont(new Font("Tahoma", Font.PLAIN, 13));
        streetField.setBounds(396, 315, 124, 29);
        getContentPane().add(streetField);
        
        streetLabel = new JLabel("Rua");
        streetLabel.setHorizontalAlignment(SwingConstants.CENTER);
        streetLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        streetLabel.setBounds(366, 279, 83, 39);
        getContentPane().add(streetLabel);
        
        districtLabel = new JLabel("Bairro");
        districtLabel.setHorizontalAlignment(SwingConstants.CENTER);
        districtLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        districtLabel.setBounds(273, 362, 83, 39);
        getContentPane().add(districtLabel);
        
        districtField = new JTextField();
        districtField.setFont(new Font("Tahoma", Font.PLAIN, 13));
        districtField.setBounds(293, 398, 96, 29);
        getContentPane().add(districtField);
        
        cityLabel = new JLabel("Cidade");
        cityLabel.setHorizontalAlignment(SwingConstants.CENTER);
        cityLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        cityLabel.setBounds(386, 362, 83, 39);
        getContentPane().add(cityLabel);
        
        cityField = new JTextField();
        cityField.setFont(new Font("Tahoma", Font.PLAIN, 13));
        cityField.setBounds(396, 398, 124, 29);
        getContentPane().add(cityField);
	}
	
	public void components() {
		setTitle("Cadastro de Funcionário");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        getContentPane().setLayout(null);

        this.personal_data();
        
        this.contact();
        
        this.address();

        cadastrarButton = new JButton("Cadastrar");
        cadastrarButton.setBounds(589, 511, 161, 39);
        cadastrarButton.setForeground(SystemColor.textHighlight);
        cadastrarButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
        cadastrarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	
            	 EmployeeEntity employeeObject = new EmployeeEntity(
            		        nameField.getText(),
            		        emailField.getText(),
            		        new String(tempPwdField.getPassword()),
            		        cpfField.getText(),
            		        EmployeeEntity.ROLE.valueOf(roleComboBox.getSelectedItem().toString().toUpperCase()),
            		        new Date(),
            		        true
            		    );
            	 
            	 EmployeeContactEntity employeeContactObject = new EmployeeContactEntity(
            			 telephoneField.getText(), 
            			 emailField.getText()
            			 );
            	 
            	 EmployeeAddressEntity employeeAddressEntity = new EmployeeAddressEntity(
            			 Integer.parseInt(numberField.getText()),
            			 streetField.getText(),
            			 districtField.getText(),
            			 cityField.getText()
            			 );
            	 
            	handleEmployeeRegister(employeeObject, employeeContactObject, employeeAddressEntity);
            }
        });
        getContentPane().add(cadastrarButton);

        voltarButton = new JButton("Voltar");
        voltarButton.setBounds(589, 461, 161, 39);
        voltarButton.setForeground(SystemColor.textHighlight);
        voltarButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
        voltarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        getContentPane().add(voltarButton);
               
        String[] roleOptions = {"Administrador", "Atendente", "Tecnico"};
        
        roleLabel = new JLabel("Cargo:");
        roleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        roleLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        roleLabel.setBounds(549, 72, 58, 39);
        getContentPane().add(roleLabel);
        
        roleComboBox = new JComboBox<String>(roleOptions);        
        roleComboBox.setFont(getFont());
        roleComboBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
        roleComboBox.setBounds(549, 106, 161, 29);
        getContentPane().add(roleComboBox);
        
        tempPwdLabel = new JLabel("Senha Temporária:");
        tempPwdLabel.setHorizontalAlignment(SwingConstants.CENTER);
        tempPwdLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        tempPwdLabel.setBounds(46, 218, 147, 39);
        getContentPane().add(tempPwdLabel);
        
        tempPwdField = new JPasswordField();
        tempPwdField.setFont(new Font("Tahoma", Font.PLAIN, 13));
        tempPwdField.setBounds(51, 254, 161, 29);
        getContentPane().add(tempPwdField);
        
       
	}

	public void handleEmployeeRegister(EmployeeEntity employee, EmployeeContactEntity contact, EmployeeAddressEntity address) {
		this._employeeController.register(employee, contact, address);
	}
}
