package com.app.presentation.views;

import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.app.domain.entities.employee.EmployeeEntity;
import com.app.infrastructure.controllers.interfaces.IClientController;
import com.app.infrastructure.controllers.interfaces.IEmployeeController;
import com.app.presentation.views.clients.ClientRegisterChoiceView;
import com.app.presentation.views.clients.OSRegisterChoice;
import com.app.presentation.views.clients.client.ClientManagementView;
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
    JButton btnListaDeOs;
    JButton btnChamadosAbertos;
    JButton btnCadastroDeOs;
    
    JLabel lblGerirFuncionarios;
    JLabel lblCliente;
    JLabel lblOrcamento;
    JLabel lblOrdemDeServico;
    JLabel lblSuporte;
    JLabel lblPresentation;

    public DashboardView(
    		EmployeeEntity loggedEmployee, 
    		IEmployeeController employeeController) {
        this._loggedEmployee = loggedEmployee;
        this._employeeController = employeeController;
        this.components();
    }
    
    public void clientsLayer() {    
        lblCliente = new JLabel("Cliente");
        lblCliente.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblCliente.setBounds(286, 116, 105, 14);
        contentPane.add(lblCliente);
        
         btnManageClient = new JButton("Lista de Clientes");
         btnManageClient.setForeground(SystemColor.textHighlight);
         btnManageClient.setFont(new Font("Tahoma", Font.PLAIN, 14));
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
        btnRegisterClient.setForeground(SystemColor.textHighlight);
        btnRegisterClient.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnRegisterClient.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ClientRegisterChoiceView clientRegisterChoice = new ClientRegisterChoiceView(
                		_loggedEmployee, 
                		_employeeController
              
                		);
                clientRegisterChoice.setVisible(true);
                dispose();
            }
        });
        btnRegisterClient.setBounds(283, 141, 160, 39);
        contentPane.add(btnRegisterClient);
    }
    
    public void employeeLayer() {
        lblGerirFuncionarios = new JLabel("Gerir Funcionários");
        lblGerirFuncionarios.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblGerirFuncionarios.setBounds(54, 116, 123, 14);
        contentPane.add(lblGerirFuncionarios);
        
        btnRegisterEmployee = new JButton("Cadastrar Funcionário");
        btnRegisterEmployee.setForeground(SystemColor.textHighlight);
        btnRegisterEmployee.setFont(new Font("Tahoma", Font.PLAIN, 13));
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
        btnFuncionarios.setForeground(SystemColor.textHighlight);
        btnFuncionarios.setFont(new Font("Tahoma", Font.PLAIN, 13));
        btnFuncionarios.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                EmployeeManagementView employeeManagement = new EmployeeManagementView(_loggedEmployee, _employeeController);
                employeeManagement.setVisible(true);
                dispose();
            }
        });
        btnFuncionarios.setBounds(54, 191, 160, 39);
        contentPane.add(btnFuncionarios);
    }
    
    public void serViceOrderLayer() {
        lblOrdemDeServico = new JLabel("Ordem de Serviço");
        lblOrdemDeServico.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblOrdemDeServico.setBounds(522, 297, 123, 14);
        contentPane.add(lblOrdemDeServico);
        
        btnCadastroDeOs = new JButton("Cadastro de O.S");
        btnCadastroDeOs.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		OSRegisterChoice osRegister = new OSRegisterChoice(_loggedEmployee);
        		osRegister.setVisible(true);
        		dispose();
        	}
        });
        btnCadastroDeOs.setForeground(SystemColor.textHighlight);
        btnCadastroDeOs.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnCadastroDeOs.setBounds(522, 322, 160, 39);
        contentPane.add(btnCadastroDeOs);
        
        btnListaDeOs = new JButton("Lista de O.S");
        btnListaDeOs.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        btnListaDeOs.setForeground(SystemColor.textHighlight);
        btnListaDeOs.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnListaDeOs.setBounds(522, 372, 160, 39);
        contentPane.add(btnListaDeOs);
    }
    
    public void budgetLayer() {
        lblOrcamento = new JLabel("Orçamento");
        lblOrcamento.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblOrcamento.setBounds(522, 116, 105, 14);
        contentPane.add(lblOrcamento);
        
        btnSolicitarOramento = new JButton("Solicitar Orçamento");
        btnSolicitarOramento.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	
        	}
        });
        btnSolicitarOramento.setForeground(SystemColor.textHighlight);
        btnSolicitarOramento.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnSolicitarOramento.setBounds(522, 141, 160, 39);
        contentPane.add(btnSolicitarOramento);
        
        btnLista = new JButton("Lista de Orçamento");
        btnLista.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        btnLista.setForeground(SystemColor.textHighlight);
        btnLista.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnLista.setBounds(522, 191, 160, 39);
        contentPane.add(btnLista);
    }
    
    public void supportLayer() {
        lblSuporte = new JLabel("Suporte");
        lblSuporte.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblSuporte.setBounds(54, 297, 105, 14);
        contentPane.add(lblSuporte);
        
        btnChamadosAbertos = new JButton("Chamados Abertos");
        btnChamadosAbertos.setForeground(SystemColor.textHighlight);
        btnChamadosAbertos.setFont(new Font("Tahoma", Font.PLAIN, 14));
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
        lblPresentation.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblPresentation.setBounds(574, 31, 150, 14);
        contentPane.add(lblPresentation);
        
        switch (_loggedEmployee.getRole()) {
			case ADMINISTRADOR: {
				this.employeeLayer();
	            this.clientsLayer();
	            this.serViceOrderLayer();
	            this.budgetLayer();
	            this.supportLayer();
			}
			case ATENDENTE: {
	            this.clientsLayer();
	            this.serViceOrderLayer();
	            this.budgetLayer();
	            this.supportLayer();
			}
			case TECNICO: {
	            this.budgetLayer();
	            this.supportLayer();
			}
		}
        
        this.employeeLayer();
        this.clientsLayer();
        this.serViceOrderLayer();
        this.budgetLayer();
        this.supportLayer();
    }
}
