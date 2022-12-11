package com.example.periodicals.service.impl;

import com.example.periodicals.dto.CreateUserDto;
import com.example.periodicals.dto.PeriodicalDto;
import com.example.periodicals.dto.UserDto;
import com.example.periodicals.mappers.PeriodicalMapper;
import com.example.periodicals.mappers.UserMapper;
import com.example.periodicals.repository.UserRepository;
import com.example.periodicals.service.UserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Service
@Slf4j
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;
    private UserMapper userMapper;

    private PeriodicalMapper periodicalMapper;

    public UserDto createUser(CreateUserDto userDto) {
        log.debug(userMapper.toUser(userDto).toString());
        return userMapper.toUserDto(
                userRepository.save(
                        userMapper.toUser(userDto)));
    }

    public UserDto getUserById(long id) {
        return userMapper.toUserDto(userRepository.getReferenceById(id));
    }

    @Override
    public UserDto addPeriodical(UserDto userDto, PeriodicalDto periodicalDto) {
        userDto.addPeriodical(periodicalMapper.toPeriodical(periodicalDto));
        return userMapper.toUserDto(
                userRepository.save(userMapper.toUser(userDto)));
    }

    @Override
    public void deleteUser(long id) {
        userRepository.deleteUserById(id);
    }


}
