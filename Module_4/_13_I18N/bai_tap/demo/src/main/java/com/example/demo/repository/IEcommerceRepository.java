package com.example.demo.repository;


import com.example.demo.model.Ecommerce;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEcommerceRepository extends JpaRepository<Ecommerce, Integer> {
}
