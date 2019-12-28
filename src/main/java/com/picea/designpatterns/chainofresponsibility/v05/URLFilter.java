package com.picea.designpatterns.chainofresponsibility.v05;

public class URLFilter implements Filter {
    @Override
    public boolean doFilter(Msg msg) {
        String s = msg.getMsg();
        s = s.replace("yangjiangbing.com","http://yangjiangbing.com");
        msg.setMsg(s);
        return true;
    }
}
