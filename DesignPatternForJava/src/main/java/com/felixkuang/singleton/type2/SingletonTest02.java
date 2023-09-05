package com.felixkuang.singleton.type2;

public class SingletonTest02 {
    public static void main(String[] args) {
        System.out.println("饿汉式静态代码块单例模式");
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }
}

class Singleton{
    private static Singleton instance;
    static {
        instance = new Singleton();
    }
    private Singleton(){

    }

    public static Singleton getInstance(){
        return instance;
    }
}
