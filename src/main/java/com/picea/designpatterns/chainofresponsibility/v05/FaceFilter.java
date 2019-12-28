package com.picea.designpatterns.chainofresponsibility.v05;

public class FaceFilter implements Filter {
    @Override
    public boolean doFilter(Msg msg) {
        String s = msg.getMsg();
        s = s.replace("-V-","~@~");
        msg.setMsg(s);
        return true;
    }
}
