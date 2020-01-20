package com.sinc.vehicle;

public class Vehicle {
	private int maxWeight;
	private double oilTankSize;
	private double efficiency;
	
	public Vehicle() {
		
	}
	
	public Vehicle(int maxWeight, double oilTankSize, double efficiency) {
		this.maxWeight = maxWeight;
		this.oilTankSize = oilTankSize;
		this.efficiency = efficiency;
	}
	
	public int getMaxWeight() {
		return this.maxWeight;
	}
	
	public double getOilTankSize() {
		return this.oilTankSize;
	}
	
	public double getEfficiency() {
		return this.efficiency;
	}
	
	@Override
	public String toString() {
		return ("최대 무게: " + this.maxWeight 
				+ "\t기름 적재량: " + this.oilTankSize);
	}
	
}
