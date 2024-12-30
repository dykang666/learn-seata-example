package com.example.springCloudAlibaba.demo.Generics;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/3/5 19:58
 */
public class Notepad<K,V> {// 此处指定了两个泛型类型
    private K key ;     // 此变量的类型由外部决定
    private V value ;   // 此变量的类型由外部决定
    public K getKey(){
        return this.key ;
    }
    public V getValue(){
        return this.value ;
    }
    public void setKey(K key){
        this.key = key ;
    }
    public void setValue(V value){
        this.value = value ;
    }
    public static void main(String args[]){
        Notepad<String,Integer> t = null ;        // 定义两个泛型类型的对象
        t = new Notepad<String,Integer>() ;       // 里面的key为String，value为Integer
        t.setKey("汤姆") ;        // 设置第一个内容
        t.setValue(20) ;            // 设置第二个内容
        System.out.print("姓名；" + t.getKey()) ;      // 取得信息
        System.out.print("，年龄；" + t.getValue()) ;       // 取得信息

    }
}
