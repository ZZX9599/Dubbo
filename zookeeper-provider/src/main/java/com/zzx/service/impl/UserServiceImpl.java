package com.zzx.service.impl;

import com.zzx.domain.User;
import com.zzx.service.UserService;

/**
 * @author ZZX
 * @date 2022/4/24 9:08
 */
public class UserServiceImpl implements UserService {
    @Override
    public User queryUserById(Integer id) {
        System.out.println("linux");
        User user=new User();
        user.setId(1001);
        user.setUsername("张三");
        return user;
    }
}
