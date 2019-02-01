package com.jacky.adapter;

/**
 * 适配器模式有两种：类适配器与对象适配器
 * 
 * 
 * 对象适配器
 * 适配器模式（ Adapter ）：将一个类的接口转换成客户希望的另外一个接口。
 * 适配器模式使得原本由于接口不兼容而不能一起工作的那些类可以一起工作。
 * @author Jacky-PC
 *
 */
public class Test {

	public static void main(String[] args) {
		IPowerA powerA = new PowerA();
		start(powerA);
		
		IPowerB powerB = new PowerB();
		start(new Adapter(powerB));
		
	}

	public static void start(IPowerA powerA) {
		powerA.insert();
	}
}
