package exercise.controller;

import exercise.model.Song;
import exercise.service.SongService;
import exercise.service.SongServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class SongController {

    private SongService songService = new SongServiceImpl();


    @GetMapping ("")
    public String showlist(){
        return "song";
    }

    @GetMapping("songs")
    public String index(Model model) {
        List<Song> songs = songService.findAll();
        model.addAttribute("songs", songs);
        return "list";
    }

    @GetMapping("songs/create")
    public String create(Model model) {
        model.addAttribute("song", new Song());
        return "create";
    }

    @PostMapping("songs/save")
    public String save(Song song) {
        songService.create(song);
        return "redirect:/songs";
    }

    @GetMapping("songs/{id}/edit")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("song", songService.findOne(id));
        return "edit";
    }

    @PostMapping("songs/update")
    public String update(Song song) {
        songService.save( song);
        return "redirect:/songs";
    }

    @GetMapping("songs/{id}/delete")
    public String delete(@PathVariable int id, Model model) {
        model.addAttribute("song", songService.findOne(id));
        return "delete";
    }

    @PostMapping("songs/delete")
    public String delete(Song song, RedirectAttributes redirect) {
        int a = song.getId();
        songService.delete(song.getId());
        redirect.addFlashAttribute("success", "Removed song successfully!");
        return "redirect:/songs";
    }

    @GetMapping("songs/{id}/view")
    public String view(@PathVariable int id, Model model) {
        model.addAttribute("song", songService.findOne(id));
        return "view";
    }
}
