package com.example.springCloudAlibaba.design.stencil;

/**
 * @author kangdongyang
 * @version 1.0
 * @description: 模版方法模式  一系列步骤
 * ------------------
 * 简单说，模板方法模式，定义一个操作中的算法的骨架，而将一些步骤延迟到子类中，使得子类可以不改变一个算法的结构，
 * 就可以重定义该算法的某些特定步骤，这种类型的设计模式属于行为型模式。
 * --------------------
 * 编写制作豆浆的程序，说明如下：
 * 制作豆浆的流程：选材—>添加配料—>浸泡—>放到豆浆机打碎
 * 通过添加不同的配料，可以制作出不同口味的豆浆
 * 选材、浸泡和放到豆浆机打碎这几个步骤对于制作每种口味的豆浆都是一样的
 * .模板方法模式的钩子方法-
 * 在模板方法模式的父类中，可以定义一个方法，它默认不做任何事，子类可以视情况要不要覆盖它，该方法称为“钩子”
 * @date 2024/5/24 20:02
 */
public class Client {
    public static void main(String[] args) {
//        System.out.println("=======制作红豆豆浆=======");
//        SoyaMilk redBeanSoyaMilk = new ReadBeanSoyaMilk();
//        redBeanSoyaMilk.make();
//        System.out.println("=======制作花生豆浆=======");
//        SoyaMilk peanutSoyaMilk = new PeanutSoyaMilk();
//        peanutSoyaMilk.make();
        System.out.println("=制作纯豆浆=");
        SoyaMilk pureSoyMilk = new PureSoyaMilk();
        pureSoyMilk.make();
    }
}
