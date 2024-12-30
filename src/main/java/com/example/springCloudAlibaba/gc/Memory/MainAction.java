package com.example.springCloudAlibaba.gc.Memory;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/6/5 15:10
 */
public class MainAction {
    public static void main(String[] args) {
        MemoryLeakService memoryLeakService = new MemoryLeakService();
        memoryLeakService.extract(1000000);
        memoryLeakService.clear();
        UnluckyService unluckyService = new UnluckyService();
        unluckyService.extract(1000000);
    }
}
