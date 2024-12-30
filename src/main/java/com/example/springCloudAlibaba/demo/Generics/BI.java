package com.example.springCloudAlibaba.demo.Generics;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/3/5 20:18
 */
public class BI<T,K> implements AI<T> {

    private K k;
    public void setK(K k){
        this.k = k;
    }
    @Override
    public void sss(T t) {
        System.out.println("t is["+t+"], k is["+k+"]");
    }

    public static void main(String[] args) {
        BI<String,Integer> bi = new BI<>();
        bi.setK(100);
        bi.sss("abc");
    }
}
