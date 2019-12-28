package com.picea.designpatterns.chainofresponsibility.v05;

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
 * 定义一个 FilterChain 保存所有的 Filter ，FilterChain 也实现 Filter 接口
 * 这样保证 FilterChain 链条可以有序进行。
 *
 * 问题：使用 Filter 的结果确定 Filter 是否继续往下处理？
 *
 * 修改 doFilter的返回值为 boolean
 *
 * 问题：如下实现下面调用（Java 默认的 filter 就是这么要求的）
 * request 请求--->过滤器1--->过滤器2--->过滤器3--->处理完成返回---
 * response 响应<--过滤器1<---过滤器2<---过滤器3 <-----------------
 *
 */
public class ChainMain {
    public static void main(String[] args) {
        Msg msg = new Msg();
        msg.setMsg("你们好，<script>，-V-，欢迎大家，我们都是9106，更新信息请登录 yangjiangbing.com");

        //通过我们定义的 filterChain 来过滤
        FilterChain filterChain = new FilterChain();
        filterChain.addFilter(new HtmlFilter());
        filterChain.addFilter(new WorkTimeFilter());

        //我们定义另外一个 filterChain1
        FilterChain filterChain1 = new FilterChain();
        filterChain1.addFilter(new FaceFilter());
        filterChain1.addFilter(new URLFilter());

        //把另外的 filterChain1 假如到第一个 filterChain ，可以实现链条的有序进行
        filterChain.addFilter(filterChain1);

        filterChain.doFilter(msg);

        System.out.println("处理后消息：" + msg.getMsg());
    }
}
