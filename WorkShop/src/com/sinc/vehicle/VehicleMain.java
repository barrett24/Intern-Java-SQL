package com.sinc.vehicle;

public class VehicleMain {

	public static void main(String[] args) {
		Truck car = new Truck(1000, 100.0, 5.0);
		System.out.println("최대적재중량\t오일탱크크기\t\t잔여오일량\t\t현재적재중량\t\t연비");
		System.out.print("=========================================================================");
		System.out.print("=========================================================================\n");
		System.out.println(car.toString());
		
		System.out.println("\n50L 주유 후");
		car.addOil(50);
		System.out.println(car.toString());
		
		System.out.println("\n50km 주행 후");
		car.moving(50);
		System.out.println(car.toString());
		
		System.out.println("\n100Kg 적재 후");
		car.addWeight(100);
		System.out.println(car.toString());
		
		System.out.println("\n30Km 주행 후");
		car.moving(30);
		System.out.println(car.toString());
		
		System.out.println("\n요금 : " + car.getCost(30));
	}

}
