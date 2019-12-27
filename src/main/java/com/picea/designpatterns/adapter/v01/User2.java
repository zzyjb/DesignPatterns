package com.picea.designpatterns.adapter.v01;

/**
 * <p>User2</p>
 * <p>description.</p>
 *
 * @author : jiangbing.yang
 * @version 0.1
 * @date : 2019/12/26 15:29
 * @company :
 */

public class User2 {

    private BaseInfo baseInfo;
    private HomeInfo homeInfo;

    public User2(BaseInfo baseInfo, HomeInfo homeInfo) {
        this.baseInfo = baseInfo;
        this.homeInfo = homeInfo;
    }

    public BaseInfo getBaseInfo() {
        return baseInfo;
    }

    public void setBaseInfo(BaseInfo baseInfo) {
        this.baseInfo = baseInfo;
    }

    public HomeInfo getHomeInfo() {
        return homeInfo;
    }

    public void setHomeInfo(HomeInfo homeInfo) {
        this.homeInfo = homeInfo;
    }
}
