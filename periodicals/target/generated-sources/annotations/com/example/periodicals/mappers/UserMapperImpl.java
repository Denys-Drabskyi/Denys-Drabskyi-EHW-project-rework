package com.example.periodicals.mappers;

import com.example.periodicals.dto.CreateUserDto;
import com.example.periodicals.dto.UserDto;
import com.example.periodicals.model.User;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-11-27T22:34:04+0200",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 19.0.1 (Oracle Corporation)"
)
public class UserMapperImpl implements UserMapper {

    @Override
    public UserDto toUserDto(User user) {
        if ( user == null ) {
            return null;
        }

        UserDto.UserDtoBuilder userDto = UserDto.builder();

        userDto.id( user.getId() );
        userDto.name( user.getName() );
        userDto.login( user.getLogin() );
        userDto.money( user.getMoney() );

        return userDto.build();
    }

    @Override
    public User toUser(CreateUserDto userDto) {
        if ( userDto == null ) {
            return null;
        }

        User.UserBuilder user = User.builder();

        user.name( userDto.getName() );
        user.login( userDto.getLogin() );
        user.password( userDto.getPassword() );

        return user.build();
    }

    @Override
    public UserDto toUserDto(CreateUserDto userDto) {
        if ( userDto == null ) {
            return null;
        }

        UserDto.UserDtoBuilder userDto1 = UserDto.builder();

        userDto1.name( userDto.getName() );
        userDto1.login( userDto.getLogin() );

        return userDto1.build();
    }
}
