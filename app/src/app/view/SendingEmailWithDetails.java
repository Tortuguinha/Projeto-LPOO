package app.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SendingEmailWithDetails extends JFrame {

	
	private static final long serialVersionUID = 1L;
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SendingEmailWithDetails window = new SendingEmailWithDetails();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public SendingEmailWithDetails() {
		getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 15));
		setTitle("Sending email with details");
		getContentPane().setLayout(null);
		
		JLabel DetailsEmail = new JLabel("Detalhamento Email");
		DetailsEmail.setFont(new Font("Tahoma", Font.PLAIN, 14));
		DetailsEmail.setBounds(233, 28, 131, 34);
		getContentPane().add(DetailsEmail);
		
		JLabel De = new JLabel("De   : ");
		De.setFont(new Font("Tahoma", Font.PLAIN, 12));
		De.setBounds(20, 96, 46, 14);
		getContentPane().add(De);
		
		textField = new JTextField();
		textField.setBounds(66, 94, 437, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel to = new JLabel("Para : ");
		to.setFont(new Font("Tahoma", Font.PLAIN, 12));
		to.setBounds(20, 139, 46, 14);
		getContentPane().add(to);
		
		textField_1 = new JTextField();
		textField_1.setBounds(66, 137, 437, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel subject = new JLabel("Assunto : ");
		subject.setFont(new Font("Tahoma", Font.PLAIN, 12));
		subject.setBounds(10, 202, 56, 14);
		getContentPane().add(subject);
		
		textField_2 = new JTextField();
		textField_2.setBounds(65, 200, 438, 20);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(48, 256, 455, 159);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JButton ToRespond = new JButton("Responder");
		ToRespond.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		ToRespond.setBounds(90, 451, 109, 34);
		getContentPane().add(ToRespond);
		
		JButton btnNewButton_1 = new JButton("Enviar");
		btnNewButton_1.setBounds(90, 451, 109, 34);
		getContentPane().add(btnNewButton_1);
		
		JButton ToSend = new JButton("Enviar");
		ToSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		ToSend.setBounds(209, 451, 118, 34);
		getContentPane().add(ToSend);
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(300, 100, 750, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
