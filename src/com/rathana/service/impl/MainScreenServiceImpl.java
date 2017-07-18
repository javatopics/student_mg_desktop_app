package com.rathana.service.impl;

import java.util.List;

import com.rathana.entity.Student;
import com.rathana.repository.StudentMemoryRepositry;
import com.rathana.service.MainScreenService;

public class MainScreenServiceImpl implements MainScreenService{

	private StudentMemoryRepositry stuMemory;
	
	public MainScreenServiceImpl() {
		this.stuMemory=new StudentMemoryRepositry();
	}
	@Override
	public List<Student> getStudents() {
		return this.stuMemory.getStudents();
	}

}
