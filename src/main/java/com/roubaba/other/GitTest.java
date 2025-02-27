package com.roubaba.other;

import com.sun.org.apache.xpath.internal.objects.XString;

public class GitTest {

    public static void main(String[] args) {
        System.out.println("Hello Git !");
        System.out.println("Hello Git 2 !");
        System.out.println("Hello Git 3 !");
        System.out.println("Hello Git 3 !" + "这里是dev的分支，请注意");
    }


    public void sport(String name, int age){
        System.out.println("我先自我介绍一下：");
        System.out.println("我叫" + name + "，我今年" + age + "岁了！");
        System.out.println("我在github上改了代码，加了这行代码，测试从本地拉取GitHub上的代码");
    }

    public String eat(String foodName){
        System.out.println("我最喜欢吃辣椒炒肉");
        return "我最喜欢吃辣椒炒肉master test !";
    }



}
