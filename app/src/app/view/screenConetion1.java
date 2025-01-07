package app.view;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class screenConetion1 extends JFrame {
    public screenConetion1() {
        setTitle("Tela 2");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JButton botaoVoltar = new JButton("Voltar para Tela 1");
        add(botaoVoltar);

        // Ação para voltar para Tela1
        botaoVoltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	screenConetion screenConetion = new screenConetion(); // Instancia Tela1
            	screenConetion.setVisible(true);   // Mostra Tela1
                dispose();                // Fecha Tela2
            }
        });

        setVisible(true);
    }
}

