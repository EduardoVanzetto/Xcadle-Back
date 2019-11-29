package br.edu.unisep.xcadle.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Data
@AllArgsConstructor
@Builder
@Entity
@Table(name= "team")
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_team")
    private Integer id;

    @Column(name="team_name")
    private String name;

    @Column(name="team_teamName")
    private String teamName;

}
