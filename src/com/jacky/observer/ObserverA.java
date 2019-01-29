package com.jacky.observer;

/**
 * 观察者A
 * @author Jacky-PC
 *
 */
public class ObserverA implements IObserver {

	@Override
	public void update(String changeContent) {
		System.out.println("ObserverA观察到变化内容："+changeContent);
	}

}
