package com.sinc.mobile;

public class Otab extends Mobile {
	private static final int BAT_CHARGE = 12;
	private static final int BAT_USE = 8;
	
	public Otab() {
		super();
	}

	public Otab(String mobileName, int batterySize, String osType) {
		super(mobileName, batterySize, osType);
	}

	@Override
	int operate(int time) {
		int temp = this.getBatterySize() - (BAT_CHARGE * time);
		this.setBatterySize(temp);
		return temp;
	}

	@Override
	int charge(int time) {
		int temp = this.getBatterySize() + (BAT_USE * time);
		this.setBatterySize(temp);
		return temp;
	}
}
