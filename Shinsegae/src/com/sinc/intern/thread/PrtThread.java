package com.sinc.intern.thread;

// 스래드가 공유하는 객체
// synchronized 키워드로 한 줄에 10번의 프린트는 보장된다

public class PrtThread {
	public synchronized void printChar(char c) {
		for (int idx = 0; idx < 10; idx++) {
			System.out.print(c);
		}
		System.out.println();
	}
}
