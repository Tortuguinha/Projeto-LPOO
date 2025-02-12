// RemoveButton.java
package com.app.presentation.components.buttons;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class RemoveButton extends JButton {
    private JTable tableClientes;

    public RemoveButton() {
        super("Excluir");
        this.tableClientes = tableClientes;

        // Desabilitar o botão inicialmente
        setEnabled(false);

        // Ação do botão Excluir
        addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               
            }
        });
    }
}
