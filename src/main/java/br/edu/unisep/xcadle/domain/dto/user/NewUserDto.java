package br.edu.unisep.xcadle.domain.dto.user;

import lombok.Data;

import java.util.Date;

@Data
public class NewUserDto {

    private String user;

    private String login;

    private String password;

    private String email;

    private Integer cellphone;

    private Date dtNascimento;

}
