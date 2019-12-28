package com.picea.designpatterns.chainofresponsibility.v04;

public class HtmlFilter implements Filter {

    @Override
    public void doFilter(Msg msg) {
        //处理方式1
        String m = msg.getMsg();
        m = m.replaceAll("<script>","-_-");
        msg.setMsg(m);
    }
}
