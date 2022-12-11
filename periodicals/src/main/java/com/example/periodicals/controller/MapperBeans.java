package com.example.periodicals.controller;

import com.example.periodicals.mappers.PeriodicalMapper;
import com.example.periodicals.mappers.SourceMapper;
import com.example.periodicals.mappers.UserMapper;
import org.mapstruct.factory.Mappers;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

@Controller
public class MapperBeans {
    @Bean
    public UserMapper userMapper (){
        return Mappers.getMapper(UserMapper.class);
    }
    @Bean
    public PeriodicalMapper periodicalMapper (){
        return Mappers.getMapper(PeriodicalMapper.class);
    }
    @Bean
    public SourceMapper sourceMapper (){return Mappers.getMapper(SourceMapper.class);}
}
