package com.picea.designpatterns.bridge;

/**
 * <p>Corp</p>
 * <p>description.</p>
 *
 * @author : jiangbing.yang
 * @version 0.1
 * @date : 2019/12/27 17:00
 * @company :
 */

public abstract class Corp {

    public Product product;

    public Corp(Product product) {
        this.product = product;
    }

    //赚钱
    public void makeMoney() {
        // 生产
        this.product.beProduct();
        // 销售
        this.product.beSelled();

    }
}
