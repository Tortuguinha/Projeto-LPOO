package app.view;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ServiceScreen extends JFrame {

    private static final long serialVersionUID = 1L;
    private JTextField txtNumero;

    // Campos para interface gráfica
    private JTextField TxtNumero;

    private JTextField txtCliente;
    private JTextArea txtDescricao;
    private JComboBox<String> cbStatus;
    private JTextField txtValorTotal;
    private JButton btnSalvar, btnLimpar;

    // Lista para armazenar as ordens de serviço
    private List<ServiceScreen> ordensServico = new ArrayList<>();

    // Campos para representar dados da ordem de serviço
    private String numero;
    private LocalDate data;
    private String cliente;
    private String descricao;
    private String status;
    private double valorTotal;

    // Construtor para uso como objeto de dados
    public ServiceScreen(String numero, LocalDate data, String cliente, String descricao, String status,
            double valorTotal) {
        this.numero = numero;
        this.data = data;
        this.cliente = cliente;
        this.descricao = descricao;
        this.status = status;
        this.valorTotal = valorTotal;
    }

    // Construtor para a tela gráfica
    public ServiceScreen() {
        setTitle("Cadastro de Ordem de Serviço");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setLayout(new BorderLayout());

        // Painel do formulário
        JPanel panelForm = new JPanel();
        txtNumero = new JTextField();
        txtNumero.setBounds(192, 26, 392, 39);
        txtNumero.setFont(new Font("Tahoma", Font.PLAIN, 13));
        txtCliente = new JTextField();
        txtCliente.setBounds(192, 87, 392, 39);
        txtCliente.setFont(new Font("Tahoma", Font.PLAIN, 13));
        cbStatus = new JComboBox<>(new String[] { "Aberto", "Fechado", "Pendente" });
        cbStatus.setBounds(182, 231, 87, 39);
        cbStatus.setFont(new Font("Tahoma", Font.PLAIN, 13));
        txtValorTotal = new JTextField();
        txtValorTotal.setBounds(192, 299, 392, 44);
        txtValorTotal.setHorizontalAlignment(SwingConstants.LEFT);
        txtValorTotal.setFont(new Font("Tahoma", Font.PLAIN, 13));
        panelForm.setLayout(null);

        JLabel label_4 = new JLabel("Número da OS:");
        label_4.setBounds(68, 25, 131, 39);
        label_4.setHorizontalAlignment(SwingConstants.CENTER);
        label_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
        panelForm.add(label_4);
        panelForm.add(txtNumero);
        JLabel label_3 = new JLabel("Cliente:");
        label_3.setBounds(106, 86, 107, 39);
        label_3.setHorizontalAlignment(SwingConstants.CENTER);
        label_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
        panelForm.add(label_3);
        panelForm.add(txtCliente);
        JLabel label_2 = new JLabel("Descrição do Serviço:");
        label_2.setBounds(37, 157, 163, 39);
        label_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
        label_2.setHorizontalAlignment(SwingConstants.CENTER);
        panelForm.add(label_2);
        JLabel label_1 = new JLabel("Status:");
        label_1.setBounds(106, 232, 87, 34);
        label_1.setHorizontalAlignment(SwingConstants.CENTER);
        label_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        panelForm.add(label_1);
        panelForm.add(cbStatus);
        JLabel label = new JLabel("Valor Total:");
        label.setBounds(81, 300, 119, 39);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setFont(new Font("Tahoma", Font.PLAIN, 15));
        panelForm.add(label);
        panelForm.add(txtValorTotal);

        getContentPane().add(panelForm, BorderLayout.CENTER);
        txtDescricao = new JTextArea(3, 20);
        txtDescricao.setBounds(192, 152, 392, 62);
        panelForm.add(txtDescricao);
        txtDescricao.setFont(new Font("Monospaced", Font.PLAIN, 14));
        
                // Painel de botões
                JPanel panelButtons = new JPanel(new FlowLayout());
                panelButtons.setBounds(0, 391, 584, 35);
                panelForm.add(panelButtons);
                btnSalvar = new JButton("Salvar");
                btnSalvar.setForeground(SystemColor.textHighlight);
                btnSalvar.setFont(new Font("Tahoma", Font.PLAIN, 13));
                btnLimpar = new JButton("Limpar");
                btnLimpar.setForeground(SystemColor.textHighlight);
                btnLimpar.setHorizontalAlignment(SwingConstants.RIGHT);
                btnLimpar.setFont(new Font("Tahoma", Font.PLAIN, 13));
                panelButtons.add(btnSalvar);
                panelButtons.add(btnLimpar);

        // Ações dos botões
        btnSalvar.addActionListener(e -> salvarOrdemServico());
        btnLimpar.addActionListener(e -> limparCampos());
    }

    private void salvarOrdemServico() {
        try {
            String numero = txtNumero.getText();
            String cliente = txtCliente.getText();
            String descricao = txtDescricao.getText();
            String status = (String) cbStatus.getSelectedItem();
            double valorTotal = Double.parseDouble(txtValorTotal.getText());

            // Criar uma nova ordem de serviço e adicioná-la à lista
            ServiceScreen os = new ServiceScreen(numero, LocalDate.now(), cliente, descricao, status, valorTotal);
            ordensServico.add(os);

            JOptionPane.showMessageDialog(this, "Ordem de Serviço salva com sucesso!");
            limparCampos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao salvar OS: " + e.getMessage(), "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private void limparCampos() {
        txtNumero.setText("");
        txtCliente.setText("");
        txtDescricao.setText("");
        cbStatus.setSelectedIndex(0);
        txtValorTotal.setText("");
    }

    @Override
    public String toString() {
        return "OS Número: " + numero + ", Cliente: " + cliente + ", Status: " + status + ", Valor: " + valorTotal;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ServiceScreen tela = new ServiceScreen();
            tela.setVisible(true);
        });
    }
}
