package com.sinc.mobile;

public class Ltab extends Mobile {
	private static final int BAT_USE_PER_MIN = 10;
	
	public Ltab() {
		super();
	}

	public Ltab(String mobileName, int batterySize, String osType) {
		super(mobileName, batterySize, osType);
	}

	@Override
	int operate(int time) {
		int temp = this.getBatterySize() - (BAT_USE_PER_MIN * time);
		this.setBatterySize(temp);
		return temp;
	}

	@Override
	int charge(int time) {
		int temp = this.getBatterySize() + (BAT_USE_PER_MIN * time);
		this.setBatterySize(temp);
		return temp;
	}
}
