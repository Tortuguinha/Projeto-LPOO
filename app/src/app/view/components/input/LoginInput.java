package app.view.components.input;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JTextField;

public class LoginInput extends JTextField {
	
	private static final long serialVersionUID = 1L;
	
	public  LoginInput() {
		this.initInput();
	}
	
	public void initInput() {
		this.setForeground(Color.BLACK);
		this.setFont(new Font("Arial", Font.PLAIN, 14));
		this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	}
}
