package com.sinc.intern.oop.sub.model.vo;
import com.sinc.intern.oop.model.vo.PersonVO; // 컨트롤 쉬프트 o 단축키

public class StudentVO extends PersonVO {
	private String ssn;

	public StudentVO() {
		super();
	}

	public StudentVO(String name, int age, char gender, String ssn) {
		super(name, age, gender);
		this.setSsn(ssn);
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	public String stuInfo() {
		return super.perInfo() + "\t" + this.getSsn();
	}
	
	public String perInfo() {
		return super.perInfo() + "\t" + this.getSsn();
	}
}
