package br.edu.unisep.xcadle.domain.usecase.user;

import br.edu.unisep.xcadle.domain.builder.UserBuilder;
import br.edu.unisep.xcadle.domain.dto.user.NewUserDto;
import br.edu.unisep.xcadle.model.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class NewUserUseCase {

    private UserRepository repository;

    public void save(NewUserDto newUser) {
        var user = UserBuilder.fromNewUserDto(newUser);
        repository.save(user);
    }

}
