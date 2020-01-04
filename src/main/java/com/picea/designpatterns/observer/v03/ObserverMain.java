package com.picea.designpatterns.observer.v03;

import com.sun.org.apache.xerces.internal.xs.datatypes.ObjectList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

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
 *
 * 问题：假如我想增加多个观察者？怎么办？
 *
 * 因为我们需要增加多个观察者，那么可以把被观察者抽象出来，形成基础类
 * 并且管理观察者，提供新增、修改、删除方法
 *
 * 观察者，抽象出一个接口，所有的观察者都需要实现这个接口。
 *
 * 观察者模式(Observer)，经常与责任链模式（Chain of responsibility）一起使用
 */

public class ObserverMain {

    public static void main(String[] args) {
        //建立一个被观察者
        Subject subject =  new SignalMark();

        //建立第一个观察者
        Observer o = new SignalObserver();
        subject.addObserver(o);

        //建立第二个观察者
        Observer o1=  new SignalObserver2();
        subject.addObserver(o1);

        //被观察者有动作
        subject.doAnyThing();

    }

}

abstract class Subject {

    private List<Observer> observers = new ArrayList<>();
    private volatile boolean sigal;

    public boolean isSigal() {
        return sigal;
    }

    public void setSigal(boolean sigal) {
        this.sigal = sigal;
    }

    public void addObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this.sigal);
        }
    }

    public abstract void doAnyThing();
}

interface Observer {
    public void update(boolean sigal);
}

class SignalMark extends Subject{
    @Override
    public void doAnyThing() {
        System.out.println("我要改变XX的值");
        super.setSigal(true);
        super.notifyObservers();
    }
}

class SignalObserver implements Observer {
    @Override
    public void update(boolean sigal) {
        System.out.println("我是观察者1 ，监控到变量 sigal = " +sigal);
        System.out.println("观察者1完成的工作");
    }
}

class SignalObserver2 implements Observer {
    @Override
    public void update(boolean sigal) {
        System.out.println("我是观察者2，监控到变量 sigal = " +sigal);
        System.out.println("观察者2完成的工作");
    }
}
