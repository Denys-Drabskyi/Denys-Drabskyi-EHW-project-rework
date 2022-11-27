package com.example.periodicals.service;

import com.example.periodicals.dto.CreateUserDto;
import com.example.periodicals.dto.UserDto;
import com.example.periodicals.mappers.UserMapper;
import com.example.periodicals.repository.UserRepository;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//public interface UserService {
////    UserDto getUserByLogin(String login);
//
//    UserDto createUser(CreateUserDto userDto);
////    List<UserDto> getUsers();
////    UserDto getUserByLoginAndPassword(String login, String Password);
////    UserDto banUnbanUser(UserDto user);
////    void subscribeUser(UserDto user, PeriodicalDto periodical);
////    void moneyUpdate(UserDto user, int money);
////    void register_user(String name, String login, String password);
//
//}

@Service
@Setter
@Slf4j
@AllArgsConstructor
public class UserService {
    private UserRepository userRepository;
    private UserMapper userMapper;

    public UserDto createUser(CreateUserDto userDto) {
        log.debug(userMapper.toUser(userDto).toString());
//        System.out.println(userMapper.toUser(userDto));
        return userMapper.toUserDto(
                userRepository.save(
                        userMapper.toUser(userDto)));
    }

    public UserDto getUserById(long id) {
        return userMapper.toUserDto(userRepository.getReferenceById(id));
    }
}