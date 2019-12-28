package com.picea.designpatterns.chainofresponsibility.v04;

public class FaceFilter implements Filter {
    @Override
    public void doFilter(Msg msg) {
        String s = msg.getMsg();
        s = s.replace("-V-","~@~");
        msg.setMsg(s);
    }
}
