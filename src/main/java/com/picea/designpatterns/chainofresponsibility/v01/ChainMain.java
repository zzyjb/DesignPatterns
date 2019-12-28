package com.picea.designpatterns.chainofresponsibility.v01;

/**
 * 过滤文字，例如一段文件需要过滤关键字
 *
 * 问题：可否抽出处理方式？这样处理只能写在代码里面？
 *
 */
public class ChainMain {
    public static void main(String[] args) {
        Msg msg = new Msg();
        msg.setMsg("你们好，<script>, 欢迎大家，我们都是9106");

        //?如何处理这段问题？
        //处理方式1
        String m = msg.getMsg();
        m = m.replaceAll("<script>","-_-");

        m = m.replaceAll("9106","965");
        msg.setMsg(m);

        System.out.println("处理后消息：" + msg.getMsg());
    }
}
