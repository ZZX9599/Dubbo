package com.zzx.service;

import com.zzx.domain.User;

/**
 * @author ZZX
 * @date 2022/4/23 15:56
 */
public interface UserService {
    /**
     * 根据id查询User
     * @param id
     * @return
     */
    User queryUserById(Integer id);
}
