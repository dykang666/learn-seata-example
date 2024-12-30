package com.example.springCloudAlibaba.gc;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author kangdongyang
 * @version 1.0
 * @description: 内存泄漏
 * @date 2024/6/5 9:46
 */
public class MemoryLeak {

    public static void main(String[] args) {
        MemoryLeak memoryLeak = new MemoryLeak();
        while (true) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            memoryLeak.run();
        }
    }

    private void run() {
        // 不断创造非核心线程
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            executorService.submit(()->{
                System.out.println(Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
        }





    }


}
