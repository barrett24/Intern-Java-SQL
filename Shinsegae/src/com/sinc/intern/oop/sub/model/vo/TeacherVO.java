package com.sinc.intern.oop.sub.model.vo;

import com.sinc.intern.oop.model.vo.PersonVO;

public class TeacherVO extends PersonVO{
	private String subject;

	public TeacherVO() {
		super();
	}

	public TeacherVO(String name, int age, char gender, String subject) {
		super(name, age, gender);
		this.setSubject(subject);
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public String teaInfo() {
		return super.perInfo() + "\t" + this.getSubject();
	}
	
	public String perInfo() {
		return super.perInfo() + "\t" + this.getSubject();
	}
}
