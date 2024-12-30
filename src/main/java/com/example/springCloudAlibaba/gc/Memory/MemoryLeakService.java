package com.example.springCloudAlibaba.gc.Memory;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/6/5 12:24
 */
@Service
public class MemoryLeakService {
    /**
     * 共享变量，内存泄漏主要原因
     */
    private List<String> sharedStrs;

    /**
     * 随机数生成
     */
    private final Random seed = new Random();

    private void init() {
        sharedStrs = new ArrayList<>();
    }

    /**
     * 方法执行完，没有清空共享变量，导致引用对象无法回收
     *
     * @param size
     * @return
     */
    public List<String> extract(Integer size) {
        // 方法开始时清空变量
        init();
        IntStream.range(0, size).forEach(i -> sharedStrs.add(seed.nextLong() + "" + seed.nextLong()));
        return sharedStrs;
    }

    public void  clear() {
        sharedStrs.clear();
    }
}
