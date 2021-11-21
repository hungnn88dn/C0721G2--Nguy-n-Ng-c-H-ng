package exercise.blog.service;

import exercise.blog.model.Blog;
import org.springframework.data.domain.Page;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IBlogService {

    public List<Blog> findAll();
    public Blog findById(int id);
    Blog save(Blog blog);
    void delete(Blog blog);
    public Page<Blog> findAllBlog(Pageable pageable);
}
