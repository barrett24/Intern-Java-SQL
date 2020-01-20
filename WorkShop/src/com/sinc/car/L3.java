package com.sinc.car;

public class L3 extends Car implements Temp {
	private static final int GO_CNT = 10;
	private static final int REDUCE_CNT = 1;
	private static final int HOT_CNT = 10;
	private static final int TEMP_CNT = 1;
	
	public L3() {
		super();
	}

	public L3(String name, String engine, int oilTank, int oilSize, int distance) {
		super(name, engine, oilTank, oilSize, distance);
	}

	@Override
	public int getTenpGage() {
		return (int)((this.getDistance()/HOT_CNT) * TEMP_CNT);
	}

	@Override
	void go(int distance) {
		this.addDistance(distance);
		this.addOil(-((int)(this.getDistance()/GO_CNT) * REDUCE_CNT));
	}

	@Override
	void setOil(int oilSize) {
		this.addOil(oilSize);
	}
	
	@Override
	public String toString() {
		return (super.toString()+DIVIDER+this.getTenpGage());
	}
	
}
