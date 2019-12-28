package com.picea.designpatterns.chainofresponsibility.v05;

public class HtmlFilter implements Filter {

    @Override
    public boolean doFilter(Msg msg) {
        //处理方式1
        String m = msg.getMsg();
        m = m.replaceAll("<script>","-_-");
        msg.setMsg(m);
        return false;
    }
}
