package com.picea.designpatterns.chainofresponsibility.v02;

public class Filter {

    public void doFilter(Msg msg) {
        //处理方式1
        String m = msg.getMsg();
        m = m.replaceAll("<script>","-_-");

        m = m.replaceAll("9106","965");
        msg.setMsg(m);
    }
}
