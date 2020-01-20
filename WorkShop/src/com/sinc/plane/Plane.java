package com.sinc.plane;

public abstract class Plane {
	private String planeName;
	private int fuelSize;
	
	public Plane() {
		
	}
	
	public Plane(String planeName, int fuelSize) {
		this.planeName = planeName;
		this.fuelSize = fuelSize;
	}
	
	abstract void flight(int distance);
	
	public void refuel(int fuel) {
		this.fuelSize += fuel;
	}
	
	public String getPlaneName() {
		return planeName;
	}

	public int getFuelSize() {
		return fuelSize;
	}
	
	
}
