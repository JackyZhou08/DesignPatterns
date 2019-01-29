package com.jacky.factory.factorymethod;

import com.jacky.factory.IShape;
import com.jacky.factory.Square;

public class SquareFactory implements IShapeFactory{

	@Override
	public IShape createShape() {
		return new Square();
	}
	
}
