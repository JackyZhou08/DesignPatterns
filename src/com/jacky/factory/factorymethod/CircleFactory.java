package com.jacky.factory.factorymethod;

import com.jacky.factory.Circle;
import com.jacky.factory.IShape;

public class CircleFactory implements IShapeFactory{

	@Override
	public IShape createShape() {
		return new Circle();
	}
	
}
