package com.example.springCloudAlibaba.demo.proxy;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.cglib.proxy.Enhancer;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/3/22 18:25
 */
public class UserLogProxy implements MethodInterceptor  {

    private Object target;
    public Object getUserLogProxy(Object target) {
        //给业务对象赋值
        this.target = target;
        //创建加强器，用来创建动态代理类
        Enhancer enhancer = new Enhancer();
        //为加强器指定要代理的业务类（即：为下面生成的代理类指定父类）
        enhancer.setSuperclass(this.target.getClass());
        //设置回调：对于代理类上所有方法的调用，都会调用CallBack，而Callback则需要实现intercept()方法进行拦
        //enhancer.setCallback(this);
        // 创建动态代理类对象并返回
        return enhancer.create();
    }



    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        return null;
    }

}
