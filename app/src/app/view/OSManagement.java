package app.view;

import javax.swing.*;
import java.awt.*;

public class OSManagement extends JFrame {
    private JTextField numeroOsField, dataAberturaField, clienteField, descricaoField, equipamentosField, statusField, valorTotalField, valorPagoField;
    private JButton cadastrarButton;
    
    public OSManagement() {
        setTitle("Gerenciamento de OS");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(9, 2, 5, 5));
        
        JLabel numeroOsLabel = new JLabel("Número da OS:");
        numeroOsField = new JTextField();
        JLabel dataAberturaLabel = new JLabel("Data de Abertura:");
        dataAberturaField = new JTextField();
        JLabel clienteLabel = new JLabel("Cliente:");
        clienteField = new JTextField();
        JLabel descricaoLabel = new JLabel("Descrição do Serviço:");
        descricaoField = new JTextField();
        JLabel equipamentosLabel = new JLabel("Equipamentos Envolvidos:");
        equipamentosField = new JTextField();
        JLabel statusLabel = new JLabel("Status:");
        statusField = new JTextField();
        JLabel valorTotalLabel = new JLabel("Valor Total:");
        valorTotalField = new JTextField();
        JLabel valorPagoLabel = new JLabel("Valor Pago:");
        valorPagoField = new JTextField();
        cadastrarButton = new JButton("Cadastrar");
        
        add(numeroOsLabel);
        add(numeroOsField);
        add(dataAberturaLabel);
        add(dataAberturaField);
        add(clienteLabel);
        add(clienteField);
        add(descricaoLabel);
        add(descricaoField);
        add(equipamentosLabel);
        add(equipamentosField);
        add(statusLabel);
        add(statusField);
        add(valorTotalLabel);
        add(valorTotalField);
        add(valorPagoLabel);
        add(valorPagoField);
        add(new JLabel());
        add(cadastrarButton);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new OSManagement().setVisible(true));
    }
}
