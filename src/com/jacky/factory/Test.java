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
 * 优点：
 * 1)工厂模式是为了解耦：把对象的创建和使用的过程分开。就是Class A 想调用 Class B ，那么A只是调用B的方法，而至于B的实例化，就交给工厂类。
 * 2)工厂模式可以降低代码重复。如果创建对象B的过程都很复杂，需要一定的代码量，而且很多地方都要用到，那么就会有很多的重复代码。
 * 我们可以把创建对象B的代码放到工厂里统一管理。既减少了重复代码，也方便以后对B的创建过程的修改维护。
 * （当然，我个人觉得也可以把这些创建过程的代码放到类的构造函数里，同样可以降低重复率，而且构造函数本身的作用也是初始化对象。
 * 不过，这样也会导致构造函数过于复杂，做的事太多，不符合java 的设计原则。）
 * 3)因为工厂管理了对象的创建逻辑，使用者并不需要知道具体的创建过程，只管使用即可，减少了使用者因为创建逻辑导致的错误。
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
