package exercise.demo.service;

import exercise.demo.model.Borrow;
import exercise.demo.model.Status;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IStatusService {
    public List<Status> findAll();
    public Status findById(int id);
    Status save(Status status);
    void delete(Status status);
    public Page<Status> findAllBlog(Pageable pageable);
    public Page<Status> findAllBlogByName(String name,Pageable pageable);
    public Page<Status> findAllBlogByEcommerceId(int id,Pageable pageable);
}
