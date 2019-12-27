package com.picea.designpatterns.bridge;

/**
 * <p>House</p>
 * <p>description.</p>
 *
 * @author : jiangbing.yang
 * @version 0.1
 * @date : 2019/12/27 16:59
 * @company :
 */

public class House implements Product{

    @Override
    public void beProduct() {
        System.out.println("建造了房子 10 栋");
    }

    @Override
    public void beSelled() {
        System.out.println("卖出房子 8 栋");
    }
}
