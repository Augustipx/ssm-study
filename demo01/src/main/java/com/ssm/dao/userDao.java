package com.ssm.dao;

import org.springframework.stereotype.Component;

@Component
public class userDao implements IUserDao {

    @Override
    public void getUser() {
        System.out.println("查询用户数据");
    }
}
