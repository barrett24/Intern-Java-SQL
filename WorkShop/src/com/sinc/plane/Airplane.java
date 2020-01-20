package com.sinc.plane;

public class Airplane extends Plane {
	private static final int DISTANCE_CNT = 10;
	private static final int FUEL_CNT = 30;
	
	public Airplane() {
		super();
	}

	public Airplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
	}

	@Override
	void flight(int distance) {
		super.refuel(-(FUEL_CNT * (int)(distance/DISTANCE_CNT)));
	}
	
	
}
