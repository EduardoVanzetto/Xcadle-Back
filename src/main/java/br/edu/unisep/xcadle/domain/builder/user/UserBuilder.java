package br.edu.unisep.xcadle.domain.builder.user;

import br.edu.unisep.xcadle.domain.dto.user.NewUserDto;
import br.edu.unisep.xcadle.domain.dto.user.UserDto;
import br.edu.unisep.xcadle.model.entity.User;

public class UserBuilder {

    public static UserDto toUserDto(User u) {
        return UserDto.builder()
                .id(u.getId())
                .login(u.getLogin())
                .password(u.getPassword())
                .build();
    }

    public static User fromNewUserDto(NewUserDto newUser) {
        return User.builder()
                .name(newUser.getUser())
                .login(newUser.getLogin())
                .password(newUser.getPassword())
                .email(newUser.getEmail())
                .cellphone(newUser.getCellphone())
                .dtNascimento(newUser.getDtNascimento())
                .build();
    }
}
