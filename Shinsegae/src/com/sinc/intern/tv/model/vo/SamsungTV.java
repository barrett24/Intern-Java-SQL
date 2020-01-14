package com.sinc.intern.tv.model.vo;

import com.sinc.intern.tv.util.TV;

public class SamsungTV implements TV{
	public SamsungTV() {
		
	}
	
	@Override
	public void turnOn() {
		System.out.println("STV turnOn()");
	}
	
	@Override
	public void turnOff() {
		System.out.println("STV turnOff()");
	}
	
	@Override
	public void soundUp() {
		System.out.println("STV soundUp()");
	}
	
	@Override
	public void soundDown() {
		System.out.println("STV soundDown()");
	}
	
}
