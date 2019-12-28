package com.picea.designpatterns.chainofresponsibility.v02;

/**
 * 过滤文字，例如一段文件需要过滤关键字
 *
 * 问题：可否抽出处理方式？这样处理只能写在代码里面？
 *
 * 原则：抽出变化的部分单独封装一个类，定义一个Filter来过滤
 *
 * 问题：假如需要做多个过滤，怎么办？如何处理？
 *
 */
public class ChainMain {
    public static void main(String[] args) {
        Msg msg = new Msg();
        msg.setMsg("你们好，<script>, 欢迎大家，我们都是9106");

        //通过我们定义的filter来过滤
        Filter filter = new Filter();
        filter.doFilter(msg);

        System.out.println("处理后消息：" + msg.getMsg());
    }
}
