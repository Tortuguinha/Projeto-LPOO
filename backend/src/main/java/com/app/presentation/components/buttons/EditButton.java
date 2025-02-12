// EditButton.java
package com.app.presentation.components.buttons;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EditButton extends JButton {
    private JTable tableClientes;

    public EditButton() {
        super("Editar");
        this.tableClientes = tableClientes;

        // Desabilitar o botão inicialmente
        setEnabled(false);

        // Ação do botão Editar
        addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
