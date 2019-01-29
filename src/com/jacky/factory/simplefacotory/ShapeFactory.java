package com.jacky.factory.simplefacotory;

import com.jacky.factory.Circle;
import com.jacky.factory.IShape;
import com.jacky.factory.Rectangle;
import com.jacky.factory.Square;

/**
 * 简单工厂模式
 * @author Jacky-PC
 *
 */
public class ShapeFactory {
	
	public static IShape createShape(String type) {
		if(type == null) {
			return null;
		}
		
		switch (type.toLowerCase()) {
		case "circle":
			return new Circle();
		case "rectangle":
			return new Rectangle();
		case "square":
			return new Square();
		default:
			return null;
		}
	}

}
