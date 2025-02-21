package com.app.presentation.views.clients.client;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

import com.app.domain.entities.ServiceOrderEntity;

import javax.management.RuntimeErrorException;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class ClientRegisterOSView extends JFrame {

	private JFrame frame;
	private JTextField cpfField;
	private JTextField codeOSField;
	private JTextField codeBUField;
	private JTextField urgencyField;
	private JTextField deliveryDateField;
	private JTextField detailsField;
	private JTextField problemsField;
	private JTextField equipDescField;
	private JTextField modelField;
	private JTextField serialNumberField;

	public ClientRegisterOSView() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 702, 412);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel dataLabel = new JLabel("Dados");
		dataLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		dataLabel.setBounds(10, 11, 46, 14);
		frame.getContentPane().add(dataLabel);
		
		JLabel cpfLabel = new JLabel("CPF do Cliente");
		cpfLabel.setBounds(10, 36, 152, 14);
		frame.getContentPane().add(cpfLabel);
		
		cpfField = new JTextField();
		cpfField.setBounds(10, 61, 179, 31);
		frame.getContentPane().add(cpfField);
		cpfField.setColumns(10);
		
		JLabel codeOSLabel = new JLabel("Código de Ordem de Serviço");
		codeOSLabel.setBounds(10, 103, 169, 14);
		frame.getContentPane().add(codeOSLabel);
		
		codeOSField = new JTextField();
		codeOSField.setBounds(10, 128, 179, 28);
		frame.getContentPane().add(codeOSField);
		codeOSField.setColumns(10);
		
		JLabel codeBULabel = new JLabel("Código do Orçamento");
		codeBULabel.setBounds(10, 159, 169, 14);
		frame.getContentPane().add(codeBULabel);
		
		codeBUField = new JTextField();
		codeBUField.setBounds(10, 182, 179, 28);
		frame.getContentPane().add(codeBUField);
		codeBUField.setColumns(10);
		
		JLabel priorityLabel = new JLabel("Prioridade e Prazo");
		priorityLabel.setBounds(10, 221, 122, 14);
		frame.getContentPane().add(priorityLabel);
		
		urgencyField = new JTextField();
		urgencyField.setBounds(10, 271, 86, 28);
		frame.getContentPane().add(urgencyField);
		urgencyField.setColumns(10);
		
		JLabel urgencyLabel = new JLabel("Nível de Urgência");
		urgencyLabel.setBounds(10, 246, 137, 14);
		frame.getContentPane().add(urgencyLabel);
		
		JLabel deliveryDateLabel = new JLabel("Data de Entrega");
		deliveryDateLabel.setBounds(12, 304, 103, 14);
		frame.getContentPane().add(deliveryDateLabel);
		
		deliveryDateField = new JTextField();
		deliveryDateField.setBounds(10, 329, 86, 33);
		frame.getContentPane().add(deliveryDateField);
		deliveryDateField.setColumns(10);
		
		JLabel infoLabel = new JLabel("Informações");
		infoLabel.setBounds(253, 13, 146, 14);
		frame.getContentPane().add(infoLabel);
		
		detailsField = new JTextField();
		detailsField.setBounds(253, 61, 181, 72);
		frame.getContentPane().add(detailsField);
		detailsField.setColumns(10);
		
		JLabel detailsLabel = new JLabel("Detalhes sobre o defeito ou necessidade");
		detailsLabel.setBounds(253, 36, 245, 14);
		frame.getContentPane().add(detailsLabel);
		
		JLabel problemsLabel = new JLabel("Sintomas Apresentados (se houver)");
		problemsLabel.setBounds(258, 159, 179, 14);
		frame.getContentPane().add(problemsLabel);
		
		problemsField = new JTextField();
		problemsField.setBounds(256, 186, 181, 74);
		frame.getContentPane().add(problemsField);
		problemsField.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("Dados do Equipamento");
		lblNewLabel_10.setBounds(513, 13, 122, 14);
		frame.getContentPane().add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Descriçao do equipamento");
		lblNewLabel_11.setBounds(513, 36, 163, 14);
		frame.getContentPane().add(lblNewLabel_11);
		
		equipDescField = new JTextField();
		equipDescField.setBounds(513, 63, 160, 26);
		frame.getContentPane().add(equipDescField);
		equipDescField.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("Marca/Modelo");
		lblNewLabel_12.setBounds(516, 103, 146, 14);
		frame.getContentPane().add(lblNewLabel_12);
		
		modelField = new JTextField();
		modelField.setBounds(513, 132, 160, 20);
		frame.getContentPane().add(modelField);
		modelField.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("Número de Série");
		lblNewLabel_13.setBounds(516, 176, 109, 14);
		frame.getContentPane().add(lblNewLabel_13);
		
		serialNumberField = new JTextField();
		serialNumberField.setBounds(513, 201, 86, 20);
		frame.getContentPane().add(serialNumberField);
		serialNumberField.setColumns(10);
		
		JButton btnNewButton = new JButton("Criar O.S");
		btnNewButton.setForeground(SystemColor.textHighlight);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String dateString = deliveryDateField.getText();
				SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
				
				try {
					Date deliveryDate = dateFormat.parse(dateString);
					
					ServiceOrderEntity serviceOrder = new ServiceOrderEntity(
							cpfField.getText(), 
							codeBUField.getText(), 
							equipDescField.getText(), 
							modelField.getText(), 
							serialNumberField.getText(), 
							detailsField.getText(),
							problemsField.getText(),
							urgencyField.getText(),
							deliveryDate,
							new Date(), 
							null, 
							null, 
							null);
					
					ClientRegisterOSSecondaryView clientRegisterOSSec = new ClientRegisterOSSecondaryView(serviceOrder);
					
					clientRegisterOSSec.setVisible(true);
					dispose();
					 
					
				} catch (ParseException error) {
						error.printStackTrace();
				}
				
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(546, 329, 130, 33);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Voltar ao Início");
		btnNewButton_1.setForeground(SystemColor.textHighlight);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1.setBounds(546, 292, 127, 31);
		frame.getContentPane().add(btnNewButton_1);
	}

}
