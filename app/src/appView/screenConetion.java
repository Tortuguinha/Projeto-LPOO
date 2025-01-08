package appView;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class screenConetion extends JFrame {
    public screenConetion() {
        setTitle("Tela 1");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JButton botaoIrParaTela2 = new JButton("Ir para Tela 2");
        add(botaoIrParaTela2);

        // Ação para abrir Tela2
        botaoIrParaTela2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	screenConetion1 screenConetion1 = new screenConetion1(); // Instancia Tela2
            	screenConetion1.setVisible(true);   // Mostra Tela2
                dispose();                // Fecha Tela1
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new screenConetion(); // Abre a Tela1
    }
}

