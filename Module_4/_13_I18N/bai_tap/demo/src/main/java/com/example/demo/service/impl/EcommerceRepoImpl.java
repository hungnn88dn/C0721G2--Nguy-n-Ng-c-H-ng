package com.example.demo.service.impl;


import com.example.demo.model.Ecommerce;
import com.example.demo.repository.IEcommerceRepository;
import com.example.demo.service.IEcommerceService;
import org.springframework.beans.factory.annotation.Autowired;
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
