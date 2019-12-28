package com.picea.designpatterns.chainofresponsibility.v03;
import java.util.ArrayList;
import java.util.List;

/**
 * 过滤文字，例如一段文件需要过滤关键字
 *
 * 问题：可否抽出处理方式？这样处理只能写在代码里面？
 *
 * 原则：抽出变化的部分单独封装一个类，定义一个Filter来过滤
 *
 * 问题：假如需要做多个过滤，怎么办？如何处理？
 *
 * 把我们最初写的 Filter 变成接口，另外定义HtmlFilter、WorkTimeFilter实现接口
 * 然后把所有需要过滤的接口，都放入到list中
 * 循环list，实现过滤
 *
 * 问题：这些filter还不是一个链条，如何变成责任链条的方式？
 *
 */
public class ChainMain {
    public static void main(String[] args) {
        Msg msg = new Msg();
        msg.setMsg("你们好，<script>, 欢迎大家，我们都是9106");

        //通过我们定义的filterList来过滤
        List<Filter> filters = new ArrayList<>();
        filters.add(new HtmlFilter());
        filters.add(new WorkTimeFilter());

        for (Filter f: filters) {
            f.doFilter(msg);
        }
        System.out.println("处理后消息：" + msg.getMsg());
    }
}
