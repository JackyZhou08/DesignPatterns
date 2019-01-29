package com.jacky.observer;

/**
 * 观察者B
 * @author Jacky-PC
 *
 */
public class ObserverB implements IObserver {

	@Override
	public void update(String changeContent) {
		System.out.println("ObserverB观察到变化内容："+changeContent);
	}

}
