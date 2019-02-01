package com.jacky.proxy;

import java.lang.reflect.Proxy;

import com.jacky.proxy.dynamic.MyInvocationHandler;
import com.jacky.proxy.stat.ProxyImage;

/**
 * 代理类与委托类（真实类）有同样的接口
 * 代理模式分为静态代理和动态代理(真实类需要实现一个接口)
 * @author Jacky-PC
 * 
 * 静态代理：由程序员创建或特定工具自动生成源代码，再对其编译。在程序运行前，代理类的.class文件就已经存在了。 
 * 动态代理：在程序运行时，运用反射机制动态创建而成。
 * 
 * 主要有两种代理机制：基于JDK的动态代理；基于CGLib的动态代理。JDK本身只提供接口的代理，而不支持类的代理。
 * 
 * 1.静态代理
 * 需要自己定义一个静态代理类
 * 
 * 2.动态代理
 * 不需要定义一个静态代理类，jdk提供接口来动态生成一个代理实例
 *
 */
public class Test {

	public static void main(String[] args) {
		//静态代理
		new ProxyImage().display();
		
		
		//动态代理
		//代理对象
		IImage proxyClass = (IImage) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader()
				, new Class[]{IImage.class}, new MyInvocationHandler(new RealImage()));
		proxyClass.display();
		proxyClass.destory();
	}
}
