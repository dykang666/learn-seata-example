package com.example.springCloudAlibaba.design.adaptation;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/5/24 20:18
 */
public class VlcPlayer implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //什么也不做
    }
}
