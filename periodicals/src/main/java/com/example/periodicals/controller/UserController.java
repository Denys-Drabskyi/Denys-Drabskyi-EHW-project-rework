package com.example.periodicals.controller;

import com.example.periodicals.dto.CreateUserDto;
import com.example.periodicals.dto.PeriodicalDto;
import com.example.periodicals.dto.UserDto;
import com.example.periodicals.mappers.PeriodicalMapper;
import com.example.periodicals.service.PeriodicalService;
import com.example.periodicals.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
//@AllArgsConstructor
@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public UserDto getUserById(@PathVariable(value = "id")int id){
        return userService.getUserById(id);
    }

    @PostMapping
    public UserDto register(@RequestBody CreateUserDto createUserDto){
        return userService.createUser(createUserDto);
    }

    @DeleteMapping("/{id}")
    public void deleteUser (@PathVariable long id){
        userService.deleteUser(id);
    }



}
