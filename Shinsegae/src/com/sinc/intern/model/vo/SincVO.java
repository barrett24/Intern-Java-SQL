package com.sinc.intern.model.vo;

public class SincVO {
	
	private static String DIVIDER = "\t";
	private String id, pwd, name;
	
	public SincVO() {
		super();
	}
	
	public SincVO(String id, String pwd, String name) { // 생성자 오버로딩
		super();
		this.id = id;
		this.pwd = pwd;
		this.name = name;
	}

	public void setInfo(String i, String p, String n) {
		this.id = i;
		this.pwd = p;
		this.name = n;
	}
	
	public String getInfo() {
		return id + DIVIDER + pwd + DIVIDER + name;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
