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
 * @date 2024/6/5 12:25
 */
@Service
public class UnluckyService {
    /**
     * 随机数生成
     */
    private final Random seed = new Random();

    public List<String> extract(Integer size) {
        List<String> innerStrs = new ArrayList<>();
        IntStream.range(0, size).forEach(i -> innerStrs.add(seed.nextLong() + "" + seed.nextLong()));
        return innerStrs;
    }
}
