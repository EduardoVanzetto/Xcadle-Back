package br.edu.unisep.xcadle.domain.dto.team;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class NewTeamDto {

    private String name;

    private String teamName;

}
