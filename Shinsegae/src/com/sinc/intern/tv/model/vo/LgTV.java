package com.sinc.intern.tv.model.vo;

import com.sinc.intern.tv.util.TV;

public class LgTV implements TV {
	public LgTV() {
		
	}

	@Override
	public void turnOn() {
		System.out.println("LTV turnOn()");
	}

	@Override
	public void turnOff() {
		System.out.println("LTV turnOff()");
	}

	@Override
	public void soundUp() {
		System.out.println("LTV soundUp()");
	}

	@Override
	public void soundDown() {
		System.out.println("LTV soundDown()");
	}
	
	

}
