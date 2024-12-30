package com.example.springCloudAlibaba.design.adaptation;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/5/24 20:19
 */
public class Mp4Player implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        //什么也不做
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}
