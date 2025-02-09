package app.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OSManagement extends JFrame {
    private JTextField numeroOsField, dataAberturaField, clienteField, descricaoField, equipamentosField, statusField, valorTotalField, valorPagoField;
    private JButton cadastrarButton;
    private JButton ButtonVoltar;
    
    public OSManagement() {
        setTitle("Gerenciamento de OS");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        JLabel numeroOsLabel = new JLabel("Número da OS:");
        numeroOsLabel.setBounds(56, 23, 137, 33);
        numeroOsLabel.setHorizontalAlignment(SwingConstants.CENTER);
        numeroOsLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        numeroOsField = new JTextField();
        numeroOsField.setBounds(188, 31, 289, 20);
        JLabel dataAberturaLabel = new JLabel("Data de Abertura:");
        dataAberturaLabel.setBounds(61, 67, 110, 33);
        dataAberturaLabel.setHorizontalAlignment(SwingConstants.CENTER);
        dataAberturaLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        dataAberturaField = new JTextField();
        dataAberturaField.setBounds(188, 75, 289, 20);
        JLabel clienteLabel = new JLabel("Cliente:");
        clienteLabel.setBounds(87, 111, 119, 33);
        clienteLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        clienteLabel.setHorizontalAlignment(SwingConstants.CENTER);
        clienteField = new JTextField();
        clienteField.setBounds(188, 116, 289, 27);
        JLabel descricaoLabel = new JLabel("Descrição do Serviço:");
        descricaoLabel.setBounds(34, 161, 153, 33);
        descricaoLabel.setHorizontalAlignment(SwingConstants.CENTER);
        descricaoLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        descricaoField = new JTextField();
        descricaoField.setBounds(188, 162, 289, 46);
        JLabel equipamentosLabel = new JLabel("Equipamentos Envolvidos:");
        equipamentosLabel.setBounds(10, 205, 171, 48);
        equipamentosLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        equipamentosLabel.setHorizontalAlignment(SwingConstants.CENTER);
        equipamentosField = new JTextField();
        equipamentosField.setBounds(188, 219, 289, 46);
        JLabel statusLabel = new JLabel("Status:");
        statusLabel.setBounds(102, 276, 90, 27);
        statusLabel.setHorizontalAlignment(SwingConstants.CENTER);
        statusLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        statusField = new JTextField();
        statusField.setBounds(188, 278, 289, 27);
        JLabel valorTotalLabel = new JLabel("Valor Total:");
        valorTotalLabel.setBounds(74, 322, 119, 33);
        valorTotalLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        valorTotalLabel.setHorizontalAlignment(SwingConstants.CENTER);
        valorTotalField = new JTextField();
        valorTotalField.setBounds(188, 327, 289, 27);
        JLabel valorPagoLabel = new JLabel("Valor Pago:");
        valorPagoLabel.setBounds(74, 366, 119, 33);
        valorPagoLabel.setHorizontalAlignment(SwingConstants.CENTER);
        valorPagoLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        valorPagoField = new JTextField();
        valorPagoField.setBounds(188, 374, 289, 20);
        cadastrarButton = new JButton("Cadastrar");
        cadastrarButton.setBounds(374, 411, 171, 33);
        cadastrarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String numeroOs = numeroOsField.getText();
                String dataAbertura = dataAberturaField.getText();
                String cliente = clienteField.getText();
                String descricao = descricaoField.getText();
                String equipamentos = equipamentosField.getText();
                String status = statusField.getText();
                String valorTotal = valorTotalField.getText();
                String valorPago = valorPagoField.getText();

                // Validações
                if (numeroOs.isEmpty() || numeroOs.length() > 10) {
                    System.out.println("Erro: Número da OS é obrigatório e deve ter no máximo 10 dígitos.");
                    JOptionPane.showMessageDialog(null, "Número da OS é obrigatório e deve ter no máximo 10 dígitos.", "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                if (!dataAbertura.matches("\\d{2}/\\d{2}/\\d{4}") || !validarData(dataAbertura)) {
                    System.out.println("Erro: Data de Abertura deve estar no formato DD/MM/AAAA e ser válida.");
                    JOptionPane.showMessageDialog(null, "Data de Abertura deve estar no formato DD/MM/AAAA e ser válida.", "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                if (cliente.isEmpty() || cliente.matches(".*\\d.*")) {
                    System.out.println("Erro: Cliente é obrigatório e deve conter apenas letras.");
                    JOptionPane.showMessageDialog(null, "Cliente é obrigatório e deve conter apenas letras.", "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                if (descricao.isEmpty() || descricao.matches(".*\\d.*")) {
                    System.out.println("Erro: Descrição do Serviço é obrigatória e deve conter apenas letras.");
                    JOptionPane.showMessageDialog(null, "Descrição do Serviço é obrigatória e deve conter apenas letras.", "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                if (equipamentos.isEmpty() || equipamentos.matches(".*\\d.*")) {
                    System.out.println("Erro: Equipamentos Envolvidos são obrigatórios e devem conter apenas letras.");
                    JOptionPane.showMessageDialog(null, "Equipamentos Envolvidos são obrigatórios e devem conter apenas letras.", "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                if (status.isEmpty() || status.length() > 7 || status.matches(".*\\d.*")) {
                    System.out.println("Erro: Status é obrigatório, deve conter apenas letras e ter no máximo 7 caracteres.");
                    JOptionPane.showMessageDialog(null, "Status é obrigatório, deve conter apenas letras e ter no máximo 7 caracteres.", "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                if (!valorTotal.matches("\\d+(,\\d{1,2})?")) {
                    System.out.println("Erro: Valor Total é obrigatório e deve conter apenas números ou números com vírgula.");
                    JOptionPane.showMessageDialog(null, "Valor Total é obrigatório e deve conter apenas números ou números com vírgula.", "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                if (!valorPago.matches("\\d+(,\\d{1,2})?")) {
                    System.out.println("Erro: Valor Pago é obrigatório e deve conter apenas números ou números com vírgula.");
                    JOptionPane.showMessageDialog(null, "Valor Pago é obrigatório e deve conter apenas números ou números com vírgula.", "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                // Exibindo os dados no terminal
                System.out.println("Número da OS: " + numeroOs);
                System.out.println("Data de Abertura: " + dataAbertura);
                System.out.println("Cliente: " + cliente);
                System.out.println("Descrição do Serviço: " + descricao);
                System.out.println("Equipamentos Envolvidos: " + equipamentos);
                System.out.println("Status: " + status);
                System.out.println("Valor Total: " + valorTotal);
                System.out.println("Valor Pago: " + valorPago);
            }
        });
        cadastrarButton.setForeground(SystemColor.textHighlight);
        cadastrarButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
        getContentPane().setLayout(null);
        
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
        getContentPane().add(cadastrarButton);
        
        ButtonVoltar = new JButton("Voltar\r\n");
        ButtonVoltar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		DashboardView dashboardView = new DashboardView();
                dashboardView.setVisible(true);
                
        	}
        });
        ButtonVoltar.setForeground(SystemColor.textHighlight);
        ButtonVoltar.setFont(new Font("Tahoma", Font.PLAIN, 15));
        ButtonVoltar.setBounds(186, 411, 128, 33);
        getContentPane().add(ButtonVoltar);
    }

    private boolean validarData(String data) {
        String[] partes = data.split("/");
        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);
        int ano = Integer.parseInt(partes[2]);

        if (mes < 1 || mes > 12 || dia < 1 || dia > 31 || ano > 2025) {
            return false;
        }

        // Verifica os dias máximos de cada mês
        if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) {
            return false;
        }
        if (mes == 2) {
            if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
                if (dia > 29) {
                    return false;
                }
            } else {
                if (dia > 28) {
                    return false;
                }
            }
        }

        return true;
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new OSManagement().setVisible(true));
    }
}
