package com.app.presentation.components.button;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;

public class ButtonComponent extends JButton {
	
	private static final long serialVersionUID = 1L;
	
	public ButtonComponent(String text) {
		super(text);
		this.init();
	}
	
	public void init() {
		this.setBackground(new Color(30, 144, 255));
		this.setForeground(Color.WHITE);
		this.setFocusPainted(false);
		this.setFont(new Font("Atial", Font.BOLD, 14));
		this.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
		this.setCursor(new Cursor(Cursor.HAND_CURSOR));
	}
}
