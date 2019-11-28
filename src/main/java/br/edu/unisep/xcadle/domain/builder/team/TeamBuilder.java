package br.edu.unisep.xcadle.domain.builder.team;

import br.edu.unisep.xcadle.domain.dto.team.NewTeamDto;
import br.edu.unisep.xcadle.domain.dto.team.TeamDto;
import br.edu.unisep.xcadle.model.entity.Team;

public class TeamBuilder {

    public static TeamDto toTeamDto(Team t){
        return TeamDto.builder()
                .id(t.getId())
                .name(t.getName())
                .teamName(t.getTeamName())
                .build();
    }

    public static Team fromNewTeamDto(NewTeamDto newTeam){
        return Team.builder()
                .name(newTeam.getName())
                .teamName(newTeam.getTeamName())
                .build();
    }

}
