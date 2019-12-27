package com.picea.designpatterns.bridge;

/**
 * <p>ClothesCorp</p>
 * <p>description.</p>
 *
 * @author : jiangbing.yang
 * @version 0.1
 * @date : 2019/12/27 17:08
 * @company :
 */

public class ClothesCorp extends Corp {
    public ClothesCorp(Product product) {
        super(product);
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("服装公司，生产-销售一条龙，然后就在赚钱了@-@");
    }
}
