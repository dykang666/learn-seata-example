package com.example.springCloudAlibaba.demo.impl;

import com.example.springCloudAlibaba.demo.VedioSPI;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/2/29 21:09
 */
public class Mp3Vedio implements VedioSPI {
    @Override
    public void call() {
        System.out.println("this is mp3 call");
    }
}
