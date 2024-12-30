package com.example.springCloudAlibaba.demo.spi;

import java.util.List;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/3/5 20:52
 */
public interface Search {
    public List<String> searchDoc(String keyword);
}
