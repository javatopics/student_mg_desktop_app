package com.rathana.gui.test;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import com.rathana.entity.Student;

public class StudentTableModel extends AbstractTableModel{

	private List<Student> list;
	private String[] columns={"Name","gender","Country"};
	
	@Override
	public int getRowCount() {
		System.out.println("list Size : " + this.list.size());
		return this.list.size();
	}

	@Override
	public int getColumnCount() {
		return this.columns.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Student student =list.get(rowIndex);
		//System.out.println("data binded...");
		switch(columnIndex){
			case 0 : return student.getName();
			case 1: return student.getGender();
			case 2: return student.getCountry();
			default : return null;
		}
	
	}
	public String getColumnName(int columnIndex){
		return this.columns[columnIndex];
	}
	
	public void setStudentList(List<Student> list){
		this.list=list;
		System.out.println("students : "+this.list.size());
	}
	
	public void updateDataTable(){
		fireTableDataChanged();
		System.out.println("update Data...");
	}

}
