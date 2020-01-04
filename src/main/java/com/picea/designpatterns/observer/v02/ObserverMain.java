package com.picea.designpatterns.observer.v02;

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
 *
 * 我们拆解开这些角色，SignalMark 类是一个subject(被观察类)，我新建一个观察类 SignalObserver （观察者）
 * SignalMark ,值变化时，我们调用 SignalObserver 的对应方法
 */

public class ObserverMain {

    public static void main(String[] args) {

        SignalObject signalObject = new SignalObject();

        SignalMark signalMark = new SignalMark(signalObject);
        signalMark.setSigal(false);

        signalMark.setSigal(true);
    }

}

class SignalMark {

    volatile boolean sigal;
    SignalObject signalObject;

    public SignalMark(SignalObject signalObject) {
        this.signalObject = signalObject;
    }

    public boolean isSigal() {
        return sigal;
    }

    public void setSigal(boolean sigal) {
        this.sigal = sigal;
        this.signalObject.update(sigal);
    }
}

class SignalObject {

    void update(boolean sigal) {
        System.out.println("我监控到变量 sigal = " +sigal);
        System.out.println("需要完成的工作");
    }
}
