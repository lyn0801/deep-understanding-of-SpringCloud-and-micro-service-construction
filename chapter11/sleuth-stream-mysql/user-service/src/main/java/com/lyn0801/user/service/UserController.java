/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lyn0801.user.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author marstor
 */
@RestController
@RequestMapping("/user")
public class UserController {
    
    @RequestMapping(value="/hi", method=RequestMethod.GET)
    public String hi(){
        return "I'm lyn.";
    }
}
