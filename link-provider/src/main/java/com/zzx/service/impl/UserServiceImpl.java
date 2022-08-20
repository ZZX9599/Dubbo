package com.zzx.service.impl;

import com.zzx.domain.User;
import com.zzx.service.UserService;

/**
 * @author ZZX
 * @date 2022/4/23 14:59
 */
public class UserServiceImpl implements UserService {
    @Override
    public User queryUserById(Integer id) {
        User user = new User();
        user.setId(id);
        user.setUsername("lisi");
        user.setAge(23);
        return user;
    }
}
