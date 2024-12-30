package com.example.springCloudAlibaba.demo.annotationdemo.MyAnnotation1;

import java.lang.annotation.*;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/3/3 14:00
 */
@Documented
//设置注解的生命力在运行期
@Retention(RetentionPolicy.RUNTIME)
//@MyAnnotation被限定只能使用在类、接口或方法上面
@Target(value = {ElementType.METHOD,ElementType.TYPE})
public @interface MyAnnotation {
    public String name();
    int age();
    String sex() default "女";
    String[] hobby();
}
