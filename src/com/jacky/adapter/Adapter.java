package com.jacky.adapter;

public class Adapter implements IPowerA {
	private IPowerB powerB;
	
	public Adapter(IPowerB powerB) {
		this.powerB = powerB;
	}

	@Override
	public void insert() {
		powerB.connect();
	}

}
