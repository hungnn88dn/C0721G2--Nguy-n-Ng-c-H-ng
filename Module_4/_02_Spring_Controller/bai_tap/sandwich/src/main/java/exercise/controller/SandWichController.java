package exercise.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class SandWichController {

    @GetMapping
    public String showHome(){
        return "home";
    }

    @GetMapping(value = "choose")
    public String showCheck(@RequestParam("lettuce") String lettuce, @RequestParam("tomato") String tomato,
                            @RequestParam("mustard") String mustard, @RequestParam("sprouts") String sprouts, Model model){
        model.addAttribute("lettuce", lettuce);
        model.addAttribute("tomato", tomato);
        model.addAttribute("mustard", mustard);
        model.addAttribute("sprouts", sprouts);
      return "home";
    }
}
