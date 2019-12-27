package com.picea.designpatterns.bridge;

/**
 * <p>Main</p>
 * <p>description.</p>
 *
 * @author : jiangbing.yang
 * @version 0.1
 * @date : 2019/12/27 16:52
 * @company :
 *
 * 皮包公司 ，
 * 任何产品好卖，就卖某产品
 * 因为公司经营性质限制了产品，所以有了产品也需要新成立公司
 *
 * 1. 抽象出产品接口类 Product
 * 2. 产品实现, Clothes House
 * 3. 基础公司抽象类Corp
 * 4. 具体公司实现类ClothesCorp HouseCorp
 *
 * 效果
 * Product product  产品抽象类
 * Corp corp        公司抽象类
 * 可以通用
 */

public class Main {

    public static void main(String[] args) {
        //衣服生产公司
        Product product = new Clothes();
        ClothesCorp corp = new ClothesCorp(product);
        corp.makeMoney();

        //房地产公司
        Product product1 = new House();
        HouseCorp corp1 = new HouseCorp(product1);
        corp1.makeMoney();
    }
}
