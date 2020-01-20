package com.sinc.car;

public abstract class Car {
	public static final String DIVIDER = "\t\t";
	
	private String name;
	private String engine;
	private int oilTank;
	private int oilSize;
	private int distance;
	
	public Car() {
		
	}
	
	public Car(String name, String engine, int oilTank, int oilSize, int distance) {
		this.name = name;
		this.engine = engine;
		this.oilTank = oilTank;
		this.oilSize = oilSize;
		this.distance = distance;
	}
	
	abstract void go(int distance);
	abstract void setOil(int oilSize);
	
	public void addDistance(int distance) {
		this.distance += distance;
	}
	
	public void addOil(int oil) {
		this.oilSize += oil;
	}
	
	public int getDistance() {
		return this.distance;
	}
	
	public int getOilSize() {
		return this.oilSize;
	}
	
	public int getOilTank() {
		return this.oilTank;
	}
	
	@Override
	public String toString() {
		return (this.name+DIVIDER+this.engine+DIVIDER
				+this.oilTank+DIVIDER+this.oilSize+DIVIDER+this.distance);
	}
}
