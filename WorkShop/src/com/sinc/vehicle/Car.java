package com.sinc.vehicle;

public class Car extends Vehicle {
	private double restOil;
	private int curWeight;
	
	public Car() {
		super();
	}
	
	public Car(int maxWeight, double oilTankSize, double efficiency) {
		super(maxWeight, oilTankSize, efficiency);
	}
	
	public void addOil(int oil) {
		if (this.restOil+oil > this.getOilTankSize()) {
			System.out.println("오일탱크 용량 초과");
		} else {
		this.restOil += oil;
		}
	}
	
	public void setRestOil(double oil) {
		this.restOil = oil;
	}
	
	public double getRestOil() {
		return this.restOil;
	}
	
	public int getCurWeight() {
		return this.curWeight;
	}
	
	public void moving(int distance) {
		this.restOil -= (this.getEfficiency() * distance);
	}
	
	public void addWeight(int weight) {
		if (this.curWeight+weight > this.getMaxWeight()) {
			System.out.println("중량 초과");
		} else {
			this.curWeight += weight;
		}
	}
	
	@Override
	public String toString() {
		return (super.toString() 
				+ "\t남은 기름: " + this.restOil
				+ "\t\t현재 중량: " + this.curWeight);
	}
}
