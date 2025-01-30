package app.view;

import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SendingEmailWithDetails extends JFrame {

    private static final long serialVersionUID = 1L;
    private JTextField campotextde;
    private JTextField campotextpara;
    private JTextField campotextassunto;
    private JTextArea campotextmensagem;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    SendingEmailWithDetails window = new SendingEmailWithDetails();
                    window.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public SendingEmailWithDetails() {
        setTitle("Sending email with details");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(300, 100, 750, 550);
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

        campotextassunto = new JTextField();
        campotextassunto.setBounds(65, 200, 438, 20);
        getContentPane().add(campotextassunto);
        campotextassunto.setColumns(10);

        JLabel mensagemLabel = new JLabel("Mensagem : ");
        mensagemLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
        mensagemLabel.setBounds(10, 240, 70, 14);
        getContentPane().add(mensagemLabel);

        campotextmensagem = new JTextArea();
        campotextmensagem.setBounds(65, 240, 438, 159);
        getContentPane().add(campotextmensagem);

        JButton ToRespond = new JButton("Responder");
        ToRespond.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Exemplo de preenchimento automático para resposta
                campotextpara.setText(campotextde.getText());
                campotextassunto.setText("Re: " + campotextassunto.getText());
                campotextmensagem.setText("Resposta: \n" + campotextmensagem.getText());

                JOptionPane.showMessageDialog(null, "Campos preenchidos para resposta.", "Informação", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        ToRespond.setBounds(91, 426, 109, 34);
        getContentPane().add(ToRespond);

        JButton btnEnviar = new JButton("Enviar");
        btnEnviar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String de = campotextde.getText();
                String para = campotextpara.getText();
                String assunto = campotextassunto.getText();
                String mensagem = campotextmensagem.getText();

                if (de.isEmpty() || para.isEmpty() || assunto.isEmpty() || mensagem.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos.", "Erro", JOptionPane.ERROR_MESSAGE);
                } else {
                    // Aqui você pode adicionar a lógica para enviar o email
                    JOptionPane.showMessageDialog(null, "Email enviado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        btnEnviar.setBounds(282, 426, 102, 34);
        getContentPane().add(btnEnviar);
    }
}