package com.example.demo.service;


import com.example.demo.model.Ecommerce;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IEcommerceService {

    public List<Ecommerce> findAll();
}
