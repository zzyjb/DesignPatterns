package com.picea.designpatterns.singleton;

/**
 * lazy loading
 * 懒汉式加载
 * 虽然达到了懒加载的目的，但是带来了线程不安全的问题
 *
 * 加了synchronized关键字，但是同时带来了性能问题，我们可以看到，
 * 每次都是需要增加synchronized同步关键字，java里面我们知道，上锁可是非常消耗性能的
 */
public class Mgr04 {
    private static Mgr04 INSTANCE;

    private Mgr04() {}

    public static synchronized Mgr04 getInstance(){
        if (null == INSTANCE) {
            //假如这里阻塞了，或者
            try {
                Thread.sleep(2100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new Mgr04();

        }
        return INSTANCE;
    }

    public void out () {
        System.out.println("this is Mgr03");
    }

    public static void main(String[] args) {
        System.out.println("Thread start ..........");
        for (int i = 0; i < 20; i++) {
            new Thread(()->{
                Mgr04 mgr03 = Mgr04.getInstance();
                //我们输出线程的hash值，假如是同一个对象，hash值肯定一样。
                System.out.println(mgr03.hashCode());
            }).start();
        }
    }
}

