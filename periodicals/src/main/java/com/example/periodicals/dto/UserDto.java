package com.example.periodicals.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserDto {
    private long id;
    private String name;

    private String login;

    private int money;
}
