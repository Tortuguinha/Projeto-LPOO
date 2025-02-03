package com.app.presentation.components.input;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JTextField;

public class InputComponent extends JTextField {
	private static final long serialVersionUID = 1L;
	
	public InputComponent() {
		this.init();
	}
	
	public void init() {
		this.setForeground(Color.BLACK);
		this.setFont(new Font("Arial", Font.PLAIN, 14));
		this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	}
}
