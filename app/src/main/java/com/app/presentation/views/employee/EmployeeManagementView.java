package com.app.presentation.views.employee;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.app.domain.entities.employee.EmployeeEntity;
import com.app.infrastructure.controllers.interfaces.IClientController;
import com.app.infrastructure.controllers.interfaces.IEmployeeController;
import com.app.presentation.views.DashboardView;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

public class EmployeeManagementView extends JFrame {

    private static final long serialVersionUID = 1L;
    private EmployeeEntity _loggedEmployee;
    private JPanel contentPane;
    private JTable employeeTable;
    IEmployeeController _employeeController;

    public EmployeeManagementView(
    		EmployeeEntity loggedEmployee, 
    		IEmployeeController employeeController
    		) {
    	this._loggedEmployee = loggedEmployee;
    	this._employeeController = employeeController;
        
    	this.components();
    }
    
    public void components() {
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 800, 600);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        
        String[] columnNames = {"CARGO", "STATUS", "CPF/CNPJ", "FUNCIONÁRIO"};
        
        List<EmployeeEntity> employees = this._employeeController.returnAllEmployees();
        
        Object[][] data = new Object[employees.size()][4];
        for(int i = 0; i < employees.size(); i++) {
        	EmployeeEntity emp = employees.get(i);
        	data[i][0] = emp.getRole().toString();
        	data[i][1] = emp.getStatus() ? "ATIVO" : "INATIVO";
        	data[i][2] = emp.getCPF();
        	data[i][3] = emp.getName();
        }
        
        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        employeeTable = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(employeeTable);
        scrollPane.setBounds(10, 10, 760, 400);
        contentPane.add(scrollPane);
        
        JButton backBtn = new JButton("Voltar");
        backBtn.setBounds(587, 460, 161, 39);
        backBtn.addActionListener(e -> {
        	this.dispose();
            DashboardView managementView = new DashboardView(this._loggedEmployee, this._employeeController);
            managementView.setVisible(true);
        });
        contentPane.add(backBtn);
        
        JLabel titleLabel = new JLabel("Olá," + this._loggedEmployee.getName());
        titleLabel.setBounds(39, 485, 166, 14);
        contentPane.add(titleLabel);

        employeeTable.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 1) { 
                    int row = employeeTable.getSelectedRow();
                    if (row != -1) {
                        String employeeCPF = (String) employeeTable.getValueAt(row, 2);
                        openEmployeeDetails(employeeCPF);
                    }
                }
            }
        });
    }

    private void openEmployeeDetails(String employeeCPF) {
    	
    	EmployeeEntity employee = this._employeeController.findEmployeeByCPF(employeeCPF);

        this.dispose();

        EmployeeInfoView detailsView = new EmployeeInfoView(employeeCPF, this._loggedEmployee, employee, this._employeeController);
        detailsView.setVisible(true);
    }
}