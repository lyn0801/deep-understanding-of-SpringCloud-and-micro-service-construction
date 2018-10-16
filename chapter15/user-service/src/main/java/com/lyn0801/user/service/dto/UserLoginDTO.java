package com.lyn0801.user.service.dto;

import com.lyn0801.user.service.entity.JWT;
import com.lyn0801.user.service.entity.User;


import java.util.List;

/**
 * @author lyn0801
 */
public class UserLoginDTO {

    private JWT jwt;

    private User user;

    public JWT getJwt() {
        return jwt;
    }

    public void setJwt(JWT jwt) {
        this.jwt = jwt;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
