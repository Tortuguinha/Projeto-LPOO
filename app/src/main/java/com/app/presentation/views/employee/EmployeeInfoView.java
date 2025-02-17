package com.app.presentation.views.employee;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;

public class EmployeeInfoView extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private String employeeId;

    public EmployeeInfoView(String employeeId) {
        this.employeeId = employeeId;
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 600, 400);
        setTitle("Detalhes do Funcionário - Matrícula: " + employeeId);

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout());

        // Exemplo de exibição dos detalhes do funcionário
        JLabel detailsLabel = new JLabel("Detalhes do Funcionário com Matrícula: " + employeeId, SwingConstants.CENTER);
        detailsLabel.setFont(new Font("Arial", Font.BOLD, 16));
        contentPane.add(detailsLabel, BorderLayout.CENTER);

        // Botão de voltar (opcional)
        JButton backButton = new JButton("Voltar");
        backButton.setForeground(SystemColor.textHighlight);
        backButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
        backButton.addActionListener(e -> {
            this.dispose(); // Fecha a tela de detalhes
            EmployeeManagementView managementView = new EmployeeManagementView();
            managementView.setVisible(true); // Reabre a tela de gerenciamento
        });
        contentPane.add(backButton, BorderLayout.SOUTH);
    }
}