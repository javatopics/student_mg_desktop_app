package com.rathana.gui.test;

import java.awt.BorderLayout;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

import com.rathana.entity.Student;

public class TablePanelTest extends JPanel {

	private JTable studentTable;
	private StudentTableModel studentModel;
	
	public TablePanelTest(){
		initializeVariales();
		constractLayout();
	}

	public void setStudentDataModel(List<Student> list){
		studentModel.setStudentList(list);

		System.out.println("number of students :"+ list.size());
	}
	public void updateDataTable(){
		studentModel.updateDataTable();
		System.out.println("TablePanel Created...");
	}
	private void constractLayout() {
		setLayout(new BorderLayout());
		setBorder(new EmptyBorder(5, 10, 5, 10));
		Border spaceBoder= BorderFactory.createEmptyBorder(5,5,5,5);
		setBorder(spaceBoder);
		
		this.add(this.studentTable,BorderLayout.CENTER);
	}

	private void initializeVariales() {
		this.studentModel=new StudentTableModel();
		this.studentTable=new JTable(this.studentModel);
	}

	
	
}
