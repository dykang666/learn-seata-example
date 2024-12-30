package com.example.springCloudAlibaba.demo;

import java.util.ServiceLoader;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/2/29 21:11
 */
public class VedioSPITest {

    public static void main(String[] args) {
        ServiceLoader<VedioSPI> serviceLoader =ServiceLoader.load(VedioSPI.class);
        serviceLoader.forEach(t->{
            t.call();
        });
    }
}
