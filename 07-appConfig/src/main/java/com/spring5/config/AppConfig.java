package com.spring5.config;

import com.spring5.pojo.User;
import org.springframework.context.annotation.*;

@Configuration
@Import(AppConfig1.class)
public class AppConfig {
    @Bean
    @Scope("singleton")
    public User user(){
        return new User();
    }

}
