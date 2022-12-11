package com.example.periodicals.service;

import com.example.periodicals.dto.CreateUserDto;
import com.example.periodicals.dto.PeriodicalDto;
import com.example.periodicals.dto.UserDto;

public interface UserService {
    UserDto createUser(CreateUserDto userDto);
    UserDto getUserById(long id);

    UserDto addPeriodical(UserDto userDto, PeriodicalDto periodicalDto);

    void deleteUser(long id);
}
