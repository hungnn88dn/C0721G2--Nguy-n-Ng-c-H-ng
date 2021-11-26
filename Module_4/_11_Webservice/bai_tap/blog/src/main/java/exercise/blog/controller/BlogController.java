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
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import org.springframework.web.bind.annotation.*;

import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("blogs")
public class BlogController {


    @Qualifier("blogServiceImpl")
    @Autowired
    IBlogService blogService;

    @Qualifier("ecommerceRepoImpl")
    @Autowired
    IEcommerceService ecommerceService;


    @GetMapping
    public ResponseEntity<List<Blog>> displayBlog() {
          List<Blog> blogs = blogService.findAll();
        if (blogs.size() == 0) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
          return new ResponseEntity<>(blogs, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Blog> save(@RequestBody Blog blog) {
        return new ResponseEntity<>(blogService.save(blog), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Blog> edit(@PathVariable int id, @RequestBody Blog blog) {
        Blog blogOptional = blogService.findById(id);
        blog.setId(blogOptional.getId());
        return new ResponseEntity<>(blogService.save(blog), HttpStatus.OK);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Blog> delete(@PathVariable int id) {
        Optional<Blog> blogOptional = blogService.findByIdOp(id);
        if (!blogOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        blogService.deleteById(id);
        return new ResponseEntity<>(blogOptional.get(), HttpStatus.NO_CONTENT);
    }
}
