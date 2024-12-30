package com.example.springCloudAlibaba.design.factory.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/5/24 14:19
 */
public class TestSwitchReflectDemo {
    private static HashMap<Integer, String> sMaps;
    static {
        sMaps = new HashMap<Integer, String>();
        sMaps.put(1, "method1");
        sMaps.put(2, "method2");
        sMaps.put(3, "method3");
        sMaps.put(4, "method4");
        sMaps.put(5, "method5");
        sMaps.put(6, "method6");
        sMaps.put(7, "method7");
        sMaps.put(8, "method8");
        sMaps.put(9, "method9");
        sMaps.put(10, "method10");
        sMaps.put(11, "method11");
        sMaps.put(12, "method12");
        sMaps.put(13, "method13");
        sMaps.put(14, "method14");
        sMaps.put(15, "method15");
        sMaps.put(16, "method16");
        sMaps.put(17, "method17");
        sMaps.put(18, "method18");
        sMaps.put(19, "method19");
        sMaps.put(20, "method20");
        sMaps.put(21, "method21");
    }


    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        int code=11;
        testReflect(11);
    }
    public static void testReflect(int code) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Class clz = Class.forName("com.example.springCloudAlibaba.design.factory.reflect.BusinessMethod");
        Object obj = clz.newInstance();
        Method m = clz.getDeclaredMethod(sMaps.get(code), Integer.TYPE);
        m.setAccessible(true);
        m.invoke(obj, code);
    }
}
