package com.example.periodicals.mappers;

import com.example.periodicals.dto.CreateUserDto;
import com.example.periodicals.dto.UserDto;
import com.example.periodicals.model.User;
import org.mapstruct.Mapper;

import org.springframework.stereotype.Component;

@Mapper
public interface UserMapper {

    UserDto toUserDto(User user);

    User toUser(CreateUserDto userDto);
    User toUser(UserDto userDto);
    UserDto toUserDto(CreateUserDto userDto);
}
