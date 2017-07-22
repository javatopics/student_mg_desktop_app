package com.rathana.repository;


import java.util.ArrayList;
import java.util.List;

import com.rathana.entity.Student;

public class StudentMemoryRepositry {

	private List<Student> students= new ArrayList<>();
	
	public StudentMemoryRepositry() {
		
		this.students.add(new Student(1,"Rathana", 23, "male", "Cambodai", "21000"));
		this.students.add(new Student(2,"Saravit", 21, "male", "Cambodai", "21000"));
		this.students.add(new Student(3,"Thearin", 20, "female", "Cambodai", "21000"));
		this.students.add(new Student(4,"Daraka", 15, "female", "Cambodai", "21000"));
		this.students.add(new Student(5,"Chhoun", 26, "male", "Cambodai", "21000"));
	
	}
	
	public void addStudent(Student student){
		if(student!=null) {
			students.add(student);
		}
	}
	
	public List<Student> getStudents(){
		return this.students;
	}
	
	public void removeStudent(Student student){
		this.students.remove(student);
	}
}
