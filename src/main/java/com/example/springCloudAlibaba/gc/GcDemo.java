package com.example.springCloudAlibaba.gc;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/6/5 10:05
 */
public class GcDemo {

    public static void main(String[] args)  {
    loadAccount();

    }
    private static void loadAccount() {
        Accout account1 = new Accout("Test01");
        Accout account2 = new Accout("Test02");
        List<Accout> arrayList = new ArrayList<>();
        arrayList.add(account1);
        arrayList.add(account2);
        System.out.println(arrayList.toString());



    }
}
