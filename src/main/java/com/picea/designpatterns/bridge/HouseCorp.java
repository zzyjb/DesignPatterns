package com.picea.designpatterns.bridge;

/**
 * <p>HouseCorp</p>
 * <p>description.</p>
 *
 * @author : jiangbing.yang
 * @version 0.1
 * @date : 2019/12/27 17:07
 * @company :
 */

public class HouseCorp extends Corp {
    public HouseCorp(Product product) {
        super(product);
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
        // 赚钱
        System.out.println("房地产公司，生产-销售一条龙，然后就在赚钱了@-@");
    }
}
