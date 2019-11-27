package br.edu.unisep.xcadle.domain.dto.user;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserDto {

    private Integer id;

    private String login;

    private String password;

}
