package actor.exercise.actor_spring_exercise.controller;

import actor.exercise.actor_spring_exercise.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("actors")
public class ActorController {
    private ActorService actorService;
    @Autowired
    public ActorController(ActorService actorService) {
        this.actorService = actorService;
    }

    @GetMapping
    public String actors(Model model){
        model.addAttribute("actors", actorService.getActors());
        return "index";
    }

    @PostMapping
    public String addActor(@RequestParam("name") String name,
                           @RequestParam("famousRole") String famousRole,
                           @RequestParam("specialSkill") String specialSkill){
        actorService.addActor(name, famousRole, specialSkill);
        return "redirect:/actors";
    }
}
