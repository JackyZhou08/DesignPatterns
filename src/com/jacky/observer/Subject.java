package com.jacky.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者
 * @author Jacky-PC
 * 
 */
public class Subject {
	
	private List<IObserver> mObservers = new ArrayList<>();
	
	//注册观察者
	public void register(IObserver observer) {
		mObservers.add(observer);
	}
	
	//通知所有的观察者更新
	public void notifyChange(String content) {
		for(IObserver observer:mObservers) {
			observer.update(content);
		}
	}
	
	public void unRegister(IObserver observer) {
		mObservers.remove(observer);
	}
}
