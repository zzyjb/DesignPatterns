package com.picea.designpatterns.chainofresponsibility.v06;

public class WorkTimeFilter implements Filter {
    @Override
    public boolean doFilter(Request request, Response response, FilterChain filterChain) {

        //处理方式1
        String str = request.getStr();
        str = str + "--我是 WorkTimeFilter --,我在处理 request ----";
        request.setStr(str);

        filterChain.doFilter(request,response);

        String strResponse = response.getStr();
        strResponse = strResponse + "--我是 WorkTimeFilter --,我在处理 response ----";
        response.setStr(strResponse);
        return true;
    }
}
