package exercise.blog.service;

import exercise.blog.model.Ecommerce;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IEcommerceService {

    public List<Ecommerce> findAll();
}
