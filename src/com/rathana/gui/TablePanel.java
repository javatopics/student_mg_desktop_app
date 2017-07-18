package com.rathana.gui;


import java.awt.BorderLayout;
import java.awt.Font;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

import com.rathana.entity.Student;

public class TablePanel extends JPanel {

	private JTable studentTable;
	private StudentTableModel studentModel;
	private List<Student> students;
	public TablePanel(List<Student> list) {
		this.students=list;
		initialzeVariable();
		initializeLayout();
	}

	private void initializeLayout() {
		setLayout(new BorderLayout());
		setBorder(new EmptyBorder(5, 10, 5, 10));
		setFont(new Font("Khmer OS Battambang", Font.PLAIN, 20));
		add(new JScrollPane(this.studentTable), BorderLayout.CENTER);
	}

	private void initialzeVariable() {
		
		this.studentModel=new StudentTableModel(this.students);
		this.studentTable=new JTable(this.studentModel);
	}
	
	public void setStudentListTableModel(List<Student> list){
		this.studentModel.setStudentsList(list);
		System.out.println("List in talbePanel : "+list);
	}
	
	public void updateTable(){
		this.studentModel.updateTable();
	}
}
