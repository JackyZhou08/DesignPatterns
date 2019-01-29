package com.jacky.singleton;

/**
 * 初始化不耗时，占用的内存不大，直接用饿汉式；
 * 其他情况使用懒汉式延时加载，需要的时候再加载
 * @author Jacky-PC
 *
 * 单例模式的思想：
 * 1.构造方法私有化
 * 2.提供一个共有的静态方法返回该实例
 */
public class Singleton {
	
	/**
	 * 饿汉式
	 * @author Jacky-PC
	 * 1.线程安全
	 * 2.在getInstance前实例就已经创建，因为是static修饰，所以只会创建一次，所以是线程安全的
	 */
	static class One{
		private static One instance = new One();
		private One() {}
		public static One getInstance() {
			return instance;
		}
	}
	
	/**
	 * 懒汉式
	 * @author Jacky-PC
	 * 1.线程不安全
	 */
	static class Two{
		private static Two instance;
		private Two() {}
		public static Two getInstance() {
			if(instance == null) {
				instance = new Two();
			}
			return instance;
		}
	}
	
	/**
	 * 懒汉式--同步锁
	 * @author Jacky-PC
	 * 1.线程安全
	 * 2.每次获取都要试图获取同步锁，比较耗时
	 */
	static class Three{
		private static Three instance;
		private Three(){}
		public synchronized static Three getInstance() {
			if(instance == null) {
				instance = new Three();
			}
			return instance;
		}
	}
	
	/**
	 * 懒汉式--双重校验锁（推荐使用）
	 * @author Jacky-PC
	 * 1.线程安全
	 * 2.效率高，性能好，因为只有在检查到instance为null的时候再去获取同步锁，提高了效率
	 * 
	 * volatile关键字，实例的改变对其它线程立即可见
	 */
	static class Four{
		private volatile static Four instance;
		private Four() {}
		public static Four getInstance() {
			if(instance == null) {
				synchronized (Four.class) {
					if(instance == null) {
						instance = new Four();
					}
				}
			}
			return instance;
		}
	}
	
	/**
	 * 静态内部类（推荐使用）
	 * @author Jacky-PC
	 * 1.线程安全
	 * 2.和饿汉式差不多
	 */
	static class Five{
		private Five() {}
		private static class FiveHolder{
			private static final Five INSTANCE = new Five();
		}
		public static Five getInstance() {
			return FiveHolder.INSTANCE;
		}
	}
	
	/**
	 * 枚举类--天生支持线程安全，最好的实现，只不过枚举类在Android会显著增加apk包的大小，不建议在Android中大量实现
	 * @author Jacky-PC
	 * 1.线程安全
	 * 2.Six.INSTANCE.print();来调用对应的方法
	 */
	static enum Six{
		INSTANCE;
		
		public void print() {
			System.out.println("bbbb");
		}
	}
	
	public static void main(String[] args) {
		Six.INSTANCE.print();
	}
}
