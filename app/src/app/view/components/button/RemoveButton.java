// RemoveButton.java
package app.view.components.button;

import app.view.ClientGerency;
import app.view.Client;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class RemoveButton extends JButton {
    private ClientGerency clientGerency;
    private JTable tableClientes;
    private List<Client> clientes;

    public RemoveButton(ClientGerency clientGerency, JTable tableClientes, List<Client> clientes) {
        super("Excluir");
        this.clientGerency = clientGerency;
        this.tableClientes = tableClientes;
        this.clientes = clientes;

        // Desabilitar o botão inicialmente
        setEnabled(false);

        // Ação do botão Excluir
        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = tableClientes.getSelectedRow();
                if (selectedRow >= 0) {
                    int confirm = JOptionPane.showConfirmDialog(clientGerency,
                            "Você tem certeza que deseja excluir este cliente?",
                            "Confirmar Exclusão", JOptionPane.YES_NO_OPTION);
                    if (confirm == JOptionPane.YES_OPTION) {
                        int clientId = (int) tableClientes.getValueAt(selectedRow, 0);

                        // Remover o cliente da lista e da tabela
                        clientes.removeIf(cliente -> cliente.getId() == clientId);
                        ((DefaultTableModel) tableClientes.getModel()).removeRow(selectedRow);

                        JOptionPane.showMessageDialog(clientGerency, "Cliente excluído com sucesso!");
                    }
                }
            }
        });
    }
}
