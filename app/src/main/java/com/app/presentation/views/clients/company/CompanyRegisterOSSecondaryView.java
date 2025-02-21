package com.app.presentation.views.clients.company;

import java.awt.EventQueue;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.app.domain.entities.ServiceOrderEntity;
import com.app.infrastructure.controllers.interfaces.IClientController;
import com.app.infrastructure.controllers.interfaces.ICompanyController;
import com.app.infrastructure.factories.ClientFactory;
import com.app.infrastructure.factories.CompanyFactory;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CompanyRegisterOSSecondaryView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField techResField;
	private JLabel extraInfoLabel_1;
	private JLabel finalCoustLabel;
	private JTextField finalCoustField;
	private JLabel financialLabel;
	private JLabel paymentFormLabel;
	private JComboBox<String> paymentComboBox;
	private JButton finishBtn;
	private ICompanyController companyController = CompanyFactory.getInstance();

	public CompanyRegisterOSSecondaryView(ServiceOrderEntity serviceOrder) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel extraInfoLabel = new JLabel("Informações Adicionais");
		extraInfoLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		extraInfoLabel.setBounds(103, 94, 148, 14);
		contentPane.add(extraInfoLabel);
		
		JLabel techResLabel = new JLabel("Técnico Responsável");
		techResLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		techResLabel.setBounds(103, 119, 148, 14);
		contentPane.add(techResLabel);
		
		techResField = new JTextField();
		techResField.setBounds(103, 144, 175, 26);
		contentPane.add(techResField);
		techResField.setColumns(10);
		
		extraInfoLabel_1 = new JLabel("Informações Adicionais");
		extraInfoLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		extraInfoLabel_1.setBounds(103, 210, 148, 14);
		contentPane.add(extraInfoLabel_1);
		
		finalCoustLabel = new JLabel("Custo Final");
		finalCoustLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		finalCoustLabel.setBounds(103, 235, 148, 14);
		contentPane.add(finalCoustLabel);
		
		finalCoustField = new JTextField();
		finalCoustField.setColumns(10);
		finalCoustField.setBounds(103, 260, 175, 26);
		contentPane.add(finalCoustField);
		
		financialLabel = new JLabel("Financeiro");
		financialLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		financialLabel.setBounds(103, 329, 148, 14);
		contentPane.add(financialLabel);
		
		paymentFormLabel = new JLabel("Forma de Pagamento");
		paymentFormLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		paymentFormLabel.setBounds(103, 354, 148, 14);
		contentPane.add(paymentFormLabel);
		
		String[] paymentOptions = {"Pix", "Crédito", "Débito"};
		
		paymentComboBox = new JComboBox<String>(paymentOptions);        
		paymentComboBox.setForeground(SystemColor.textHighlight);
		paymentComboBox.setFont(getFont());
		paymentComboBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		paymentComboBox.setBounds(103, 389, 161, 29);
        getContentPane().add(paymentComboBox);
        
        finishBtn = new JButton("Finalizar");
        finishBtn.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		 companyController.createOS(serviceOrder);
        	}
        });
        finishBtn.setBounds(616, 409, 118, 36);
        contentPane.add(finishBtn);
		
	}
}
