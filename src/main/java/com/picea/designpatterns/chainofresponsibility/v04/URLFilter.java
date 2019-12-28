package com.picea.designpatterns.chainofresponsibility.v04;

public class URLFilter implements Filter {
    @Override
    public void doFilter(Msg msg) {
        String s = msg.getMsg();
        s = s.replace("yangjiangbing.com","http://yangjiangbing.com");
        msg.setMsg(s);
    }
}
