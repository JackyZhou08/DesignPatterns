package com.jacky.singleton;

/**
 * ��ʼ������ʱ��ռ�õ��ڴ治��ֱ���ö���ʽ��
 * �������ʹ������ʽ��ʱ���أ���Ҫ��ʱ���ټ���
 * @author Jacky-PC
 *
 * ����ģʽ��˼�룺
 * 1.���췽��˽�л�
 * 2.�ṩһ�����еľ�̬�������ظ�ʵ��
 */
public class Singleton {
	
	/**
	 * ����ʽ
	 * @author Jacky-PC
	 * 1.�̰߳�ȫ
	 * 2.��getInstanceǰʵ�����Ѿ���������Ϊ��static���Σ�����ֻ�ᴴ��һ�Σ��������̰߳�ȫ��
	 */
	static class One{
		private static One instance = new One();
		private One() {}
		public static One getInstance() {
			return instance;
		}
	}
	
	/**
	 * ����ʽ
	 * @author Jacky-PC
	 * 1.�̲߳���ȫ
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
	 * ����ʽ--ͬ����
	 * @author Jacky-PC
	 * 1.�̰߳�ȫ
	 * 2.ÿ�λ�ȡ��Ҫ��ͼ��ȡͬ�������ȽϺ�ʱ
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
	 * ����ʽ--˫��У�������Ƽ�ʹ�ã�
	 * @author Jacky-PC
	 * 1.�̰߳�ȫ
	 * 2.Ч�ʸߣ����ܺã���Ϊֻ���ڼ�鵽instanceΪnull��ʱ����ȥ��ȡͬ�����������Ч��
	 * 
	 * volatile�ؼ��֣�ʵ���ĸı�������߳������ɼ�
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
	 * ��̬�ڲ��ࣨ�Ƽ�ʹ�ã�
	 * @author Jacky-PC
	 * 1.�̰߳�ȫ
	 * 2.�Ͷ���ʽ���
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
	 * ö����--����֧���̰߳�ȫ����õ�ʵ�֣�ֻ����ö������Android����������apk���Ĵ�С����������Android�д���ʵ��
	 * @author Jacky-PC
	 * 1.�̰߳�ȫ
	 * 2.Six.INSTANCE.print();�����ö�Ӧ�ķ���
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
