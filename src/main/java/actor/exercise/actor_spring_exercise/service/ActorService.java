package actor.exercise.actor_spring_exercise.service;

import actor.exercise.actor_spring_exercise.dto.ActorDto;
import actor.exercise.actor_spring_exercise.model.Actor;
import actor.exercise.actor_spring_exercise.repository.ActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ActorService {
    private ActorRepository actorRepository;

    @Autowired
    public ActorService(ActorRepository actorRepository) {
        this.actorRepository = actorRepository;
    }

    public List<Actor> getActors() {
        return actorRepository.getActors();
    }

    public void addActor(String name, String famousRole, String specialSkill) {
        actorRepository.addActor(new Actor(new ActorDto(name, famousRole, specialSkill)));
    }
}
