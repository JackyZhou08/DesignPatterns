package com.jacky.builder;

/**
 * Builder模式（构建者模式）--Android中的链式调用由此而来
 * @author Jacky-PC
 * 通过其它类来方便的创建需要的实例
 * 1.类的构造方法私有化，不能直接new出实例
 * 2.创建一个静态的Builder内部类，里面创建一个build方法返回对应的实例
 */
public class Person {
	private String name;
	private int age;
	private int sex;
	
	private Person(Builder builder) {
		this.name = builder.name;
		this.age = builder.age;
		this.sex = builder.sex;
	}
	
	@Override
	public String toString() {
		return "name="+name+"\nage="+age+"\nsex="+sex;
	}
	
	
	/**
	 * 可以将Person必须要的属性放在Builder的构造方法中
	 * @author Jacky-PC
	 *
	 */
	static class Builder{
		private String name;
		private int age;
		private int sex;
		
		public Builder name(String name) {
			this.name = name;
			return this;
		}
		
		public Builder age(int age) {
			this.age = age;
			return this;
		}
		
		public Builder sex(int sex) {
			this.sex = sex;
			return this;
		}
		
		public Person build() {
			return new Person(this);
		}
	}
	
	public static void main(String[] args) {
		System.out.println(new Person.Builder()
				.name("张三")
				.age(1)
				.sex(2)
				.build()
				.toString());
	}
}
