package app.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel loginFrame;
	private JTextField fieldEmail;
	private JTextField fieldPwd;

	public LoginView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 100, 750, 550);
		loginFrame = new JPanel();
		loginFrame.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(loginFrame);
		loginFrame.setLayout(null);
		
		fieldEmail = new JTextField();
		fieldEmail.setText("Email");
		fieldEmail.setToolTipText("Coloque o Email");
		fieldEmail.setBounds(288, 184, 191, 32);
		loginFrame.add(fieldEmail);
		fieldEmail.setColumns(10);
		
		fieldPwd = new JTextField();
		fieldPwd.setText("*********");
		fieldPwd.setToolTipText("Coloque a Senha");
		fieldPwd.setBounds(288, 236, 191, 32);
		loginFrame.add(fieldPwd);
		fieldPwd.setColumns(10);
		
		JButton btnLogin = new JButton("Entrar");
		btnLogin.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				DashboardView frame = new DashboardView();
				frame.setVisible(true);
			}
		});
		btnLogin.setBounds(289, 295, 190, 32);
		loginFrame.add(btnLogin);
		
		JLabel titleLogin = new JLabel("Login");
		titleLogin.setBounds(323, 95, 130, 59);
		titleLogin.setFont(new Font("Courier", Font.BOLD, 40));
		
		loginFrame.add(titleLogin);
		
		JButton btnRecoveryPwd = new JButton("Recuperar Senha");
		btnRecoveryPwd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRecoveryPwd.setBounds(288, 338, 191, 32);
		btnRecoveryPwd.setBorderPainted(false);
//		btnRecoveryPwd.setBackground(false);
		loginFrame.add(btnRecoveryPwd);
	}
}
