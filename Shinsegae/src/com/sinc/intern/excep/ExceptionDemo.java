package com.sinc.intern.excep;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.sinc.intern.excep.util.SincException;

public class ExceptionDemo {
	public void compileE() throws Exception {
		// 자바에서 지역변수들은 선언과 동시에 초기화가 필요하다
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		isr = new InputStreamReader(System.in);
		br = new BufferedReader(isr);
		
		String msg = br.readLine();
		System.out.println(msg);
	}
	
	@SuppressWarnings("finally")
	public boolean a(int flag) throws SincException {
		System.out.println("before a");
		try {
			if (flag == 1) {
				System.out.println("success");
				return true;
			} else {
				try {
					throw new SincException("sinc exception execution");
				} finally {
					return false;
				}
			}
		}finally {
				System.out.println("after a");
		}
	}
	
	public boolean b(int flag) {
		return false;
	}
	
	public boolean c(int flag) {
		return false;
	}
}
