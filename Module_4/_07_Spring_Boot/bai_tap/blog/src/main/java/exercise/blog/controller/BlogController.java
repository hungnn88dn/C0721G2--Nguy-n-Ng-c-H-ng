package exercise.blog.controller;

import org.springframework.data.domain.Page;
import exercise.blog.model.Blog;
import exercise.blog.model.Ecommerce;
import exercise.blog.service.IBlogService;
import exercise.blog.service.IEcommerceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class BlogController {


    @Qualifier("blogServiceImpl")
    @Autowired
    IBlogService blogService;

    @Qualifier("ecommerceRepoImpl")
    @Autowired
    IEcommerceService ecommerceService;


    @GetMapping("")
    public String showlist(){
        return "blog";
    }


    @GetMapping("blogs")
    public String displayBlog(Model model,@PageableDefault(size = 5) Pageable pageable) {
        model.addAttribute("blogs", blogService.findAllBlog(pageable));
        return "sort";
    }

    @GetMapping("blogs/create")
    public String create(Model model) {
        model.addAttribute("ecommerces", ecommerceService.findAll());
        model.addAttribute("blog", new Blog());
        return "create";
    }

    @PostMapping("blogs/save")
    public String save(Blog blog) {
        blogService.save(blog);
        return "redirect:/blogs";
    }

    @GetMapping("blogs/{id}/edit")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("blog", blogService.findById(id));
        model.addAttribute("ecommerces", ecommerceService.findAll());
        return "edit";
    }

    @PostMapping("blogs/update")
    public String update(Blog blog) {
        blogService.save( blog);
        return "redirect:/blogs";
    }

    @GetMapping("blogs/{id}/delete")
    public String delete(@PathVariable int id, Model model) {
        model.addAttribute("blog", blogService.findById(id));
        return "delete";
    }

    @PostMapping("blogs/delete")
    public String delete(Blog blog, RedirectAttributes redirect) {
        blogService.delete(blog);
        redirect.addFlashAttribute("success", "Removed song successfully!");
        return "redirect:/blogs";
    }

    @GetMapping("blogs/{id}/view")
    public String view(@PathVariable int id, Model model) {
        model.addAttribute("blog", blogService.findById(id));
        return "view";
    }

}
