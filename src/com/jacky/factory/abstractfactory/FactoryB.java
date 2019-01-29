package com.jacky.factory.abstractfactory;

import com.jacky.factory.IShape;
import com.jacky.factory.Square;

public class FactoryB implements IFactory {

	@Override
	public IShape createShape() {
		return new Square();
	}

	@Override
	public ICar createCar() {
		return new HondaCar();
	}

}
