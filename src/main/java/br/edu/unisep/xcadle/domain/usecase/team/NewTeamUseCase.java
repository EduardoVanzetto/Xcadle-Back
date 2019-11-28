package br.edu.unisep.xcadle.domain.usecase.team;

import br.edu.unisep.xcadle.domain.builder.team.TeamBuilder;
import br.edu.unisep.xcadle.domain.dto.team.NewTeamDto;
import br.edu.unisep.xcadle.model.repository.TeamRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class NewTeamUseCase {

    private TeamRepository repository;

    public void save(NewTeamDto newTeam){
        var team = TeamBuilder.fromNewTeamDto(newTeam);
        repository.save(team);
    }

}
