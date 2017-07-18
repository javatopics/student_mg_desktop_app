package com.rathana.entity;

public class Student {

	private int id;
	private String name;
	private int age;
	private String gender;
	private String country;
	private String zipCode;

	
	public Student(int id, String name, int age, String gender, String country, String zipCode) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.country = country;
		this.zipCode = zipCode;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", country=" + country
				+ ", zipCode=" + zipCode + "]";
	}
	
	
	
}
