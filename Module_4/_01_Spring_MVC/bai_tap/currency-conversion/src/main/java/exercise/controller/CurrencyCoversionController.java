package exercise.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CurrencyCoversionController {

    @GetMapping
    public String showHome() {
        return "home";
    }

    @GetMapping (value = "create")
    public String convert(@RequestParam double rate, @RequestParam double usd, Model model) {
        double result = 0.0;
        result = rate * usd;
        model.addAttribute("resultConvert",result);
        return "home";
    }
}
