package actor.exercise.actor_spring_exercise.repository;

import actor.exercise.actor_spring_exercise.model.Actor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Repository
public class ActorRepository {
    private List<Actor> actors = new ArrayList<>() {{
        add(new Actor(1, "Bud Spencer", "Piedone", "big punches"));
        add(new Actor(2, "Terrence Hill", "Nobody", "being annoying"));
    }};

    public List<Actor> getActors() {
        return actors;
    }

    public void addActor(Actor actor) {
        actor.setId(actors.get(actors.size() - 1).getId() + 1);
        actors.add(actor);
    }

    public Actor findActorById(int id) {
        return actors.stream()
                .filter(actor -> actor.getId() == id)
                .findFirst()
                .orElseThrow(NoSuchElementException::new);
    }
}
