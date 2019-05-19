package com.wfj.learn.gateway.entity;


import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private Long id;
    private String username;
    private String password;

    public User() {
    }

    public User(Long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }
}
