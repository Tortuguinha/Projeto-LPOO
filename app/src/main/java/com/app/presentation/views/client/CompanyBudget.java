package com.app.presentation.views.client;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JEditorPane;
import javax.swing.JComboBox;
import java.awt.SystemColor;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CompanyBudget {

	private JFrame frmOramentoEmpresa;
	private JTextField CAMPOTextNomeEmpresa;
	private JTextField CAMPOTextCNPJ;
	private JTextField CAMPOTextContato;
	private JTextField CampotextEmail;
	private JTextField textField;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CompanyBudget window = new CompanyBudget();
					window.frmOramentoEmpresa.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public CompanyBudget() {
		initialize();
	}

	
	private void initialize() {
		frmOramentoEmpresa = new JFrame();
		frmOramentoEmpresa.setTitle("Orçamento Empresa");
		frmOramentoEmpresa.setBounds(100, 100, 740, 580);
		frmOramentoEmpresa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmOramentoEmpresa.getContentPane().setLayout(null);
		
		JLabel lblOrcamentoEmpresa = new JLabel("Orçamento Empresa");
		lblOrcamentoEmpresa.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblOrcamentoEmpresa.setBounds(25, 24, 126, 29);
		frmOramentoEmpresa.getContentPane().add(lblOrcamentoEmpresa);
		
		JLabel lblDados = new JLabel("Dados");
		lblDados.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDados.setBounds(25, 77, 47, 29);
		frmOramentoEmpresa.getContentPane().add(lblDados);
		
		JLabel lblNomeEmpresa = new JLabel("Nome Empresa");
		lblNomeEmpresa.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNomeEmpresa.setBounds(25, 117, 106, 29);
		frmOramentoEmpresa.getContentPane().add(lblNomeEmpresa);
		
		CAMPOTextNomeEmpresa = new JTextField();
		CAMPOTextNomeEmpresa.setBounds(25, 141, 156, 20);
		frmOramentoEmpresa.getContentPane().add(CAMPOTextNomeEmpresa);
		CAMPOTextNomeEmpresa.setColumns(10);
		
		JLabel lblCnpj = new JLabel("CNPJ");
		lblCnpj.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCnpj.setBounds(25, 176, 47, 29);
		frmOramentoEmpresa.getContentPane().add(lblCnpj);
		
		CAMPOTextCNPJ = new JTextField();
		CAMPOTextCNPJ.setColumns(10);
		CAMPOTextCNPJ.setBounds(25, 216, 156, 20);
		frmOramentoEmpresa.getContentPane().add(CAMPOTextCNPJ);
		
		JLabel lblContato = new JLabel("Contato/Telefone");
		lblContato.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblContato.setBounds(25, 247, 106, 29);
		frmOramentoEmpresa.getContentPane().add(lblContato);
		
		CAMPOTextContato = new JTextField();
		CAMPOTextContato.setBounds(25, 286, 156, 20);
		frmOramentoEmpresa.getContentPane().add(CAMPOTextContato);
		CAMPOTextContato.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEmail.setBounds(25, 327, 47, 29);
		frmOramentoEmpresa.getContentPane().add(lblEmail);
		
		CampotextEmail = new JTextField();
		CampotextEmail.setColumns(10);
		CampotextEmail.setBounds(25, 354, 156, 20);
		frmOramentoEmpresa.getContentPane().add(CampotextEmail);
		
		JLabel lblinformaoes = new JLabel("Informaçoes");
		lblinformaoes.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblinformaoes.setBounds(316, 76, 84, 29);
		frmOramentoEmpresa.getContentPane().add(lblinformaoes);
		
		JEditorPane editorCampoText = new JEditorPane();
		editorCampoText.setBounds(264, 106, 200, 142);
		frmOramentoEmpresa.getContentPane().add(editorCampoText);
		
		JLabel lblEquipamentos = new JLabel("Equipamentos");
		lblEquipamentos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEquipamentos.setBounds(278, 290, 92, 29);
		frmOramentoEmpresa.getContentPane().add(lblEquipamentos);
		
		JComboBox comboBoxEquipamentos = new JComboBox();
		comboBoxEquipamentos.setForeground(SystemColor.textHighlight);
		comboBoxEquipamentos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBoxEquipamentos.setModel(new DefaultComboBoxModel(new String[] {"Desktop", "Notebook", "Laptop", "Monitor", "Teclado ", "Mouse", "Placa-Mãe", "Placa de Vídeo", "Fonte de Alimentação", "Unidade de CD/DVD"}));
		comboBoxEquipamentos.setBounds(278, 330, 167, 22);
		frmOramentoEmpresa.getContentPane().add(comboBoxEquipamentos);
		
		JLabel lblMarcamodelo = new JLabel("Marca/Modelo");
		lblMarcamodelo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMarcamodelo.setBounds(25, 396, 92, 29);
		frmOramentoEmpresa.getContentPane().add(lblMarcamodelo);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(25, 429, 156, 20);
		frmOramentoEmpresa.getContentPane().add(textField);
		
		JLabel lblTiposDeServio = new JLabel("Tipos De Serviço");
		lblTiposDeServio.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTiposDeServio.setBounds(563, 76, 106, 29);
		frmOramentoEmpresa.getContentPane().add(lblTiposDeServio);
		
		JComboBox comboBoxTipoDeServiço = new JComboBox();
		comboBoxTipoDeServiço.setForeground(SystemColor.textHighlight);
		comboBoxTipoDeServiço.setModel(new DefaultComboBoxModel(new String[] {"Diagnóstico de Problemas", "Reparação de Hardware", "Atualização de Hardware", "Instalação de Software", "Remoção de Vírus Malware", "Limpeza Interna", "Manutenção Preventiva", "Backup e Recuperação Dados"}));
		comboBoxTipoDeServiço.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBoxTipoDeServiço.setBounds(517, 138, 200, 22);
		frmOramentoEmpresa.getContentPane().add(comboBoxTipoDeServiço);
		
		JButton btnVoltar = new JButton("Voltar ");
		btnVoltar.setForeground(SystemColor.textHighlight);
		btnVoltar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnVoltar.setBounds(579, 364, 117, 35);
		frmOramentoEmpresa.getContentPane().add(btnVoltar);
		
		JButton btnContinuar = new JButton("Continuar");
		btnContinuar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnContinuar.setForeground(SystemColor.textHighlight);
		btnContinuar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnContinuar.setBounds(579, 414, 117, 35);
		frmOramentoEmpresa.getContentPane().add(btnContinuar);
	}
}
