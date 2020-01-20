package com.sinc.car;

import java.util.ArrayList;
import java.util.List;

public class CarMain {

	public static void main(String[] args) {
		ArrayList<Car> car = new ArrayList<Car>();
		car.add(new L3("L3", "1500", 50, 25, 0));
		car.add(new L5("L5", "2000", 75, 35, 0));
		
		printInfo();
		carInfo(car);
		
		System.out.println("\n25 주유");
		for (Car c: car) {
			c.addOil(25);
		}
		printInfo();
		carInfo(car);
		
		System.out.println("\n80 주행");
		for (Car c: car) {
			c.go(80);
		}
		printInfo();
		carInfo(car);
	}
	
	public static void printInfo() {
		System.out.println("vehivleName\tengineSize\toileTank\t"
				+ "oilSize \tdistance\ttemperature");
		System.out.println("------------------------------------------"
				+ "---------------------------------------------------");
	}
	
	public static void carInfo(ArrayList<Car> car) {
		for (Car c: car) {
			System.out.println(c.toString());
		}
	}
}
