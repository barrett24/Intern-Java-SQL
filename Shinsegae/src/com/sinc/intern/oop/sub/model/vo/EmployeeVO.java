package com.sinc.intern.oop.sub.model.vo;

import com.sinc.intern.oop.model.vo.PersonVO;

public class EmployeeVO extends PersonVO{
	private String dept;

	public EmployeeVO() {
		super();
	}

	public EmployeeVO(String name, int age, char gender, String dept) {
		super(name, age, gender);
		this.setDept(dept);
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public String empInfo() {
		return super.perInfo() + "\t" + this.getDept();
	}
	
	public String perInfo() {
		return super.perInfo() + "\t" + this.getDept();
	}
}
