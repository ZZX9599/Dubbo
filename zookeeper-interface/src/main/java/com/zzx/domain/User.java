package com.zzx.domain;

import java.io.Serializable;

/**
 * @author ZZX
 * @date 2022/4/24 9:02
 */
public class User implements Serializable {
    private Integer id;
    private String username;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
