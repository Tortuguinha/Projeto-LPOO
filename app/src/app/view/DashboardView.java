package app.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import java.util.List;

public class DashboardView extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    public DashboardView() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 750, 550);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JButton btnRegisterClient = new JButton("Cadastrar Cliente");
        btnRegisterClient.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ClientRegistration clientRegistration = new ClientRegistration(DashboardView.this);
                clientRegistration.setVisible(true);
                setVisible(false);
            }
        });
        
        JLabel lblPresentation = new JLabel("Olá, CALOSBERTO!");
        lblPresentation.setBounds(54, 62, 150, 14); // Ajustei o tamanho para caber o nome
        contentPane.add(lblPresentation);
        
        btnRegisterClient.setBounds(54, 112, 160, 39);
        contentPane.add(btnRegisterClient);
        
        JButton btnManageClient = new JButton("Gerenciar Clientes");
        btnManageClient.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Lista de clientes de exemplo
                List<Client> clientes = List.of(
                    new Client(1, "João Silva", "joaofigueredo@.com", "123456789", "Ativo"),
                    new Client(2, "Maria Souza", "mariaaparecida@.com", "987654321", "Inativo"),
                    new Client(2, "carlos roberto", "carlosRobertoliso@.com", "958658547", "pendente")
                );
                
                ClientGerency clientGerency = new ClientGerency(clientes, DashboardView.this);
                clientGerency.setVisible(true);
                setVisible(false);
            }
        });
        btnManageClient.setBounds(54, 171, 160, 39);
        contentPane.add(btnManageClient);
        
        JButton btnRegisterEmployee = new JButton("Cadastrar Funcionário");
        btnRegisterEmployee.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                EmployeeRegistration employeeRegistration = new EmployeeRegistration(DashboardView.this);
                employeeRegistration.setVisible(true);
                setVisible(false);
            }
        });
        btnRegisterEmployee.setBounds(54, 228, 160, 39);
        contentPane.add(btnRegisterEmployee);
        
        JButton btnManageSO = new JButton("Gerenciar OS");
        btnManageSO.setBounds(54, 285, 160, 39);
        contentPane.add(btnManageSO);
        
        JButton btnServiceHistory = new JButton("Histórico de Serviços");
        btnServiceHistory.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                List<ServiceOrder> ordensServico = List.of(
                    new ServiceOrder("001", "2024-02-01", "João Silva", "Troca de memoria ram", "Aberto", 150.00),
                    new ServiceOrder("002", "2024-01-28", "Maria Souza", "Revisão de gabinete", "Fechado", 400.00)  
                );
                
                ServiceHistory serviceHistory = new ServiceHistory(ordensServico);
                serviceHistory.setVisible(true);
                setVisible(false);
            }
        });
        btnServiceHistory.setBounds(54, 342, 160, 39);
        contentPane.add(btnServiceHistory);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            DashboardView frame = new DashboardView();
            frame.setVisible(true);
        });
    }
}
