package com.lyn0801.user.service.client.hystrix;


import com.lyn0801.user.service.client.AuthServiceClient;
import com.lyn0801.user.service.entity.JWT;
import org.springframework.stereotype.Component;

/**
 * @author lyn0801
 */
@Component
public class AuthServiceHystrix implements AuthServiceClient {
    @Override
    public JWT getToken(String authorization, String type, String username, String password) {
        return null;
    }
}
