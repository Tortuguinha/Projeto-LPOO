package app.view;

import javax.swing.*;
import java.awt.*;

public class OSManagement extends JFrame {
    private JTextField numeroOsField, dataAberturaField, clienteField, descricaoField, equipamentosField, statusField, valorTotalField, valorPagoField;
    private JButton cadastrarButton;
    
    public OSManagement() {
        setTitle("Gerenciamento de OS");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setLayout(new GridLayout(9, 2, 5, 5));
        
        JLabel numeroOsLabel = new JLabel("Número da OS:");
        numeroOsLabel.setHorizontalAlignment(SwingConstants.CENTER);
        numeroOsLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        numeroOsField = new JTextField();
        JLabel dataAberturaLabel = new JLabel("Data de Abertura:");
        dataAberturaLabel.setHorizontalAlignment(SwingConstants.CENTER);
        dataAberturaLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        dataAberturaField = new JTextField();
        JLabel clienteLabel = new JLabel("Cliente:");
        clienteLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        clienteLabel.setHorizontalAlignment(SwingConstants.CENTER);
        clienteField = new JTextField();
        JLabel descricaoLabel = new JLabel("Descrição do Serviço:");
        descricaoLabel.setHorizontalAlignment(SwingConstants.CENTER);
        descricaoLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        descricaoField = new JTextField();
        JLabel equipamentosLabel = new JLabel("Equipamentos Envolvidos:");
        equipamentosLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        equipamentosLabel.setHorizontalAlignment(SwingConstants.CENTER);
        equipamentosField = new JTextField();
        JLabel statusLabel = new JLabel("Status:");
        statusLabel.setHorizontalAlignment(SwingConstants.CENTER);
        statusLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        statusField = new JTextField();
        JLabel valorTotalLabel = new JLabel("Valor Total:");
        valorTotalLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        valorTotalLabel.setHorizontalAlignment(SwingConstants.CENTER);
        valorTotalField = new JTextField();
        JLabel valorPagoLabel = new JLabel("Valor Pago:");
        valorPagoLabel.setHorizontalAlignment(SwingConstants.CENTER);
        valorPagoLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        valorPagoField = new JTextField();
        cadastrarButton = new JButton("Cadastrar");
        cadastrarButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
        
        getContentPane().add(numeroOsLabel);
        getContentPane().add(numeroOsField);
        getContentPane().add(dataAberturaLabel);
        getContentPane().add(dataAberturaField);
        getContentPane().add(clienteLabel);
        getContentPane().add(clienteField);
        getContentPane().add(descricaoLabel);
        getContentPane().add(descricaoField);
        getContentPane().add(equipamentosLabel);
        getContentPane().add(equipamentosField);
        getContentPane().add(statusLabel);
        getContentPane().add(statusField);
        getContentPane().add(valorTotalLabel);
        getContentPane().add(valorTotalField);
        getContentPane().add(valorPagoLabel);
        getContentPane().add(valorPagoField);
        getContentPane().add(new JLabel());
        getContentPane().add(cadastrarButton);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new OSManagement().setVisible(true));
    }
}
