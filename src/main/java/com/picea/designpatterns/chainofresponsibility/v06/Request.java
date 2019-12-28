package com.picea.designpatterns.chainofresponsibility.v06;

public class Request {
    String str;

    public Request(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}
