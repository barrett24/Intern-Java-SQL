package com.sinc.intern.thread;

public class SincThread implements Runnable {

	@Override
	public void run() {
		for (int idx = 0; idx < 26; idx++) {
			System.out.print((char)('A' + idx));
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
