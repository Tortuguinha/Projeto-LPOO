package app.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SendingEmailWithDetails extends JFrame {

	
	private static final long serialVersionUID = 1L;
	private static final JTextField ToSend = null;
	private JFrame frame;
	private JTextField campotextde;
	private JTextField campotextpara;
	private static JTextField campotext;
	private JTextField campotextassunto;
	private JTextField ToSend1;
	protected Object email;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SendingEmailWithDetails window = new SendingEmailWithDetails(campotext);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public SendingEmailWithDetails(JTextField ToSend) {
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
		
		campotextde = new JTextField();
		campotextde.setBounds(66, 94, 437, 20);
		getContentPane().add(campotextde);
		campotextde.setColumns(10);
		
		JLabel to = new JLabel("Para : ");
		to.setFont(new Font("Tahoma", Font.PLAIN, 12));
		to.setBounds(20, 139, 46, 14);
		getContentPane().add(to);
		
		campotextpara = new JTextField();
		campotextpara.setBounds(66, 137, 437, 20);
		getContentPane().add(campotextpara);
		campotextpara.setColumns(10);
		
		JLabel subject = new JLabel("Assunto : ");
		subject.setFont(new Font("Tahoma", Font.PLAIN, 12));
		subject.setBounds(10, 202, 56, 14);
		getContentPane().add(subject);
		
		campotext = new JTextField();
		campotext.setBounds(65, 200, 438, 20);
		getContentPane().add(campotext);
		campotext.setColumns(10);
		
		campotextassunto = new JTextField();
		campotextassunto.setBounds(48, 256, 455, 159);
		getContentPane().add(campotextassunto);
		campotextassunto.setColumns(10);
		
		JButton ToRespond = new JButton("Responder");
		ToRespond.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			String remetenteOriginal = ((Object) email).getFrom(); 
			String assuntoOriginal = ((Object) email).getSubject(); 

			        // Preencher os campos do formulário
			JLabel textFieldPara;
			textFieldPara.setText(remetenteOriginal); 
			JLabel textFieldAssunto;
			textFieldAssunto.setText("Re: " + assuntoOriginal); 
			JLabel textFieldMensagem;
			textFieldMensagem.setText("Resposta: \n"); 

			        // Exibir mensagem informativa
			        JOptionPane.showMessageDialog(null, "Campos preenchidos para resposta.", "Informação", JOptionPane.INFORMATION_MESSAGE);
			    }
			
		
		});
		ToRespond.setBounds(91, 426, 109, 34);
		getContentPane().add(ToRespond);
		
		
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JLabel textFieldDe;
				String de = textFieldDe.getText();
		        JLabel textFieldPara;
				String para = textFieldPara.getText();
		        JLabel textFieldAssunto;
				String assunto = textFieldAssunto.getText();
		        JLabel textFieldMensagem;
				String mensagem = textFieldMensagem.getText();

		        if (de.isEmpty() || para.isEmpty() || assunto.isEmpty() || mensagem.isEmpty()) {
		            JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos.", "Erro", JOptionPane.ERROR_MESSAGE);
		            return;
		        }
			}
		
		
		});
		btnEnviar.setBounds(282, 426, 102, 34);
		getContentPane().add(btnEnviar);	
		
			}
		});
		ToSend1.setBounds(209, 451, 118, 34);
		getContentPane().add(ToSend1);
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(300, 100, 750, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
