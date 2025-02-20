package com.app.presentation.views.auth;

import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import com.app.domain.entities.employee.EmployeeEntity;
import com.app.infrastructure.controllers.interfaces.IEmployeeController;
import com.app.presentation.views.DashboardView;
import com.app.presentation.views.employee.EmployeeRegisterView;

public class LoginView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private EmployeeRegisterView _employeeRegisterView;
	
	private final IEmployeeController _employeeController;

	public LoginView(IEmployeeController employeeController, 
			EmployeeRegisterView employeeRegisterView
			) {
		
		this._employeeController = employeeController;
		this._employeeRegisterView = employeeRegisterView;
		
		this.components();
	}
	
	public void components() {
		setTitle("Tela de Login");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Componentes da interface
        JLabel lblUsuario = new JLabel("Email");
        lblUsuario.setBounds(241, 74, 104, 34);
        lblUsuario.setHorizontalAlignment(SwingConstants.CENTER);
        lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 15));
        JLabel lblSenha = new JLabel("Senha");
        lblSenha.setBounds(241, 158, 112, 38);
        lblSenha.setHorizontalAlignment(SwingConstants.CENTER);
        lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 15));
        JTextField emailField = new JTextField();
        emailField.setBounds(189, 114, 212, 34);
        emailField.setHorizontalAlignment(SwingConstants.CENTER);
        JPasswordField pwdField = new JPasswordField();
        pwdField.setBounds(189, 196, 212, 34);
        pwdField.setHorizontalAlignment(SwingConstants.CENTER);
        pwdField.setFont(new Font("Tahoma", Font.PLAIN, 15));
        JButton btnLogin = new JButton("Entrar");
        btnLogin.setBounds(243, 265, 112, 34);
        btnLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	String email = emailField.getText();
            	String password = new String(pwdField.getPassword());
            	
            	handleEmployeeLogin(email, password);
            }
        });
        btnLogin.setForeground(SystemColor.textHighlight);
        btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 15));
        getContentPane().setLayout(null);

        // Adicionando componentes à janela
        getContentPane().add(lblUsuario);
        getContentPane().add(emailField);
        getContentPane().add(lblSenha);
        getContentPane().add(pwdField);
        JLabel label = new JLabel();
        label.setBounds(0, 300, 129, 45);
        getContentPane().add(label); // Espaço vazio
        getContentPane().add(btnLogin);
        
        JLabel LabelTelaDeLogin = new JLabel("Tela De Login");
        LabelTelaDeLogin.setBounds(248, 34, 105, 29);
        LabelTelaDeLogin.setHorizontalAlignment(SwingConstants.CENTER);
        LabelTelaDeLogin.setFont(new Font("Tahoma", Font.PLAIN, 15));
        getContentPane().add(LabelTelaDeLogin);
        
        JButton btnEsqueceuSenha = new JButton("Esqueceu Senha");
        btnEsqueceuSenha.setBounds(230, 320, 143, 34);
        btnEsqueceuSenha.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnEsqueceuSenha.setForeground(SystemColor.textHighlight);
        btnEsqueceuSenha.setFont(new Font("Tahoma", Font.PLAIN, 15));
        getContentPane().add(btnEsqueceuSenha);
        
        JButton btnCadrastarFuncionario = new JButton("Cadrastar Funcionario");
        btnCadrastarFuncionario.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		_employeeRegisterView.setVisible(true);
        		dispose();
        	}
        });
        btnCadrastarFuncionario.setForeground(SystemColor.textHighlight);
        btnCadrastarFuncionario.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnCadrastarFuncionario.setBounds(214, 370, 179, 34);
        getContentPane().add(btnCadrastarFuncionario);

        setLocationRelativeTo(null); // Centraliza a janela
        setVisible(true);
	}
	
	public void handleEmployeeLogin(String email, String password) {
		try {
			EmployeeEntity employee = _employeeController.authenticate(email, password);
			System.out.println("Logado com sucesso, boas-vindas " + employee.getName());
			
			JOptionPane.showMessageDialog(null, "Login realizado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
			
			new DashboardView(employee, _employeeController).setVisible(true);
			dispose();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
		}
	}


}
