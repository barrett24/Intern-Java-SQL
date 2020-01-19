package com.sinc.stu;

public class StuVO {
	private static final String DIVIDER = " ";
	
	private String name;
	private int age;
	private int height;
	private int weight;
	
	public StuVO() {
		
	}
	
	public StuVO(String name, int age, int height, int weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public int getHeight() {
		return this.height;
	}
	
	public int getWeight() {
		return this.weight;
	}
	
	public String studentInfo() {
		return (name + DIVIDER + age 
				+ DIVIDER + height + DIVIDER + weight);
	}
}
