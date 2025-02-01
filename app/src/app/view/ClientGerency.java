package app.view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.util.List;

public class ClientGerency extends JFrame {
    private static final long serialVersionUID = 1L;

    private JTable tableClientes;
    private DefaultTableModel tableModel;
    private JButton btnEditar;
    private JButton btnExcluir;
    private int selectedRow = -1;  // Variável para armazenar a linha selecionada

    public ClientGerency(List<Client> clientes) {
        // Configuração da janela
        configurarJanela();

        // Criar e configurar a tabela
        configurarTabela();

        // Preencher a tabela com os dados
        preencherTabela(clientes);

        // Adicionar componentes à janela
        adicionarComponentes();
    }

    private void configurarJanela() {
        setTitle("Gerenciamento de Clientes");
        setSize(800, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
    }

    private void configurarTabela() {
        String[] colunas = {"ID", "Nome", "Email", "Telefone", "Status"};
        tableModel = new DefaultTableModel(colunas, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Impede edição das células
            }
        };

        tableClientes = new JTable(tableModel);
        tableClientes.setFont(new Font("Arial", Font.PLAIN, 12));
        tableClientes.setRowHeight(30);
        tableClientes.setSelectionBackground(new Color(135, 206, 235));
        tableClientes.setSelectionForeground(Color.BLACK);

        // Adicionando MouseListener para detectar o clique na tabela
        tableClientes.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                selectedRow = tableClientes.getSelectedRow();
                if (selectedRow >= 0) {
                    btnEditar.setEnabled(true);  // Habilitar botão Editar
                    btnExcluir.setEnabled(true); // Habilitar botão Excluir
                }
            }
        });
    }

    private void preencherTabela(List<Client> clientes) {
        for (Client cliente : clientes) {
            tableModel.addRow(new Object[]{
                    cliente.getId(),
                    cliente.getNome(),
                    cliente.getEmail(),
                    cliente.getTelefone(),
                    cliente.getStatus()
            });
        }
    }

    private void adicionarComponentes() {
        // Adicionando a tabela à interface dentro de um JScrollPane
        JScrollPane scrollPane = new JScrollPane(tableClientes);
        scrollPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        add(scrollPane, BorderLayout.CENTER);

        // Adicionando um painel para os botões
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.LEFT));

        // Botões Editar e Excluir
        btnEditar = new JButton("Editar");
        btnExcluir = new JButton("Excluir");

        // Desabilitar botões inicialmente
        btnEditar.setEnabled(false);
        btnExcluir.setEnabled(false);

        // Ação para Editar
        btnEditar.addActionListener(e -> {
            if (selectedRow >= 0) {
                int confirm = JOptionPane.showConfirmDialog(this, 
                        "Você tem certeza que deseja editar este cliente?", 
                        "Confirmar Edição", JOptionPane.YES_NO_OPTION);
                if (confirm == JOptionPane.YES_OPTION) {
                    // Lógica para editar (pode abrir uma tela de edição, por exemplo)
                    int clientId = (int) tableClientes.getValueAt(selectedRow, 0);
                    String clientNome = (String) tableClientes.getValueAt(selectedRow, 1);
                    String clientEmail = (String) tableClientes.getValueAt(selectedRow, 2);
                    String clientTelefone = (String) tableClientes.getValueAt(selectedRow, 3);
                    String clientStatus = (String) tableClientes.getValueAt(selectedRow, 4);

                    Client client = new Client(clientId, clientNome, clientEmail, clientTelefone, clientStatus);

                    // Abre a tela de edição
                    new EditClient(ClientGerency.this, client).setVisible(true);
                }
            }
        });

        // Ação para Excluir
        btnEditar.addActionListener(evt -> {
            if (selectedRow >= 0) {
                int confirm = JOptionPane.showConfirmDialog(this, 
                        "Você tem certeza que deseja editar este cliente?", 
                        "Confirmar Edição", JOptionPane.YES_NO_OPTION);
                if (confirm == JOptionPane.YES_OPTION) {
                    // Captura os dados da linha selecionada
                    int clientId = (int) tableClientes.getValueAt(selectedRow, 0);
                    String clientNome = (String) tableClientes.getValueAt(selectedRow, 1);
                    String clientEmail = (String) tableClientes.getValueAt(selectedRow, 2);
                    String clientTelefone = (String) tableClientes.getValueAt(selectedRow, 3);
                    String clientStatus = (String) tableClientes.getValueAt(selectedRow, 4);

                    // Criar o objeto Client (final)
                    final Client client = new Client(clientId, clientNome, clientEmail, clientTelefone, clientStatus);

                    // Abre a tela de edição
                    new EditClient(this, client).setVisible(true);
                }
            }
        });

        panel.add(btnEditar);
        panel.add(btnExcluir);

        add(panel, BorderLayout.SOUTH);
    }

    // Método main para testar esta tela separadamente
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new ClientGerency(List.of(
                new Client(1, "João Silva", "joao@exemplo.com", "123456789", "Ativo"),
                new Client(2, "Maria Souza", "maria@exemplo.com", "987654321", "Inativo")
            )).setVisible(true);
        });
    }
}

class Client {
    private int id;
    private String nome;
    private String email;
    private String telefone;
    private String status;

    public Client(int id, String nome, String email, String telefone, String status) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getStatus() {
        return status;
    }
}
