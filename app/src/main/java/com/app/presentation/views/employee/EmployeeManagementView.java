package com.app.presentation.views.employee;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class EmployeeManagementView extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTable employeeTable;

    public EmployeeManagementView() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 800, 600);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        // Cria a tabela de funcionários
        String[] columnNames = {"TIPO", "STATUS", "MATRÍCULA", "Nome", "Departamento"};
        Object[][] data = {
            {"Funcionário", "ATIVO", "12345", "João Silva", "TI"},
            {"Funcionário", "ATIVO", "67890", "Maria Oliveira", "RH"},
            {"Funcionário", "INATIVO", "54321", "Carlos Souza", "Vendas"}
        };

        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        employeeTable = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(employeeTable);
        scrollPane.setBounds(10, 10, 760, 400);
        contentPane.add(scrollPane);

        // Adiciona um listener para quando o usuário clicar em um funcionário
        employeeTable.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 1) { // Cique único para selecionar
                    int row = employeeTable.getSelectedRow();
                    if (row != -1) { // Verifica se uma linha válida foi selecionada
                        String employeeId = (String) employeeTable.getValueAt(row, 2); // Obtém a matrícula
                        openEmployeeDetails(employeeId); // Abre a tela de detalhes
                    }
                }
            }
        });
    }

    private void openEmployeeDetails(String employeeId) {
        // Fecha a tela atual (opcional)
        this.dispose();

        // Abre a tela de gerenciamento dos dados do funcionário
        EmployeeInfoView detailsView = new EmployeeInfoView(employeeId);
        detailsView.setVisible(true);
    }

}