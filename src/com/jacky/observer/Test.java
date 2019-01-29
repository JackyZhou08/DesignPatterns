package com.jacky.observer;

/**
 * 观察者模式（发布-订阅模式）：一对多，一个对象状态的改变，通知所有的观察者更新
 * subject(observable)被观察者或者观察目标，observer观察者
 * @author Jacky-PC
 *
 */
public class Test {
	
	public static void main(String[] args) {
		Subject subject = new Subject();
		
		ObserverA observerA = new ObserverA();
		ObserverB observerB = new ObserverB();
		
		subject.register(observerA);
		subject.register(observerB);
		
		subject.notifyChange("change");
		
		subject.unRegister(observerA);
		
		subject.notifyChange("changeB");
	}
}
