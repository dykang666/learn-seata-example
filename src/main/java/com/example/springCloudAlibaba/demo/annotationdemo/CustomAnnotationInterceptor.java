package com.example.springCloudAlibaba.demo.annotationdemo;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

/**
 * @author kangdongyang
 * @version 1.0
 * @description: 拦截器 CustomAnnotationInterceptor 来处理我们定义的注解：
 * @date 2024/3/3 13:33
 */
public class CustomAnnotationInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (handler instanceof HandlerMethod) {
            HandlerMethod handlerMethod = (HandlerMethod) handler;
            Method method = handlerMethod.getMethod();
            CustomAnnotation  customAnnotation = method.getAnnotation(CustomAnnotation.class);
            if (customAnnotation != null) {
                String value = customAnnotation.value();
                System.out.println("Custom Annotation Value: " + value);
            }

        }



        return true;
    }
}
