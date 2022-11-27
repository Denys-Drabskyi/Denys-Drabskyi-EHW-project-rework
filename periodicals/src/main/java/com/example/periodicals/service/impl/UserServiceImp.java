package com.example.periodicals.service.impl;

import com.example.periodicals.dto.CreateUserDto;
import com.example.periodicals.dto.UserDto;
import com.example.periodicals.mappers.UserMapper;
import com.example.periodicals.repository.UserRepository;
import lombok.Setter;

//@Service
@Setter
public class UserServiceImp
//        implements UserService
{
    UserRepository userRepository;
    UserMapper userMapper;

//    @Override
    public UserDto createUser(CreateUserDto userDto) {
        return userMapper.toUserDto(
                userRepository.save(
                        userMapper.toUser(userDto)));
    }

}
