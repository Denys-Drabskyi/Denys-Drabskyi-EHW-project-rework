package com.example.periodicals.controller;

import com.example.periodicals.mappers.UserMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

@Controller
public class Mappers {
    @Bean
    public UserMapper userMapper (){
        return org.mapstruct.factory.Mappers.getMapper(UserMapper.class);
    }
}
