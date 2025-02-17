package com.app.presentation.views.auth;

import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.app.infrastructure.controllers.interfaces.IEmployeeController;
import com.app.presentation.views.employee.EmployeeRegisterView;

public class RecoveryPwdView extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    
    JTextField usuarioField;
    private final IEmployeeController _employeeController;
    private final EmployeeRegisterView _employeeRegisterView;

    public RecoveryPwdView(IEmployeeController employeeController, EmployeeRegisterView employeeRegisterView) {
        this._employeeController = employeeController;
        this._employeeRegisterView = employeeRegisterView;
        
        setTitle("Recuperação de Senha");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel usuarioLabel = new JLabel("Digite Seu E-mail");
        usuarioLabel.setBounds(211, 113, 130, 25);
        usuarioLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));

        usuarioField = new JTextField();
        usuarioField.setBounds(133, 161, 303, 30);
        usuarioField.setFont(new Font("Tahoma", Font.PLAIN, 13));

        JButton btnAtualizar = new JButton("Pedido de Recuperação");
        btnAtualizar.setBounds(182, 202, 194, 30);
        btnAtualizar.setForeground(SystemColor.textHighlight);
        btnAtualizar.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnAtualizar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              
            }
        });
        getContentPane().setLayout(null);
        getContentPane().add(usuarioLabel);
        getContentPane().add(usuarioField);
        getContentPane().add(btnAtualizar);
        
        JLabel lblTitulo = new JLabel("Recuperar Senha");
        lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblTitulo.setBounds(211, 47, 130, 30);
        getContentPane().add(lblTitulo);
        
        JButton btnNewButton = new JButton("Voltar tela Inical");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();   
                // Abre a tela de login
                LoginView loginView = new LoginView(_employeeController, _employeeRegisterView);
                loginView.setVisible(true); 
            }
        });
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnNewButton.setForeground(SystemColor.textHighlight);
        btnNewButton.setBounds(211, 253, 130, 25);
        getContentPane().add(btnNewButton);
    }
}
