package com.felixkuang.singleton.type5;

public class SingletonTest05 {
    public static void main(String[] args) {
        System.out.println("懒汉式3单例模式，线程不安全");
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());

        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                Singleton singleton = Singleton.getInstance();
                System.out.println("懒汉式3：" + Thread.currentThread().getName() + ":" + singleton.hashCode());
            }).start();
        }
    }

}
class Singleton{
    private static Singleton instance;
    private Singleton() {
    }

    public static Singleton getInstance(){
        if (instance == null) {
            // 这种同步并不能起到线程同步的作用
            synchronized (Singleton.class) {
                instance = new Singleton();
            }
        }
        return instance;
    }
}