package com.felixkuang.singleton.type8;

import java.awt.*;

public class SingletonTest08 {
	public static void main(String[] args) {
		System.out.println("枚举方式单例模式，推荐使用");
		Singleton instance1 = Singleton.INSTANCE;
		Singleton instance2 = Singleton.INSTANCE;
		System.out.println(instance1 == instance2);
		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());
		instance1.sayHello();
		instance2.sayHello();
	}

}

// 使用枚举，可以实现单例，推荐使用
enum Singleton{
	INSTANCE;
	public void sayHello(){
		System.out.println("hello");
	}
}
