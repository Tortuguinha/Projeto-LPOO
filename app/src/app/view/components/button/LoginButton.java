package app.view.components.button;

import javax.swing.*;
import java.awt.*;

public class LoginButton extends JButton {
	private static final long serialVersionUID = 1L;
	
	public LoginButton(String text) {
		super(text);
		this.initButton();
	}
	
	public void initButton() {
		this.setBackground(new Color(30, 144, 255));
		this.setForeground(Color.WHITE);
		this.setFocusPainted(false);
		this.setFont(new Font("Arial", Font.BOLD, 14));
		this.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
		this.setCursor(new Cursor(Cursor.HAND_CURSOR));
	}
}
