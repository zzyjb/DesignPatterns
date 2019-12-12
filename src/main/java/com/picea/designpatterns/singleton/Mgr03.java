package com.picea.designpatterns.singleton;

/**
 * lazy loading
 * 懒汉式加载
 * 虽然达到了懒加载的目的，但是带来了线程不安全的问题
 */
public class Mgr03 {
    private static Mgr03 INSTANCE;

    private Mgr03() {}

    public static Mgr03 getInstance(){
        if (null == INSTANCE) {
            //假如这里阻塞了，或者
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new Mgr03();

        }
        return INSTANCE;
    }

    public void out () {
        System.out.println("this is Mgr03");
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

