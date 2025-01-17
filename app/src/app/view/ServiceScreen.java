package app.view;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ServiceScreen extends JFrame {
<<<<<<< HEAD
<<<<<<< HEAD
    
	private static final long serialVersionUID = 1L;
	private JTextField txtNumero;
=======
=======
>>>>>>> ea8ee45fedcb6251f716c06cf27a2e97c76b356d
    // Campos para interface gráfica
    private JTextField txtNumero;
>>>>>>> ea8ee45fedcb6251f716c06cf27a2e97c76b356d
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
    public ServiceScreen(String numero, LocalDate data, String cliente, String descricao, String status, double valorTotal) {
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
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Painel do formulário
        JPanel panelForm = new JPanel(new GridLayout(6, 2, 10, 10));
        txtNumero = new JTextField();
        txtCliente = new JTextField();
        txtDescricao = new JTextArea(3, 20);
        cbStatus = new JComboBox<>(new String[]{"Aberto", "Fechado", "Pendente"});
        txtValorTotal = new JTextField();

        panelForm.add(new JLabel("Número da OS:"));
        panelForm.add(txtNumero);
        panelForm.add(new JLabel("Cliente:"));
        panelForm.add(txtCliente);
        panelForm.add(new JLabel("Descrição do Serviço:"));
        panelForm.add(new JScrollPane(txtDescricao));
        panelForm.add(new JLabel("Status:"));
        panelForm.add(cbStatus);
        panelForm.add(new JLabel("Valor Total:"));
        panelForm.add(txtValorTotal);

        // Painel de botões
        JPanel panelButtons = new JPanel(new FlowLayout());
        btnSalvar = new JButton("Salvar");
        btnLimpar = new JButton("Limpar");
        panelButtons.add(btnSalvar);
        panelButtons.add(btnLimpar);

        add(panelForm, BorderLayout.CENTER);
        add(panelButtons, BorderLayout.SOUTH);

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
            JOptionPane.showMessageDialog(this, "Erro ao salvar OS: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
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
