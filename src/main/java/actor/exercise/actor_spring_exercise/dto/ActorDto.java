package actor.exercise.actor_spring_exercise.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ActorDto {
    private String name;
    private String famousRole;
    private String specialSkill;
    private String bestMovie;
}
