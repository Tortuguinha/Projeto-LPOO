package app.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import app.view.components.button.LoginButton;
import app.view.components.input.LoginInput;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel loginFrame;
	private LoginInput fieldEmail;
	private JTextField fieldPwd;
	private LoginButton btnLogin;
	private LoginButton btnRecovery;

	public LoginView() {
		setTitle("Login");
		setSize(800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 100, 750, 550);
		loginFrame = new JPanel();
		loginFrame.setBorder(new EmptyBorder(5, 5, 5, 5));

		JLabel titleLogin = new JLabel("Login");
		titleLogin.setBounds(323, 95, 130, 59);
		titleLogin.setFont(new Font("Courier", Font.BOLD, 40));
		
		loginFrame.add(titleLogin);
		
		setContentPane(loginFrame);
		loginFrame.setLayout(null);
		
		fieldEmail = new LoginInput();
		fieldEmail.setText("Email");
		fieldEmail.setToolTipText("Coloque o Email");
		fieldEmail.setBounds(288, 184, 191, 32);
		loginFrame.add(fieldEmail);
		fieldEmail.setColumns(10);
		
		fieldPwd = new LoginInput();
		fieldPwd.setText("*********");
		fieldPwd.setToolTipText("Coloque a Senha");
		fieldPwd.setBounds(288, 236, 191, 32);
		loginFrame.add(fieldPwd);
		fieldPwd.setColumns(10);

		btnLogin = new LoginButton("Entrar");
		add(btnLogin);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DashboardView dashboardView = new DashboardView();
				dashboardView.setVisible(true);
				dispose();
			}
		});
		btnLogin.setBounds(289, 295, 190, 32);
		loginFrame.add(btnLogin);
		
		btnRecovery = new LoginButton("Recuperar Senha");
		btnRecovery.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRecovery.setBounds(288, 338, 191, 32);
		btnRecovery.setBorderPainted(false);
//		btnRecoveryPwd.setBackground(false);
		loginFrame.add(btnRecovery);
	}
}
