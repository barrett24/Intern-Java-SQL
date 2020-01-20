package com.sinc.vehicle;

public class Truck extends Car {
	private static final double EFFICIENCY_TRANS = 0.2;
	private static final int WEIGHT_TRANS = 5;
	private static final int COST_PER_LITER = 3000;
	
	public Truck() {
		
	}
	
	public Truck(int maxWeight, double oilTankSize, double efficiency) {
		super(maxWeight, oilTankSize, efficiency);
	}
	
	@Override 
	public double getEfficiency() {
		return (super.getEfficiency() 
				- (int)((super.getCurWeight()) / WEIGHT_TRANS) * EFFICIENCY_TRANS);
	}
	
	public void moving(int distance) {
		this.setRestOil(this.getRestOil() - calcOil(distance));
	}
	
	public double calcOil(int distance) {
		return distance / this.getEfficiency();
	}
	
	public int getCost(int distance) {
		return (int)(calcOil(distance) * COST_PER_LITER);
	}
	
	@Override
	public String toString() {
		return super.toString() + "\t\t연비 :" + this.getEfficiency();
	}
}
