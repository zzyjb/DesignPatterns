package com.picea.designpatterns.adapter.v02;

/**
 * <p>User1</p>
 * <p>description.</p>
 *
 * @author : jiangbing.yang
 * @version 0.1
 * @date : 2019/12/26 15:29
 * @company :
 */

public class User1 implements IUserInfo{
    private String id;
    private String name;
    private String mobileNumber;
    private String address;
    private String homeTelNumber;

    public  User1(String id, String name,String mobileNumber,String address,String homeTelNumber) {
        this.id = id;
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.address = address;
        this.homeTelNumber = homeTelNumber;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getMobileNumber() {
        return this.mobileNumber;
    }

    @Override
    public String getAddress() {
        return this.address;
    }

    @Override
    public String getHomeTelNumber() {
        return this.homeTelNumber;
    }

    @Override
    public String toString() {
        return "User1{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", address='" + address + '\'' +
                ", homeTelNumber='" + homeTelNumber + '\'' +
                '}';
    }
}
