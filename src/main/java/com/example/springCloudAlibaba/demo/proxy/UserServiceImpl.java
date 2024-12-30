package com.example.springCloudAlibaba.demo.proxy;

import java.util.Collections;
import java.util.List;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/3/22 18:22
 */
public class UserServiceImpl {
    public List<User> findUserList() {
        return Collections.singletonList(new User("pdai", 18));
    }



}
