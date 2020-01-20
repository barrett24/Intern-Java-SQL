package com.sinc.plane;

import java.util.ArrayList;
import java.util.List;

public class PlaneMain {

	public static void main(String[] args) {
		List<Plane> planeList = new ArrayList<Plane>();
		planeList.add(new Airplane("L747", 1000));
		planeList.add(new CargoPlane("C40", 1000));
		
		System.out.println("Plane\t\tFuelSize");
		System.out.println("------------------------------------------\n");
		for (Plane p : planeList) {
			System.out.println(p.getPlaneName() + "\t" + p.getFuelSize());
		}
		
		System.out.println("100 운항");
		for (Plane p : planeList) {
			p.flight(100);
		}
		
		System.out.println("Plane\t\tFuelSize");
		System.out.println("------------------------------------------\n");
		for (Plane p : planeList) {
			System.out.println(p.getPlaneName() + "\t" + p.getFuelSize());
		}
		
		System.out.println("200 주유");
		for (Plane p : planeList) {
			p.refuel(200);
		}
		System.out.println("Plane\t\tFuelSize");
		System.out.println("------------------------------------------\n");
		for (Plane p : planeList) {
			System.out.println(p.getPlaneName() + "\t" + p.getFuelSize());
		}
	}

}
