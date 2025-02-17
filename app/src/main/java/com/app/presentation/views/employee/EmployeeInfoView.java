package com.app.presentation.views.employee;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import com.app.domain.entities.employee.EmployeeEntity;
import com.app.infrastructure.controllers.interfaces.IEmployeeController;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmployeeInfoView extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private String _employeeCPF;
    private final EmployeeEntity _employee;
    private final EmployeeEntity _loggedEmployee;
    
    private IEmployeeController _employeeController;
    
    private JTextField employeeNameField;
    private JLabel employeeCPFLabel;
    private JTextField employeeCPFField;
    private JTextField creationDataField;
    private JLabel creationDataLabel;
    private JTextField roleField;
    private JLabel roleLabel;
    private JLabel contactLabel;
    private JLabel telephoneLabel;
    private JTextField telephoneField;
    private JLabel emailLabel;
    private JTextField emailField;
    private JLabel streetLabel;
    private JTextField numberField;
    private JLabel addressLabel;
    private JLabel numberLabel;
    private JTextField streetField;
    private JLabel districtLabel;
    private JTextField districtField;
    private JLabel cityLabel;
    private JTextField cityField;
    private JButton updateEmployeeBtn;
    private JButton backScreenBtn;

    public EmployeeInfoView(String employeeCPF, EmployeeEntity loggedEmployee, EmployeeEntity employee, IEmployeeController employeeController) {
    	this._loggedEmployee = loggedEmployee;
    	this._employeeController = employeeController;
    	this._employeeCPF = employeeCPF;
    	this._employee = employee;
    	
        this.component();
    }
    
    public void component() {
    	
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 800, 600);
        setTitle("Detalhes do Funcionário - Matrícula: " + this._employeeCPF);

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JLabel dataLabel = new JLabel("Dados");
        dataLabel.setBounds(80, 41, 69, 14);
        dataLabel.setFont(new Font(null, Font.PLAIN, 12));
        contentPane.add(dataLabel);
        
        JLabel employeeNameLabel = new JLabel("Nome do Funcionario");
        employeeNameLabel.setBounds(80, 66, 117, 14);
        contentPane.add(employeeNameLabel);
        
        employeeNameField = new JTextField(this._employee.getName());
        employeeNameField.setBounds(82, 91, 187, 30);
        employeeNameField.setEditable(false);
        contentPane.add(employeeNameField);
        employeeNameField.setColumns(10);
        
        employeeCPFLabel = new JLabel("CPF");
        employeeCPFLabel.setBounds(80, 137, 28, 14);
        contentPane.add(employeeCPFLabel);
        
        employeeCPFField = new JTextField(this._employee.getCPF());
        employeeCPFField.setColumns(10);
        employeeCPFField.setBounds(82, 162, 187, 30);
        employeeCPFField.setEditable(false);
        contentPane.add(employeeCPFField);
        
        creationDataField = new JTextField(this._employee.getAdmissionDate().toString());
        creationDataField.setColumns(10);
        creationDataField.setBounds(82, 242, 187, 30);
        creationDataField.setEditable(false);
        contentPane.add(creationDataField);
        
        creationDataLabel = new JLabel("Data de Adição");
        creationDataLabel.setBounds(80, 217, 93, 14);
        contentPane.add(creationDataLabel);
        
        roleField = new JTextField(this._employee.getRole().toString());
        roleField.setColumns(10);
        roleField.setBounds(82, 323, 187, 30);
        roleField.setEditable(false);
        contentPane.add(roleField);
        
        roleLabel = new JLabel("Cargo");
        roleLabel.setBounds(80, 298, 93, 14);
        contentPane.add(roleLabel);
        
        contactLabel = new JLabel("Contato");
        contactLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
        contactLabel.setBounds(340, 41, 69, 14);
        contentPane.add(contactLabel);
        
        telephoneLabel = new JLabel("Telefone/Celular");
        telephoneLabel.setBounds(340, 66, 117, 14);
        contentPane.add(telephoneLabel);
        
        telephoneField = new JTextField();
        telephoneField.setColumns(10);
        telephoneField.setBounds(342, 91, 201, 30);
        telephoneField.setEditable(false);
        contentPane.add(telephoneField);
        
        emailLabel = new JLabel("E-mail");
        emailLabel.setBounds(340, 137, 28, 14);
        contentPane.add(emailLabel);
        
        emailField = new JTextField();
        emailField.setColumns(10);
        emailField.setBounds(342, 162, 201, 30);
        emailField.setEditable(false);
        contentPane.add(emailField);
        
        streetLabel = new JLabel("Rua");
        streetLabel.setBounds(423, 258, 43, 14);
        contentPane.add(streetLabel);
        
        numberField = new JTextField();
        numberField.setColumns(10);
        numberField.setBounds(340, 282, 69, 30);
        numberField.setEditable(false);
        contentPane.add(numberField);
        
        addressLabel = new JLabel("Endereço");
        addressLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
        addressLabel.setBounds(340, 217, 69, 14);
        contentPane.add(addressLabel);
        
        numberLabel = new JLabel("Número");
        numberLabel.setBounds(340, 258, 43, 14);
        contentPane.add(numberLabel);
        
        streetField = new JTextField();
        streetField.setColumns(10);
        streetField.setBounds(423, 282, 120, 30);
        streetField.setEditable(false);
        contentPane.add(streetField);
        
        districtLabel = new JLabel("Bairro");
        districtLabel.setBounds(340, 330, 43, 14);
        contentPane.add(districtLabel);
        
        districtField = new JTextField();
        districtField.setColumns(10);
        districtField.setBounds(340, 354, 86, 30);
        districtField.setEditable(false);
        contentPane.add(districtField);
        
        cityLabel = new JLabel("Cidade");
        cityLabel.setBounds(433, 331, 43, 14);
        contentPane.add(cityLabel);
        
        cityField = new JTextField();
        cityField.setColumns(10);
        cityField.setBounds(436, 354, 107, 30);
        cityField.setEditable(false);
        contentPane.add(cityField);
        
        updateEmployeeBtn = new JButton("Atualizar Dados");
        updateEmployeeBtn.setBounds(587, 511, 161, 39);
        contentPane.add(updateEmployeeBtn);
        
        backScreenBtn = new JButton("Voltar");
        backScreenBtn.setBounds(587, 460, 161, 39);
        backScreenBtn.addActionListener(e -> {
            this.dispose();
            EmployeeManagementView managementView = new EmployeeManagementView(this._loggedEmployee, this._employeeController);
            managementView.setVisible(true);

        });
        contentPane.add(backScreenBtn);
        contentPane.setLayout(new BorderLayout());
    }
}