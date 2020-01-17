package com.sinc.intern.excep.util;

// 사용자 정의 예외 클래스는 Exception 상속받아 사용
public class SincException extends Exception {
	public SincException () {
	}
	
	public SincException(String msg) {
		super(msg);
	}
}
