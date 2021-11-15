package exercise.controller;

import exercise.model.EmailSetting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SettingEmailController {

    @GetMapping(value = "")
    public String showHome(){
        return "home";
    }

    @GetMapping (value = "setting")
    public String showSetting(Model model){
       String[] language = new String[]{"English","Vietnamese","Japanese","Chinese"};
       String[] size = new String[]{"5","10","15","25","50","100"};
       model.addAttribute("language", language);
       model.addAttribute("size", size);
       model.addAttribute("emailSetting", new EmailSetting());
       return "setting";
    }

    @PostMapping (value = "setting")
    public String infoSetting(@ModelAttribute("emailSetting") EmailSetting emailSetting, Model model){
        model.addAttribute("infoSetting", emailSetting);
        return "info";
    }
}
