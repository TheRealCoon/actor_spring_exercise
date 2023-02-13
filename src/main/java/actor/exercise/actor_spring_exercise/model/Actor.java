package actor.exercise.actor_spring_exercise.model;

import actor.exercise.actor_spring_exercise.dto.ActorDto;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Actor {
    private int id;
    private String name;
    private String famousRole;
    private String specialSkill;
    private String bestMovie;

    public Actor(ActorDto actorDto) {
        this.name = actorDto.getName();
        this.famousRole = actorDto.getFamousRole();
        this.specialSkill = actorDto.getSpecialSkill();
        this.bestMovie = actorDto.getBestMovie();
    }
}
