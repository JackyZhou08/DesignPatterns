package com.jacky.factory;

import com.jacky.factory.abstractfactory.FactoryA;
import com.jacky.factory.abstractfactory.FactoryB;
import com.jacky.factory.abstractfactory.IFactory;
import com.jacky.factory.factorymethod.CircleFactory;
import com.jacky.factory.factorymethod.IShapeFactory;
import com.jacky.factory.factorymethod.RectangleFactory;
import com.jacky.factory.factorymethod.SquareFactory;
import com.jacky.factory.simplefacotory.ShapeFactory;

/**
 * 1.简单工厂模式
 * 专门定义一个类来创建其他类的实例，被创建的实例通常都具有共同的父类
 * 
 * 2.工厂方法模式
 * 定义一个用来创建对象的接口，让子类来决定要实例化哪一个类，使一个类的实例化来延迟到子类
 * 
 * 3.抽象工厂模式
 * 提供一个创建一系列相关或者相互依赖的对象接口，而无需指定他们具体的类
 * 当产品类型只有一种的时候，抽象工厂模式变为工厂方法模式；当产品类型有多种的时候，工厂方法模式变为抽象工厂模式。
 * 
 * 
 * @author Jacky-PC
 *
 */
public class Test {
	
	public static void main(String[] args) {
		System.out.println("简单工厂模式：");
		ShapeFactory.createShape("circle").draw();
		ShapeFactory.createShape("rectangle").draw();
		ShapeFactory.createShape("square").draw();
		
		System.out.println("工厂方法模式：");
		IShapeFactory shapeFactory = null;
		shapeFactory = new CircleFactory();
		shapeFactory.createShape().draw();
		shapeFactory = new RectangleFactory();
		shapeFactory.createShape().draw();
		shapeFactory = new SquareFactory();
		shapeFactory.createShape().draw();
		
		System.out.println("抽象工厂模式：");
		IFactory factory = null;
		factory = new FactoryA();
		factory.createCar().drive();
		factory.createShape().draw();
		factory = new FactoryB();
		factory.createCar().drive();
		factory.createShape().draw();
	}

}
