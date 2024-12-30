package com.example.springCloudAlibaba.demo.Generics;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/3/5 20:03
 */
public class InfoImpl<T> implements Info<T>{
    private T var ;             // 定义属性

    public InfoImpl(T var){     // 通过构造方法设置属性内容
        this.setVar(var) ;
    }

    public void setVar(T var){
        this.var = var ;
    }

    @Override
    public T getVar() {
        return this.var;
    }

    public static void main(String[] args) {
        Info<String> i = null;        // 声明接口对象
        i = new InfoImpl("汤姆") ;  // 通过子类实例化对象
        System.out.println("内容：" + i.getVar()) ;
    }
}
