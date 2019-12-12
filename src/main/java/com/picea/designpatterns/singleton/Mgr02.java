package com.picea.designpatterns.singleton;

/**
 * 本质跟1一样
 */
public class Mgr02 {
    private static final Mgr02 INSTANCE;
    static {
        INSTANCE = new Mgr02();
    }

    private Mgr02() {}

    public static Mgr02 getInstance() {
        return INSTANCE;
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
