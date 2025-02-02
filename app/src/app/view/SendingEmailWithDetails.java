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
        setTitle("Detalhamento de Email\r\n");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(300, 100, 750, 550);
        getContentPane().setLayout(null);

        JLabel DetailsEmail = new JLabel("Detalhamento Email");
        DetailsEmail.setFont(new Font("Tahoma", Font.PLAIN, 15));
        DetailsEmail.setBounds(233, 28, 131, 34);
        getContentPane().add(DetailsEmail);

        JLabel De = new JLabel("De : ");
        De.setFont(new Font("Tahoma", Font.PLAIN, 15));
        De.setBounds(30, 91, 36, 14);
        getContentPane().add(De);

        campotextde = new JTextField();
        campotextde.setBounds(80, 86, 437, 29);
        getContentPane().add(campotextde);
        campotextde.setColumns(10);

        JLabel to = new JLabel("Para : ");
        to.setFont(new Font("Tahoma", Font.PLAIN, 15));
        to.setBounds(20, 133, 46, 14);
        getContentPane().add(to);

        campotextpara = new JTextField();
        campotextpara.setBounds(80, 126, 437, 32);
        getContentPane().add(campotextpara);
        campotextpara.setColumns(10);

        JLabel subject = new JLabel("Assunto: ");
        subject.setFont(new Font("Tahoma", Font.PLAIN, 15));
        subject.setBounds(20, 189, 66, 14);
        getContentPane().add(subject);

        campotextassunto = new JTextField();
        campotextassunto.setBounds(80, 181, 438, 34);
        getContentPane().add(campotextassunto);
        campotextassunto.setColumns(10);

        JLabel mensagemLabel = new JLabel("Mensagem: ");
        mensagemLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        mensagemLabel.setBounds(10, 320, 81, 14);
        getContentPane().add(mensagemLabel);

        campotextmensagem = new JTextArea();
        campotextmensagem.setBounds(90, 250, 438, 159);
        getContentPane().add(campotextmensagem);

        JButton ToRespond = new JButton("Responder");
        ToRespond.setFont(new Font("Tahoma", Font.PLAIN, 14));
        ToRespond.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Exemplo de preenchimento automático para resposta
                campotextpara.setText(campotextde.getText());
                campotextassunto.setText("Re: " + campotextassunto.getText());
                campotextmensagem.setText("Resposta: \n" + campotextmensagem.getText());

                JOptionPane.showMessageDialog(null, "Campos preenchidos para resposta.", "Informação", JOptionPane.INFORMATION_MESSAGE);
                System.out.println("Campos preenchidos para resposta.");
            }
        });
        ToRespond.setBounds(290, 426, 109, 34);
        getContentPane().add(ToRespond);

        JButton btnEnviar = new JButton("Enviar");
        btnEnviar.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnEnviar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String de = campotextde.getText();
                String para = campotextpara.getText();
                String assunto = campotextassunto.getText();
                String mensagem = campotextmensagem.getText();

                if (de.isEmpty() || para.isEmpty() || assunto.isEmpty() || mensagem.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos.", "Erro", JOptionPane.ERROR_MESSAGE);
                    System.out.println("Erro: Por favor, preencha todos os campos.");
                } else {
                    // Aqui você pode adicionar a lógica para enviar o email
                    JOptionPane.showMessageDialog(null, "Email enviado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    System.out.println("Email enviado com sucesso!");
                }
            }
        });
        btnEnviar.setBounds(409, 426, 102, 34);
        getContentPane().add(btnEnviar);
    }
}
