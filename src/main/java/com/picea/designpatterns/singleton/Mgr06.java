package com.picea.designpatterns.singleton;

/**
 * lazy loading
 * 懒汉式加载
 * 虽然达到了懒加载的目的，但是带来了线程不安全的问题
 *
 * 加了synchronized关键字，但是同时带来了性能问题，我们可以看到，
 * 其他的线程，都在等待第一个线程完成
 *
 * 为了提高性能，我们把锁放到判断空以后，能否则解决问题？
 *
 * 答案是显著的，不能解决，反而更慢了？为什么？
 *
 * 因为我们线程太快，多个线程在判断时，都是为空，所以都在synchronized (Mgr05.class) 同步方法处等待
 *
 * 现在这一版本，我们双重判空,解决了我们的同步问题
 */
public class Mgr06 {
    private static Mgr06 INSTANCE;

    private Mgr06() {}

    public static Mgr06 getInstance(){
        if (null == INSTANCE) {
            synchronized (Mgr06.class){
                if (null == INSTANCE) {
                    //假如这里阻塞了，或者
                    try {
                        Thread.sleep(2100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    INSTANCE = new Mgr06();
                }
            }
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
                Mgr06 mgr03 = Mgr06.getInstance();
                //我们输出线程的hash值，假如是同一个对象，hash值肯定一样。
                System.out.println(mgr03.hashCode());
            }).start();
        }
    }
}

