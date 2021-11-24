package exercise.demo.service.impl;

import exercise.demo.model.Status;
import exercise.demo.repository.IStatusRepository;
import exercise.demo.service.IStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StatusSerivceImpl implements IStatusService {
    @Autowired
    IStatusRepository iStatusRepository;

    @Override
    public List<Status> findAll() {
        return iStatusRepository.findAll();
    }

    @Override
    public Status findById(int id) {
        return null;
    }

    @Override
    public Status save(Status status) {
        return null;
    }

    @Override
    public void delete(Status status) {

    }

    @Override
    public Page<Status> findAllBlog(Pageable pageable) {
        return null;
    }

    @Override
    public Page<Status> findAllBlogByName(String name, Pageable pageable) {
        return null;
    }

    @Override
    public Page<Status> findAllBlogByEcommerceId(int id, Pageable pageable) {
        return null;
    }
}
