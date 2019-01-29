package com.jacky.builder;

/**
 * Builderģʽ��������ģʽ��--Android�е���ʽ�����ɴ˶���
 * @author Jacky-PC
 * ͨ��������������Ĵ�����Ҫ��ʵ��
 * 1.��Ĺ��췽��˽�л�������ֱ��new��ʵ��
 * 2.����һ����̬��Builder�ڲ��࣬���洴��һ��build�������ض�Ӧ��ʵ��
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
				.name("����")
				.age(1)
				.sex(2)
				.build()
				.toString());
	}
}
