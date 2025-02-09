package app;

import java.awt.EventQueue;
import app.model.User;
import app.view.LoginView;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    // Exemplo de usuários
                    List<User> users = new ArrayList<>();
                    users.add(new User("administrador", "12345687"));

                    LoginView frame = new LoginView(users);
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
