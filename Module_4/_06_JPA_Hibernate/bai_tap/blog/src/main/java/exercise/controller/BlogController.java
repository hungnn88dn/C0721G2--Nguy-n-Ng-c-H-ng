package exercise.controller;

import exercise.model.Blog;
import exercise.service.IBlogService;
import exercise.service.impl.BlogServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BlogController {


    private IBlogService iBlogService = new BlogServiceImpl();

    @GetMapping ("")
    public String showlist(){
        return "home";
    }

    @GetMapping("blogs")
    public String index(Model model) {
        Blog blog =  new Blog(1,"a","b","d");
        List<Blog> blogs = new ArrayList<>();
        blogs.add(blog);
        model.addAttribute("blogs", blogs);
        return "list";
    }

    @GetMapping("blogs/create")
    public String create(Model model) {
        model.addAttribute("blog", new Blog());
        return "create";
    }

    @PostMapping("blogs/save")
    public String save(Blog blog) {
        iBlogService.save(blog);
        return "redirect:/home";
    }

}
