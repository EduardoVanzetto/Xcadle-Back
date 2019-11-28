package br.edu.unisep.xcadle.controller.team;

import br.edu.unisep.xcadle.domain.dto.team.NewTeamDto;
import br.edu.unisep.xcadle.domain.dto.team.TeamDto;
import br.edu.unisep.xcadle.domain.usecase.team.ListTeamUseCase;
import br.edu.unisep.xcadle.domain.usecase.team.NewTeamUseCase;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/team")
public class TeamController {

    private ListTeamUseCase listTeamUseCase;
    private NewTeamUseCase newTeamUseCase;

    @PostMapping
    public void save(@RequestBody NewTeamDto newTeam) {
        newTeamUseCase.save(newTeam);
    }

    @GetMapping
    public List<TeamDto> listAll() {
        return listTeamUseCase.execute();
    }

}
