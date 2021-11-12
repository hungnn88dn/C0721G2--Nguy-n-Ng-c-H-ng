package service;

import bean.Product;

import java.util.List;

public interface IProductService {
    List<Product> showAll();

    void create(Product product);

    void update(int id, Product product);

    void remove(int id);

    Product findById(int id);

    Product findByName(String name);




}
