package com.sinc.intern.thread;


public class CharThread implements Runnable {
	
	private char charValue;
	private PrtThread monitor;
	
	public CharThread() {
	}
	
	public CharThread(char charValue, PrtThread monitor) {
		this.charValue = charValue;
		this.monitor = monitor;
	}
	@Override
	public void run() {
		// synchronized 블록을 통해 각 쓰레드별로 작업을 동기화
		synchronized (monitor) {
			for (int idx = 0; idx < 10; idx++) {
				monitor.printChar(charValue);
			}	
		}
	}
}
