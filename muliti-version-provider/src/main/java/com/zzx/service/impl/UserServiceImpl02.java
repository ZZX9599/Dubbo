package com.zzx.service.impl;

import com.zzx.domain.User;
import com.zzx.service.UserService;

/**
 * @author ZZX
 * @date 2022/4/24 10:43
 */
public class UserServiceImpl02 implements UserService {
    @Override
    public User queryUserById(Integer id) {
        User user=new User();
        user.setId(id);
        user.setUsername("lisi");
        return user;
    }
}
