// EditButton.java
package com.app.presentation.components.button;

import com.app.presentation.views.ClientGerency;
import com.app.presentation.views.EditClient;
import com.app.presentation.views.Client;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EditButton extends JButton {
    private ClientGerency clientGerency;
    private JTable tableClientes;

    public EditButton(ClientGerency clientGerency, JTable tableClientes) {
        super("Editar");
        this.clientGerency = clientGerency;
        this.tableClientes = tableClientes;

        // Desabilitar o botão inicialmente
        setEnabled(false);

        // Ação do botão Editar
        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = tableClientes.getSelectedRow();
                if (selectedRow >= 0) {
                    int confirm = JOptionPane.showConfirmDialog(clientGerency,
                            "Você tem certeza que deseja editar este cliente?",
                            "Confirmar Edição", JOptionPane.YES_NO_OPTION);
                    if (confirm == JOptionPane.YES_OPTION) {
                        int clientId = (int) tableClientes.getValueAt(selectedRow, 0);
                        String clientNome = (String) tableClientes.getValueAt(selectedRow, 1);
                        String clientEmail = (String) tableClientes.getValueAt(selectedRow, 2);
                        String clientTelefone = (String) tableClientes.getValueAt(selectedRow, 3);
                        String clientStatus = (String) tableClientes.getValueAt(selectedRow, 4);

                        Client client = new Client(clientId, clientNome, clientEmail, clientTelefone, clientStatus);

                        // Abre a tela de edição
                        new EditClient(clientGerency, client).setVisible(true);
                    }
                }
            }
        });
    }
}