package com.sinc.plane;

public class CargoPlane extends Plane {
	private static final int DISTANCE_CNT = 10;
	private static final int FUEL_CNT = 50;
	
	public CargoPlane() {
		super();
	}

	public CargoPlane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
	}

	@Override
	void flight(int distance) {
		super.refuel(-(FUEL_CNT * (int)(distance/DISTANCE_CNT)));
	}
	
	
}
