package com.picea.designpatterns.chainofresponsibility.v04;

public class WorkTimeFilter implements Filter {
    @Override
    public void doFilter(Msg msg) {
        //处理方式1
        String m = msg.getMsg();
        m = m.replaceAll("9106","965");
        msg.setMsg(m);
    }
}
