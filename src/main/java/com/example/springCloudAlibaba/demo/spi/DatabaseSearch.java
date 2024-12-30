package com.example.springCloudAlibaba.demo.spi;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/3/5 20:52
 */
public class DatabaseSearch implements Search{
    @Override
    public List<String> searchDoc(String keyword) {
        System.out.println("数据搜索 "+keyword);
        return null;
    }

    public static void main(String[] args) {
        ServiceLoader<Search> load = ServiceLoader.load(Search.class);
        Iterator<Search> iterator = load.iterator();
        while (iterator.hasNext()) {
            Search search =  iterator.next();
            search.searchDoc("hello world");
        }

    }
}
