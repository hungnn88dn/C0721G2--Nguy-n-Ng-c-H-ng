package exercise.blog.service.impl;

import exercise.blog.model.Ecommerce;
import exercise.blog.repository.IEcommerceRepository;
import exercise.blog.service.IEcommerceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EcommerceRepoImpl implements IEcommerceService {


    @Autowired
    IEcommerceRepository iEcommerceService;

    @Override
    public List<Ecommerce> findAll() {
        return iEcommerceService.findAll();
    }
}
