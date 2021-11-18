package exercise.service;

import exercise.model.Blog;

import java.util.List;

public interface IBlogService {
    List<Blog> findAll();

    Blog findById(int id);

    void save(Blog blog);

    List<Blog> searchByName(String name);
}
