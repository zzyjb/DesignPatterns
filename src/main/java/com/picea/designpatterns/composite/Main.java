package com.picea.designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>Main</p>
 * <p>description.</p>
 *
 * @author : jiangbing.yang
 * @version 0.1
 * @date : 2020/1/4 21:09
 * @company :
 *
 *  composite 组合模式/合成模式/树模式
 *  说树模式，大家可能更容易理解，
 *
 *  树分 根节点、叶子节点、非叶子节点
 *  例如一个机构树，这个是很常见的一种树
 *  我们拿机构树举例
 *
 *  如果按正常的模式 OrgCompnent 应该是所有的共性属性或者方法
 *  应该 是没有 child 的list
 *  如果没有 child 的list ，在client 写的时候会很别扭
 *
 */

public class Main {

    public static void main(String[] args) {
        OrgCompnent orgRoot = new OrgComposite("根目录","0");

        //增加一个带子机构的机构
        OrgCompnent orgZjb = new OrgComposite("总经办","1");
        //总经办下加一个叶子节点
        OrgCompnent orgCws = new OrgLeaf("财务室","2");
        //将财务室增加到总经办下
        orgZjb.addChild(orgCws);
        //总经办增加到根目录下
        orgRoot.addChild(orgZjb);
        
        //增加一个叶子机构 -后勤部门
        OrgCompnent orgHqbm = new OrgLeaf("后勤部","1");
        //后勤部门增加到根目录下
        orgRoot.addChild(orgHqbm);


        getThreeInfo(orgRoot);

    }

    public static void getThreeInfo(OrgCompnent root) {
        //首先输入根机构
        System.out.println(root.toString());

        if (root instanceof OrgLeaf) {
            return;
        }else {
            //遍历根机构，输出所有机构
            List<OrgCompnent> orgs = root.getChilds();
            for (OrgCompnent org : orgs) {
                getThreeInfo(org);
            }
        }
    }
}

abstract class OrgCompnent {

    private String name;
    private String level;
    private List<OrgCompnent> childs = new ArrayList<>();

    public OrgCompnent() {
    }

    public OrgCompnent(String name, String level) {
        this.name = name;
        this.level = level;
    }

    public OrgCompnent getOrg(){
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void addChild(OrgCompnent o) {
        this.childs.add(o);
    }

    public void removeChild(OrgCompnent o) {
        this.childs.remove(o);
    }

    public List getChilds() {
        return this.childs;
    }

    @Override
    public String toString() {
        return "OrgCompnent{" +
                "name='" + name + '\'' +
                ", level='" + level + '\'' +
                ", childs=" + childs +
                '}';
    }
}

class OrgLeaf extends OrgCompnent {
    public OrgLeaf(String name, String level) {
        super(name, level);
    }
}

class OrgComposite extends OrgCompnent {


    public OrgComposite(String name, String level) {
        super(name, level);
    }

    @Override
    public void addChild(OrgCompnent o) {
        super.addChild(o);
        System.out.println("addChild 方法： 我不是叶子节点，我还可以干点其他的事");
    }

    @Override
    public void removeChild(OrgCompnent o) {
        super.removeChild(o);
        System.out.println("removeChild 方法：我不是叶子节点，我还可以干点其他的事");
    }

    @Override
    public List getChilds() {
        System.out.println("getChilds 方法：我不是叶子节点，我还可以干点其他的事");
        return super.getChilds();
    }

    public OrgComposite() {
    }
}