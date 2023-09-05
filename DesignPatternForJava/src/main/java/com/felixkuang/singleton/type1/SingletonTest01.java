package com.felixkuang.singleton.type1;

public class SingletonTest01 {
    public static void main(String[] args) {
        System.out.println("饿汉式静态变量单例模式");
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }
}
// 使用静态变量单例模式（饿汉式）
class Singleton{
    private static final Singleton instance = new Singleton();
    // 构造器私有化
    private Singleton(){

    }
    public static Singleton getInstance(){
        return instance;
    }

}
