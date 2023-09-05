package com.felixkuang.singleton.type6;

public class SingletonTest06 {
    public static void main(String[] args) {
        System.out.println("双重检查单例模式，线程安全，推荐使用");
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());

        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                Singleton singleton = Singleton.getInstance();
                System.out.println("双重检查：" + Thread.currentThread().getName() + ":" + singleton.hashCode());
            }).start();
        }
    }
}
class Singleton{
    private static volatile Singleton instance;
    private Singleton() {
    }

    public static Singleton getInstance(){
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
