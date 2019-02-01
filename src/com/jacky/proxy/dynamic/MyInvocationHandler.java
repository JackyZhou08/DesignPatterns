package com.jacky.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import com.jacky.proxy.RealImage;

/**
 * 定义一个处理器对象
 * @author Jacky-PC
 *
 */
public class MyInvocationHandler implements InvocationHandler {
	
	/**
	 * 需要传进来真实类
	 */
	private RealImage mRealImage;
	
	/**
	 * 
	 * @param realImage 真实类
	 */
	public MyInvocationHandler(RealImage realImage) {
		mRealImage = realImage;
	}

	
	/**
	 * proxy代理类
	 * method正在调用的方法
	 * args 方法的参数
	 * 
	 * return 正在调用方法的返回值
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("调用代理类");
		if(method.getName().equals("display")) {
			method.invoke(mRealImage, args);
		}else {
			method.invoke(mRealImage, args);
		}
		return null;
	}

}
