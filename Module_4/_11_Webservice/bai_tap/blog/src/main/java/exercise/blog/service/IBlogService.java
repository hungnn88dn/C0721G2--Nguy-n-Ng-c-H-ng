package exercise.blog.service;

import exercise.blog.model.Blog;
import org.springframework.data.domain.Page;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface IBlogService {
    public List<Blog> findAll();
    public Blog findById(int id);
    Blog save(Blog blog);
    void delete(Blog blog);
    void deleteById(int id);
    public Page<Blog> findAllBlog(Pageable pageable);
    public Page<Blog> findAllBlogByName(String name,Pageable pageable);
    public Page<Blog> findAllBlogByEcommerceId(int id,Pageable pageable);
    Optional<Blog> findByIdOp(int id);

}
