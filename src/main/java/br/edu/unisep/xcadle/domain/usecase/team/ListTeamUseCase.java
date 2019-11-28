package br.edu.unisep.xcadle.domain.usecase.team;

import br.edu.unisep.xcadle.domain.builder.team.TeamBuilder;
import br.edu.unisep.xcadle.domain.dto.team.TeamDto;
import br.edu.unisep.xcadle.model.repository.TeamRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ListTeamUseCase {

    private TeamRepository repository;

    public List<TeamDto> execute() {
        var team = repository.findAll();

        return team.stream()
                .map(TeamBuilder::toTeamDto)
                .collect(Collectors.toList());
    }
}
