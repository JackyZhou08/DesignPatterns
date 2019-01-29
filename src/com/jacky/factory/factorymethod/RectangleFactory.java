package com.jacky.factory.factorymethod;

import com.jacky.factory.IShape;
import com.jacky.factory.Rectangle;

public class RectangleFactory implements IShapeFactory{

	@Override
	public IShape createShape() {
		return new Rectangle();
	}
	
}
