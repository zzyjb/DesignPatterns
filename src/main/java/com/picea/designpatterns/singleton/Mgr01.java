package com.picea.designpatterns.singleton;

/**
 * 饿汉式
 * 类加载到内存以后，直接new一个单例，由JVM保证线程的安全
 * 简单实用
 *
 * 问题：无论用到与否，类都需要装载。
 */
public class Mgr01 {
    private static final Mgr01 INSTANCE = new Mgr01();

    private Mgr01() {}

    public static Mgr01 getInstance() {
        return INSTANCE;
    }

    public void out() {
        System.out.println("this is Mgr01");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            new Thread(()->{
                Mgr03 mgr03 = Mgr03.getInstance();
                //我们输出线程的hash值，假如是同一个对象，hash值肯定一样。
                System.out.println(mgr03.hashCode());
            }).start();
        }
    }
}
