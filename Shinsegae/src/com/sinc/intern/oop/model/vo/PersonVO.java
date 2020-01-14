package com.sinc.intern.oop.model.vo;

public class PersonVO {
	private String name;
	private int age;
	private char gender;
	
	public PersonVO() {
		super();
	}

	public PersonVO(String name, int age, char gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
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

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public String perInfo() {
		return this.getName() + "\t" 
				+ this.getAge() + "\t" + this.getGender();
	}
}
