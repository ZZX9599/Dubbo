package com.zzx.service;

import com.zzx.domain.User;

/**
 * @author ZZX
 * @date 2022/4/23 14:59
 */
public interface UserService {

    /**
     * 根据用户标识获取用户信息
     * @param id
     * @return
     */
    User queryUserById(Integer id);
}

