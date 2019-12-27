package com.picea.designpatterns.adapter.v02;

/**
 * <p>UserAdapter</p>
 * <p>description.</p>
 *
 * @author : jiangbing.yang
 * @version 0.1
 * @date : 2019/12/27 15:47
 * @company :
 */

public class UserAdapter extends  User2 implements IUserInfo{

    private BaseInfo baseInfo = super.getBaseInfo();
    private HomeInfo homeInfo = super.getHomeInfo();

    public UserAdapter(BaseInfo baseInfo, HomeInfo homeInfo) {
        super(baseInfo, homeInfo);
    }

    @Override
    public String getId() {
        return String.valueOf(this.baseInfo.getId());
    }

    @Override
    public String getName() {
        return this.baseInfo.getName();
    }

    @Override
    public String getMobileNumber() {
        return this.baseInfo.getMobileNumber();
    }

    @Override
    public String getAddress() {
        return this.homeInfo.getAddress();
    }

    @Override
    public String getHomeTelNumber() {
        return this.homeInfo.getHomeTelNumber();
    }

    @Override
    public String toString() {
        return "User1{" +
                "id='" + this.baseInfo.getId() + '\'' +
                ", name='" + this.baseInfo.getName() + '\'' +
                ", mobileNumber='" + this.baseInfo.getMobileNumber() + '\'' +
                ", address='" + this.homeInfo.getAddress() + '\'' +
                ", homeTelNumber='" + this.homeInfo.getHomeTelNumber() + '\'' +
                '}';
    }
}
