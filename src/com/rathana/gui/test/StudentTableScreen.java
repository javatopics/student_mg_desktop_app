package com.rathana.gui.test;

import java.awt.BorderLayout;
import java.awt.Dimension;import java.awt.Graphics;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

import com.rathana.service.MainScreenService;
import com.rathana.service.impl.MainScreenServiceImpl;

public class StudentTableScreen extends JFrame {

	private TablePanelTest tablePanel;
	private MainScreenService studentService;
	public StudentTableScreen() {
		initializeVariables();
		constructLayout();
		refreshTable();
		
	}

	private void refreshTable() {
		this.tablePanel.updateDataTable();
	}

	private void constructLayout() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setExtendedState(MAXIMIZED_BOTH);
		setSize(new Dimension(690, 520));
		setLayout(new BorderLayout());
		
		//setData
		this.tablePanel.setStudentDataModel(this.studentService.getStudents());
		
		add(this.tablePanel,BorderLayout.CENTER);
	}

	private void initializeVariables() {
		this.tablePanel=new TablePanelTest();
		this.studentService=new MainScreenServiceImpl();
	}
	
	public static void main(String[] args) {
		new StudentTableScreen().setVisible(true);
	}
}


