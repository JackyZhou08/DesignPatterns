package com.jacky.factory.abstractfactory;

import com.jacky.factory.Circle;
import com.jacky.factory.IShape;

public class FactoryA implements IFactory {

	@Override
	public IShape createShape() {
		return new Circle();
	}

	@Override
	public ICar createCar() {
		return new BenzCar();
	}

}
