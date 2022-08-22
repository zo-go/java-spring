package com.zb.config;

import com.zb.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(com.zb.pojo.User.class)
public class ZbConfig {
    @Bean
    public User getUser(){
        return new User();
    }
}
