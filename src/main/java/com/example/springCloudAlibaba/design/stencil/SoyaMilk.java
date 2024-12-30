package com.example.springCloudAlibaba.design.stencil;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/5/24 20:05
 */
public abstract  class SoyaMilk {
    // 模板方法：可以做成final，不让子类去覆盖
    final void make() {
        select();
        if(customerWantCondiment()) {
            addCondiment();
        }
        soak();
        beat();
    }
    //选材料
    void select() { System.out.println("第一步：选择新鲜的豆子"); }
    //添加不同的配料：抽象方法，由子类具体实现
    abstract void addCondiment();
    //浸泡
    void soak() { System.out.println("第三步：豆子和配料开始浸泡3H"); }
    //榨汁
    void beat() { System.out.println("第四步：豆子和配料放入豆浆机榨汁"); }
    //钩子方法：决定是否需要添加配料
    boolean customerWantCondiment() {
        return true;//默认情况下是要加配料的
    }
}
