package com.sinc.mobile;

import java.util.ArrayList;
import java.util.List;

public class MobileMain {

	public static void main(String[] args) {
		List<Mobile> mobileAry = new ArrayList<Mobile>();
		mobileAry.add(new Ltab("Ltab", 500, "AP-01"));
		mobileAry.add(new Otab("Otab", 1000, "AND-20"));
		
		System.out.println("Mobile\t\tBattery\t\tOS");
		System.out.println("=======================================================");
		for (Mobile m: mobileAry) {
			System.out.println(m.toString());
		}
		System.out.println();
		
		System.out.println("10분 충전");
		for (Mobile m: mobileAry) {
			m.charge(10);
		}
		System.out.println("Mobile\t\tBattery\t\tOS");
		for (Mobile m: mobileAry) {
			System.out.println(m.toString());
		}
		System.out.println();
		
		System.out.println("5분 통화");
		for (Mobile m: mobileAry) {
			m.operate(5);
		}
		System.out.println("Mobile\t\tBattery\t\tOS");
		for (Mobile m: mobileAry) {
			System.out.println(m.toString());
		}
	}

}
