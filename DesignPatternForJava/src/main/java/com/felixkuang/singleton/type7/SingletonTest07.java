package com.felixkuang.singleton.type7;

public class SingletonTest07 {
	public static void main(String[] args) {
		System.out.println("静态内部类单例模式");
		for (int i = 0; i < 15; i++) {
			new Thread(() -> {
				Singleton singleton1 = Singleton.getInstance();
				System.out.println("静态内部类:"+Thread.currentThread().getName() + ":" + singleton1.hashCode());
			}).start();
		}
	}

}

// 静态内部类
class Singleton {

	// 构造器私有化
	private Singleton() {

	}

	// 静态内部类 推荐使用
	private static class SingletonInstance{
		private static final Singleton INSTANCE = new Singleton();
	}

	public static Singleton getInstance(){
		return SingletonInstance.INSTANCE;
	}

}