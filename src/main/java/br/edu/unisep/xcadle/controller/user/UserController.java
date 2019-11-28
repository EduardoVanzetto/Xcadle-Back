package br.edu.unisep.xcadle.controller.user;

import br.edu.unisep.xcadle.domain.dto.user.NewUserDto;
import br.edu.unisep.xcadle.domain.dto.user.UserDto;
import br.edu.unisep.xcadle.domain.usecase.user.ListUserUseCase;
import br.edu.unisep.xcadle.domain.usecase.user.NewUserUseCase;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/user")
public class UserController {

    private ListUserUseCase listUserUseCase;
    private NewUserUseCase newUserUseCase;

    @PostMapping
    public void save(@RequestBody NewUserDto newUser) {
        newUserUseCase.save(newUser);
    }

    @GetMapping
    public List<UserDto> listAll() {
        return listUserUseCase.execute();
    }

}
