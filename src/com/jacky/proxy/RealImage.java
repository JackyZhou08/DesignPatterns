package com.jacky.proxy;

/**
 * 真实图片类
 * @author Jacky-PC
 *
 */
public class RealImage implements IImage {

	@Override
	public void display() {
		System.out.println("显示图片");
	}

	@Override
	public void destory() {
		System.out.println("销毁图片");
	}

}
