package com.lyn0801.user.service.web;

import com.lyn0801.user.service.dto.UserLoginDTO;
import com.lyn0801.user.service.entity.User;
import com.lyn0801.user.service.service.UserServiceDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lyn0801
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserServiceDetail userServiceDetail;

    @PostMapping("/register")
    public User postUser(@RequestParam("username") String username ,@RequestParam("password") String password){
        //参数判断，省略
       return userServiceDetail.insertUser(username,password);
    }

    @PostMapping("/login")
    public UserLoginDTO login(@RequestParam("username") String username , @RequestParam("password") String password){
        //参数判断，省略
        return userServiceDetail.login(username,password);
    }
}
