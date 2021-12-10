package exercise.ciname.controller;

import exercise.ciname.model.Cinema;
import exercise.ciname.service.ICinameService;
import exercise.ciname.service.IFilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

@Controller
public class CinemaController {

    @Qualifier("cinemaService")
    @Autowired
    ICinameService cinameService;

    @Qualifier("filmService")
    @Autowired
    IFilmService filmService;


    @GetMapping("/home")
    public String showHome(){
        return "home";
    }

    @GetMapping("/cinema")
    public String displayBlog( Optional<Integer> filmID,
                              Model model,
                              @PageableDefault(size = 5) Pageable pageable) {
        if(filmID.isPresent()){
            model.addAttribute("cinemas",cinameService.findAllCinemaByFilmID(filmID.get(),pageable));
            model.addAttribute("name",filmID.get());
        }else {
            model.addAttribute("cinemas", cinameService.findAllCinema(pageable));
        }
        model.addAttribute("films", filmService.findAll());
        return "list";
    }

    @GetMapping("cinema/create")
    public String create(Model model) {
        model.addAttribute("films", filmService.findAll());
        model.addAttribute("cinema", new Cinema());
        return "create";
    }

    @PostMapping("cinema/save")
    public String save(@Validated @ModelAttribute("cinema") Cinema cinema, BindingResult bindingResult, Model model) {
        if (bindingResult.hasFieldErrors() ) {
            model.addAttribute("films", filmService.findAll());
            return "create";
        }
        cinameService.save(cinema);
        return "redirect:/cinema";
    }

    @GetMapping("cinema/{id}/edit")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("films", filmService.findAll());
        model.addAttribute("cinema", cinameService.findById(id));
        return "edit";
    }

    @PostMapping("cinema/update")
    public String update(@Validated @ModelAttribute("cinema") Cinema cinema,BindingResult bindingResult, Model model) {
        if (bindingResult.hasFieldErrors() ) {
            model.addAttribute("films", filmService.findAll());
            return "edit";
        }
        cinameService.save(cinema);
        return "redirect:/cinema";
    }
    @GetMapping("cinema/actionDelete/{id}")
    public String delete(@PathVariable int id) {
        cinameService.deleteById(id);
        return "redirect:/cinema";
    }
}
