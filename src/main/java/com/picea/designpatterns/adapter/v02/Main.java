package com.picea.designpatterns.adapter.v02;

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
 * 1. 新建一个接口类IUserInfo
 * 2. User1实现这个接口
 * 3. 新建立一个 UserAdapter 类实现IUserInfo接口，继承 user2 ，对 user2 进行适配
 *
 * 效果
 * 可以看到，IUserInfo iUserInfo 这个对象可以使用一个，选择后面的new的对象即可。
 * 我们也可以把UserAdapter 的构造方法打造成与User1一模一样。这样 User1 和 UserAdapter 就没有任何区别
 *
 */

public class Main {

    public static void main(String[] args) {
        //使用User1对象
        IUserInfo iUserInfo = new User1("1","张三","13122349987",
                "北京市海淀区","010-8832712");
        System.out.println(iUserInfo.toString());
        //使用 User2 对象
        BaseInfo baseInfo = new BaseInfo(2,"李四","18922234445");
        HomeInfo homeInfo = new HomeInfo("上海市","2928");
        IUserInfo iUserInfo1 =  new UserAdapter(baseInfo,homeInfo);
        System.out.println(iUserInfo1.toString());
    }

}
