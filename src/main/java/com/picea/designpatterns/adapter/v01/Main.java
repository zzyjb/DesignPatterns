package com.picea.designpatterns.adapter.v01;

/**
 * <p>Main</p>
 * <p>description.</p>
 *
 * @author : jiangbing.yang
 * @version 0.1
 * @date : 2019/12/26 15:24
 * @company :
 *
 * adapter 适配器模式
 * 两个公司的系统都是用户表 user1 user2，存在差异
 * 例如：
 * 1. ID的类型不一致，一个是string，一个是int
 * 2. XXX，忽略
 * 如何使用？
 *
 * 我们正常的使用方法如下：
 * 只能分开new对象，程序无法通用
 *
 */

public class Main {

    public static void main(String[] args) {
        //使用User1对象
        User1 iUserInfo = new User1("1","张三","13122349987",
                "北京市海淀区","010-8832712");
        System.out.println(iUserInfo.toString());
        //使用 User2 对象
        BaseInfo baseInfo = new BaseInfo(2,"李四","18922234445");
        HomeInfo homeInfo = new HomeInfo("上海市","2928");
        User2 iUserInfo1 =  new User2(baseInfo,homeInfo);
        System.out.println(iUserInfo1.toString());
    }

}
