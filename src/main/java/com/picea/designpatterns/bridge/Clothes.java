package com.picea.designpatterns.bridge;

/**
 * <p>Clothes</p>
 * <p>description.</p>
 *
 * @author : jiangbing.yang
 * @version 0.1
 * @date : 2019/12/27 16:58
 * @company :
 */

public class Clothes implements Product {
    @Override
    public void beProduct() {
        System.out.println("生产了 Clothes 100件");
    }

    @Override
    public void beSelled() {
        System.out.println("卖出 Clothes 90 件");
    }
}
