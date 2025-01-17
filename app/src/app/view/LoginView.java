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
import javax.swing.JOptionPane;

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

	
		 if (titleLogin.getText().isEmpty() || fieldPwd.getText().isEmpty()) { 
                JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos obrigatórios.", "Erro", JOptionPane.ERROR_MESSAGE);
             } else {
            	 if (!Pattern.compile("\\b[\\w.%-]+@(?:[\\w-]+\.)+[A-Za-z]{2,4}\\b").matcher(email).matches()) {
            		    JOptionPane.showMessageDialog(null, "Formato de email inválido. Por favor, insira um email válido (exemplo: nome@exemplo.com).", "Erro", JOptionPane.ERROR_MESSAGE);
            		    return;
            		}
             }
		
		
		
		
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
				String email = fieldEmail.getText();
		        String senha = new String(((Object) fieldPwd).getfieldpwd());
			}
		
		
		});
		
		
		btnRecovery.setBounds(288, 338, 191, 32);
		btnRecovery.setBorderPainted(false);
//		btnRecoveryPwd.setBackground(false);
		loginFrame.add(btnRecovery);
	}
}

//	
//	package app.view;
//
//	import java.awt.EventQueue;
//	import java.awt.Font;
//	import java.awt.event.ActionEvent;
//	import java.awt.event.ActionListener;
//
//	import javax.swing.JFrame;
//	import javax.swing.JLabel;
//	import javax.swing.JOptionPane;
//	import javax.swing.JPanel;
//	import javax.swing.JTextField;
//	import javax.swing.border.EmptyBorder;
//
//	public class UserRegistration extends JFrame {
//
//	    private static final long serialVersionUID = -6588885163831839652L; 
//	    private JPanel contentPane;
//	    private JTextField txtNome;
//	    private JTextField txtCpf;
//	    private JTextField txtEmail;
//	    private JTextField txtTelefone;
//	    private JTextField txtEndereco;
//	    private JTextField txtCidade;
//	    private JTextField txtRua;
//
//	    public UserRegistration() {
//	        setTitle("User Registration");
//	        setBounds(300, 100, 750, 550);
//	        contentPane = new JPanel();
//	        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
//	        setContentPane(contentPane);
//	        contentPane.setLayout(null);
//
//	        JLabel lblUserRegistration = new JLabel("User Registration");
//	        lblUserRegistration.setFont(new Font("Tahoma", Font.PLAIN, 16));
//	        lblUserRegistration.setBounds(259, 26, 123, 39);
//	        contentPane.add(lblUserRegistration);
//
//	        JLabel lblNome = new JLabel("Nome");
//	        lblNome.setFont(new Font("Tahoma", Font.PLAIN, 14));
//	        lblNome.setBounds(49, 95, 66, 22);
//	        contentPane.add(lblNome);
//
//	        txtNome = new JTextField();
//	        txtNome.setBounds(49, 123, 272, 20);
//	        contentPane.add(txtNome);
//	        txtNome.setColumns(10);
//
//	        JLabel lblCpf = new JLabel("CPF");
//	        lblCpf.setFont(new Font("Tahoma", Font.PLAIN, 15));
//	        lblCpf.setBounds(49, 154, 30, 14);
//	        contentPane.add(lblCpf);
//
//	        txtCpf = new JTextField();
//	        txtCpf.setBounds(49, 179, 161, 20);
//	        contentPane.add(txtCpf);
//	        txtCpf.setColumns(10);
//
//	        JLabel lblEmail = new JLabel("Email");
//	        lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 15));
//	        lblEmail.setBounds(49, 303, 60, 14);
//	        contentPane.add(lblEmail);
//
//	        txtEmail = new JTextField();
//	        txtEmail.setBounds(49, 328, 272, 20);
//	        contentPane.add(txtEmail);
//	        txtEmail.setColumns(10);
//
//	        JLabel lblContato = new JLabel("Contato");
//	        lblContato.setFont(new Font("Tahoma", Font.PLAIN, 14));
//	        lblContato.setBounds(49, 222, 66, 14);
//	        contentPane.add(lblContato);
//
//	        txtTelefone = new JTextField();
//	        txtTelefone.setBounds(49, 272, 161, 20);
//	        contentPane.add(txtTelefone);
//	        txtTelefone.setColumns(10);
//
//	        JLabel lblEndereco = new JLabel("Endereço");
//	        lblEndereco.setFont(new Font("Tahoma", Font.PLAIN, 14));
//	        lblEndereco.setBounds(406, 95, 60, 22);
//	        contentPane.add(lblEndereco);
//
//	        txtEndereco = new JTextField();
//	        txtEndereco.setBounds(406, 123, 183, 20);
//	        contentPane.add(txtEndereco);
//	        txtEndereco.setColumns(10);
//
//	        JLabel lblCidade = new JLabel("Cidade");
//	        lblCidade.setBounds(406, 156, 46, 14);
//	        contentPane.add(lblCidade);
//
//	        txtCidade = new JTextField();
//	        txtCidade.setBounds(406, 179, 183, 20);
//	        contentPane.add(txtCidade);
//	        txtCidade.setColumns(10);
//
//	        JLabel lblRua = new JLabel("Rua");
//	        lblRua.setFont(new Font("Tahoma", Font.PLAIN, 14));
//	        lblRua.setBounds(406, 222, 30, 16);
//	        contentPane.add(lblRua);
//
//	        txtRua = new JTextField();
//	        txtRua.setBounds(406, 249, 183, 20);
//	        contentPane.add(txtRua);
//	        txtRua.setColumns(10);
//
//	        JButton btnCadastrar = new JButton("Cadastrar");
//	        btnCadastrar.addActionListener(new ActionListener() {
//	            public void actionPerformed(ActionEvent e) {
//	                if (txtNome.getText().isEmpty() || txtCpf.getText().isEmpty() || txtEmail.getText().isEmpty() || 
//	                    txtTelefone.getText().isEmpty() || txtEndereco.getText().isEmpty() || txtCidade.getText().isEmpty() || txtRua.getText().isEmpty()) {
//	                    JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos obrigatórios.", "Erro", JOptionPane.ERROR_MESSAGE);
//	                } else {
//	                    // Lógica de validação e cadastro aqui
//	                    // ...
//	                    JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE); 
//	                }
//	            }
//	        });
//	        btnCadastrar.setBounds(418, 391, 109, 29);
//	        contentPane.add(btnCadastrar);
//	    }
//
//	    public static void main(String[] args) {
//	        EventQueue.invokeLater(new Runnable() {
//	            public void run() {
//	                try {
//	                    UserRegistration window = new UserRegistration();
//	                    window.setVisible(true);
//	                } catch (Exception e) {
//	                    e.printStackTrace();
//	                }
//	            }
//	        });
//	    }
//	}