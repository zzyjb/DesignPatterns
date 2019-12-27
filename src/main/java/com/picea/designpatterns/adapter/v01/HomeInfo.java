package com.picea.designpatterns.adapter.v01;

/**
 * <p>HomeInfo</p>
 * <p>description.</p>
 *
 * @author : jiangbing.yang
 * @version 0.1
 * @date : 2019/12/26 15:30
 * @company :
 */

public class HomeInfo {
    private String address;
    private String homeTelNumber;

    public HomeInfo(String address, String homeTelNumber) {
        this.address = address;
        this.homeTelNumber = homeTelNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHomeTelNumber() {
        return homeTelNumber;
    }

    public void setHomeTelNumber(String homeTelNumber) {
        this.homeTelNumber = homeTelNumber;
    }
}
