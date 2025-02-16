package com.app.presentation.views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.app.domain.entities.employee.EmployeeEntity;
import com.app.infrastructure.controllers.interfaces.IEmployeeController;
import com.app.presentation.views.client.ClientManagementView;
import com.app.presentation.views.client.ClientRegisterView;
import com.app.presentation.views.employee.EmployeeManagementView;
import com.app.presentation.views.employee.EmployeeRegisterView;

public class DashboardView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	private EmployeeEntity _loggedEmployee;
	private final IEmployeeController _employeeController;
	
	JButton btnRegisterClient;
	JButton btnFuncionarios;
	JButton btnSolicitarOramento;
	JButton btnRegisterEmployee;
	JButton btnManageClient;
	JButton btnLista;
	JButton	btnListaDeOs;
	JButton btnChamadosAbertos;
	JButton btnCadastroDeOs;
	
	JLabel lblGerirFuncionarios;
	JLabel lblCliente;
	JLabel lblOrcamento;
	JLabel lblOrdemDeServico;
	JLabel lblSuporte;
	JLabel lblPresentation;

	public DashboardView(EmployeeEntity loggedEmployee, IEmployeeController employeeController) {
		this._loggedEmployee = loggedEmployee;
		this._employeeController = employeeController;
		this.components();
	}
	
	public void clientsLayer() {	
        lblCliente = new JLabel("Cliente");
        lblCliente.setBounds(286, 116, 105, 14);
        contentPane.add(lblCliente);
		
		 btnManageClient = new JButton("Lista de Clientes");
	        btnManageClient.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	            	ClientManagementView clientManage = new ClientManagementView();
	            	clientManage.setVisible(true);
	            	dispose();
	            }
	        });
	        btnManageClient.setBounds(283, 191, 160, 39);
	        contentPane.add(btnManageClient);
		
		btnRegisterClient = new JButton("Cadastrar Cliente");
        btnRegisterClient.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	ClientRegisterView clientRegister = new ClientRegisterView();
            	clientRegister.setVisible(true);
            	dispose();
            }
        });
        btnRegisterClient.setBounds(283, 141, 160, 39);
        contentPane.add(btnRegisterClient);
	}
	
	public void employeeLayer() {
		lblGerirFuncionarios = new JLabel("Gerir Funcionários");
        lblGerirFuncionarios.setBounds(54, 116, 105, 14);
        contentPane.add(lblGerirFuncionarios);
        
        btnRegisterEmployee = new JButton("Cadastrar Funcionário");
        btnRegisterEmployee.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	EmployeeRegisterView employeeRegister = new EmployeeRegisterView(_employeeController, _loggedEmployee);
            	employeeRegister.setVisible(true);
            	dispose();
            }
        });
        btnRegisterEmployee.setBounds(54, 141, 160, 39);
        contentPane.add(btnRegisterEmployee);
        
        btnFuncionarios = new JButton("Lista de Funcionários");
        btnFuncionarios.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		EmployeeManagementView employeeManagement = new EmployeeManagementView();
        		employeeManagement.setVisible(true);
        		dispose();
        	}
        });
        btnFuncionarios.setBounds(54, 191, 160, 39);
        contentPane.add(btnFuncionarios);
	}
	
	public void serViceOrderLayer() {
        lblOrdemDeServico = new JLabel("Ordem de Serviço");
        lblOrdemDeServico.setBounds(522, 297, 105, 14);
        contentPane.add(lblOrdemDeServico);
        
        btnCadastroDeOs = new JButton("Cadastro de O.S");
        btnCadastroDeOs.setBounds(522, 322, 160, 39);
        contentPane.add(btnCadastroDeOs);
        
        btnListaDeOs = new JButton("Lista de O.S");
        btnListaDeOs.setBounds(522, 372, 160, 39);
        contentPane.add(btnListaDeOs);
	}
	
	public void budgetLayer() {
		lblOrcamento = new JLabel("Orçamento");
        lblOrcamento.setBounds(522, 116, 105, 14);
        contentPane.add(lblOrcamento);
        
		btnSolicitarOramento = new JButton("Solicitar Orçamento");
        btnSolicitarOramento.setBounds(522, 141, 160, 39);
        contentPane.add(btnSolicitarOramento);
        
        btnLista = new JButton("Lista de Orçamento");
        btnLista.setBounds(522, 191, 160, 39);
        contentPane.add(btnLista);
	}
	
	public void supportLayer() {
        lblSuporte = new JLabel("Suporte");
        lblSuporte.setBounds(54, 297, 105, 14);
        contentPane.add(lblSuporte);
        
        btnChamadosAbertos = new JButton("Chamados Abertos");
        btnChamadosAbertos.setBounds(54, 330, 160, 39);
        contentPane.add(btnChamadosAbertos);
	}
	
	public void components() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 750, 550);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        lblPresentation = new JLabel("Olá, " + _loggedEmployee.getName() + "!");
        lblPresentation.setBounds(574, 31, 150, 14);
        contentPane.add(lblPresentation);
        
        this.employeeLayer();
        this.clientsLayer();
        this.serViceOrderLayer();
        this.budgetLayer();
        this.supportLayer();
	}
}
