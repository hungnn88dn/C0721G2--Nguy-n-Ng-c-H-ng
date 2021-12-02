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
import org.springframework.validation.BindingResult;

import org.springframework.web.bind.annotation.*;

import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

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
    public String displayBlog(Optional<String> author,
                              Optional<Integer> ecomID,
                              Model model,
                              @PageableDefault(size = 5) Pageable pageable) {
        if(!author.isPresent()){
            if(ecomID.isPresent()) {
                model.addAttribute("blogs",blogService.findAllBlogByEcommerceId(ecomID.get(),pageable));
                model.addAttribute("ecomID",ecomID.get());
            }else {
                model.addAttribute("blogs",blogService.findAllBlog(pageable));
            }
        }else {
            model.addAttribute("blogs",blogService.findAllBlogByName(author.get(),pageable));
            model.addAttribute("author",author.get());
        }
        model.addAttribute("ecommerces", ecommerceService.findAll());
        return "sort";
    }

    @GetMapping("blogs/create")
    public String create(Model model) {
        model.addAttribute("ecommerces", ecommerceService.findAll());
        model.addAttribute("blog", new Blog());
        return "create";
    }

    @PostMapping("blogs/save")
    public String save(@Valid @ModelAttribute("blog") Blog blog, BindingResult bindingResult, Model model) {
        if (bindingResult.hasFieldErrors()) {
            model.addAttribute("ecommerces", ecommerceService.findAll());
            return "create";
        }
        blogService.save(blog);
        return "home_ajax";
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

    @GetMapping("blogs/actionDelete/{id}")
    public String delete(@PathVariable int id, Model model, Pageable pageable) {
        System.out.println(id);
        blogService.deleteById(id);
        model.addAttribute("blogs",blogService.findAllBlog(pageable));
        model.addAttribute("ecommerces", ecommerceService.findAll());
        return "home_ajax";
    }

    @GetMapping("/blogs/view/{id}")
    public String view(@PathVariable int id, Model model) {
        model.addAttribute("blog", blogService.findById(id));
        return "view";
    }

    @GetMapping("/blogs/search")
    public String search(@PathVariable String author, Pageable pageable, Model model) {
        model.addAttribute("blog", blogService.findAllBlogByName(author,pageable));
        return "search";
    }
}
