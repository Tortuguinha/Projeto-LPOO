package com.app.presentation.views;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

public class ServiceHistory extends JFrame {
    private static final long serialVersionUID = 1L;

    private JTable tableHistorico;
    private DefaultTableModel tableModel;

    public ServiceHistory(List<ServiceOrder> ordensServico) {
        setTitle("Histórico de Ordens de Serviço");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setLayout(new BorderLayout());

        // Criando tabela
        String[] colunas = {"Número", "Data", "Cliente", "Descrição", "Status", "Valor"};
        tableModel = new DefaultTableModel(colunas, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Impede edição das células
            }
        };

        tableHistorico = new JTable(tableModel);

        // Preencher tabela com os dados salvos
        for (ServiceOrder os : ordensServico) {  // Corrigido de ServiceScreen para ServiceOrder
            tableModel.addRow(new Object[]{
                    os.getNumero(),
                    os.getData(),
                    os.getCliente(),
                    os.getDescricao(),
                    os.getStatus(),
                    String.format("R$ %.2f", os.getValorTotal())
            });
        }

        // Adicionando a tabela à interface
        JScrollPane scrollPane = new JScrollPane(tableHistorico);
        getContentPane().add(scrollPane, BorderLayout.CENTER);
    }

    // Método main para testar esta tela separadamente
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new ServiceHistory(List.of(
                new ServiceOrder("001", "2024-02-01", "João Silva", "---", "Aberto", 150.00),
                new ServiceOrder("002", "2024-01-28", "Maria Souza", "---", "Fechado", 400.00)
            )).setVisible(true);
        });
    }
}