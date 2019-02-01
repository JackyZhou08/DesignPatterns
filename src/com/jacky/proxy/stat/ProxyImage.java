package com.jacky.proxy.stat;

import com.jacky.proxy.IImage;
import com.jacky.proxy.RealImage;

/**
 * 代理图片类
 * @author Jacky-PC
 *
 */
public class ProxyImage implements IImage{
	private RealImage mRealImage;
	
	@Override
	public void display() {
		System.out.println("调用代理类");
		if(mRealImage == null) {
			mRealImage = new RealImage();
		}
		mRealImage.display();
	}

	@Override
	public void destory() {
		
	}
	
}
