// ClientGerency.java
package app.view;  // Pacote onde ClientGerency está localizado


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

import app.view.components.button.EditButton;
import app.view.components.button.RemoveButton;

public class ClientGerency extends JFrame {
    private static final long serialVersionUID = 1L;

    private JTable tableClientes;
    private DefaultTableModel tableModel;
    private EditButton btnEditar;  // Usando EditButton
    private RemoveButton btnExcluir;  // Usando RemoveButton
    private int selectedRow = -1;  // Variável para armazenar a linha selecionada
    private List<Client> clientes;

    public ClientGerency(List<Client> clientes) {
        this.clientes = clientes;
        
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

        // Instanciando os botões Editar e Excluir
        btnEditar = new EditButton(this, tableClientes);
        btnExcluir = new RemoveButton(this, tableClientes, clientes);

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
