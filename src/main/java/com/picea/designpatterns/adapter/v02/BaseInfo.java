package com.picea.designpatterns.adapter.v02;

/**
 * <p>BaseInfo</p>
 * <p>description.</p>
 *
 * @author : jiangbing.yang
 * @version 0.1
 * @date : 2019/12/26 15:30
 * @company :
 */

public class BaseInfo {

    private int id;
    private String name;
    private String MobileNumber;

    public BaseInfo(int id, String name, String mobileNumber) {
        this.id = id;
        this.name = name;
        MobileNumber = mobileNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNumber() {
        return MobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        MobileNumber = mobileNumber;
    }
}
