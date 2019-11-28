package br.edu.unisep.xcadle.domain.usecase.user;

import br.edu.unisep.xcadle.domain.builder.user.UserBuilder;
import br.edu.unisep.xcadle.domain.dto.user.UserDto;
import br.edu.unisep.xcadle.model.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ListUserUseCase {

    private UserRepository repository;

    public List<UserDto> execute() {
        var users = repository.findAll();

        return users.stream()
                .map(UserBuilder::toUserDto)
                .collect(Collectors.toList());
    }



}
