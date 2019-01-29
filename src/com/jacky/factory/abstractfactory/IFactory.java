package com.jacky.factory.abstractfactory;

import com.jacky.factory.IShape;

public interface IFactory {
	
	IShape createShape();
	
	ICar createCar();
}
