package com.rathana.gui;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import com.rathana.entity.Student;

public class StudentTableModel extends AbstractTableModel {

	private static final long serialVersionUID = 1L;
	
	private List<Student> studentsList;
	private String[] columns={"ID","NAME", "AGE","GENDER","COUNTRY","ZIP CODE"};
	
	public StudentTableModel(List<Student> list) {
		if(list!=null){
			this.studentsList=list;
		}else{
			this.studentsList=new ArrayList<>();
		}
		
	}
	@Override
	public int getRowCount() {
		return this.studentsList.size();
	}

	@Override
	public int getColumnCount() {
		return this.columns.length;
	}
	
	@Override
	public String getColumnName(int column) {
		return columns[column];
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Student student=this.studentsList.get(rowIndex);
		switch (columnIndex) {
		case 0: return student.getId(); 
		case 1: return student.getName(); 
		case 2: return student.getAge();
		case 3: return student.getGender();
		case 4: return student.getCountry(); 
		case 5: return student.getZipCode();
		default:
			return null;
		}
		
	}
	
	public void setStudentsList(List<Student> list){
		this.studentsList=list;
		System.out.println("student table model: "+list);
	}
	public void updateTable(){
		fireTableDataChanged();
	}
}
