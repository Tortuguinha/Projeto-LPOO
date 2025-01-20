package app.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;


public class RegistrationView extends JFrame {

	private static final long serialVersionUID = -6588885163831839652L;
	private JFrame frame;
	private JTextField textField;
	private JTextField TextTelefone;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	
	
	public RegistrationView() {
		setTitle("UserRegistre");
		getContentPane().setLayout(null);
		
		JLabel TextUserRegistration = new JLabel("UserRegistration");
		TextUserRegistration.setFont(new Font("Tahoma", Font.PLAIN, 16));
		TextUserRegistration.setBounds(259, 26, 123, 39);
		getContentPane().add(TextUserRegistration);
		
		JLabel TextNome = new JLabel("Nome");
		TextNome.setFont(new Font("Tahoma", Font.PLAIN, 14));
		TextNome.setBounds(49, 95, 66, 22);
		getContentPane().add(TextNome);
		
		textField = new JTextField();
		textField.setBounds(49, 123, 272, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel TextContato = new JLabel("Contato ");
		TextContato.setFont(new Font("Tahoma", Font.PLAIN, 14));
		TextContato.setBounds(49, 222, 66, 14);
		getContentPane().add(TextContato);
		
		TextTelefone = new JTextField();
		TextTelefone.setBounds(49, 272, 161, 20);
		getContentPane().add(TextTelefone);
		TextTelefone.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(49, 328, 272, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel TextEmail = new JLabel("Email");
		TextEmail.setFont(new Font("Tahoma", Font.PLAIN, 15));
		TextEmail.setBounds(49, 303, 60, 14);
		getContentPane().add(TextEmail);
		
		JLabel CampoTelefone = new JLabel("Telefone");
		CampoTelefone.setFont(new Font("Tahoma", Font.PLAIN, 14));
		CampoTelefone.setBounds(49, 247, 66, 14);
		getContentPane().add(CampoTelefone);
		
		JLabel TextCPF = new JLabel("CPF");
		TextCPF.setFont(new Font("Tahoma", Font.PLAIN, 15));
		TextCPF.setBounds(49, 154, 30, 14);
		getContentPane().add(TextCPF);
		
		textField_2 = new JTextField();
		textField_2.setBounds(49, 179, 161, 20);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel TextEndereco = new JLabel("Endereço");
		TextEndereco.setFont(new Font("Tahoma", Font.PLAIN, 14));
		TextEndereco.setBounds(406, 95, 60, 22);
		getContentPane().add(TextEndereco);
		
		JLabel TextCidade = new JLabel("Cidade");
		TextCidade.setBounds(406, 156, 46, 14);
		getContentPane().add(TextCidade);
		
		textField_3 = new JTextField();
		textField_3.setBounds(406, 179, 183, 20);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(406, 123, 183, 20);
		getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel TextRua = new JLabel("Rua");
		TextRua.setFont(new Font("Tahoma", Font.PLAIN, 14));
		TextRua.setBounds(406, 222, 30, 16);
		getContentPane().add(TextRua);
		
		textField_5 = new JTextField();
		textField_5.setBounds(406, 249, 183, 20);
		getContentPane().add(textField_5);
		textField_5.setColumns(10);
	}
	
//	
//	private boolean temCamposVazios() { 
//        return textNome.getText().isEmpty() || 
//               txtCpf.getText().isEmpty() || 
//               txtEmail.getText().isEmpty() || 
//               txtTelefone.getText().isEmpty() || 
//               txtEndereco.getText().isEmpty() || 
//               txtCidade.getText().isEmpty() || 
//               txtRua.getText().isEmpty();
//    }
//	JButton BottaoContinue = new JButton("Cadrastrar");
//	BottaoContinue.addActionListener(new ActionListener() {
//		public void actionPerformed(ActionEvent e) {
//		
//			  try {
//                    // Validações
//                    if (temCamposVazios()) {
//                        throw new Exception("Por favor, preencha todos os campos obrigatórios.");
//                    }
//
//                    if (!validarEmail(txtEmail.getText())) {
//                        throw new Exception("Email inválido. Por favor, insira um email válido.");
//                    }
//
//                    if (!validarCPF(TextCPF.getText())) {
//                        throw new Exception("CPF inválido. Por favor, insira um CPF válido.");
//                    }
//                    if (!validarNome(txtNome.getText())) {
//                        throw new Exception("Nome inválido. O nome deve conter pelo menos 3 caracteres.");
//                    }
//                    }
//			 
//					 if (!validarEndereco(txtEndereco.getText())) {
//            			throw new Exception("endereco inválido. O endereco deve conter pelo menos 20 caracteres.");
//        			}
//     				
//					 if (!validarCidade(txtCidade.getText())) {
//						throw new Exception("endereco inválido. O endereco deve conter pelo menos 20 caracteres.");
//						}
//					
//						if (!validarRua(txtRua.getText())) {
//						throw new Exception("rua inválido. A Rua deve conter pelo menos 15 caracteres.");
//					}
//							
//                    JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
//
//                } catch (Exception ex) {
//                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
//                    ex.printStackTrace(); 
//                   }
//	}
//                

	          
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(300, 100, 750, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
