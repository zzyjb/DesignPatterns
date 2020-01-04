package com.picea.designpatterns.observer.v01;

/**
 * <p>ObserverMain</p>
 * <p>description.</p>
 *
 * @author : jiangbing.yang
 * @version 0.1
 * @date : 2019/12/31 9:38
 * @company :
 *
 * 问题：有时候，为了控制程序的权限，我们会设置一些变量，变量的变化如何监控？
 *
 * 第一我们可能运行某个线程，一直监控这个变量的变化。
 *
 * 问题： 这样需要启动一个线程一直执行查询方法，占CPU资源严重
 */

public class ObserverMain {

    public static void main(String[] args) {
        SignalMark signalMark = new SignalMark();
        signalMark.setSigal(false);

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("我监控到变量 sigal = " +signalMark.getSigal());
                    if (signalMark.getSigal()) {
                        System.out.println("需要完成的工作");
                        break;
                    }
                }
            }
        }).start();

        try {
            Thread.sleep(1000);
            signalMark.setSigal(true);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

class SignalMark {
    volatile boolean sigal;

    public boolean getSigal() {
        return sigal;
    }

    public void setSigal(boolean sigal) {
        this.sigal = sigal;
    }
}
