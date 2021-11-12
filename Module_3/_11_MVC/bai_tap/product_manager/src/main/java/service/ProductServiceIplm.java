package service;

import bean.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceIplm implements IProductService {

    private static Map<Integer, Product> products;

    static {
        products = new HashMap<>();
        products.put(1, new Product(1, "Iphone6", 1000, "Grey","Apple"));
        products.put(2, new Product(2, "Iphone7", 1500, "Black","Apple"));
        products.put(3, new Product(3, "Xiaomi8", 1200, "Pink","Xiaomi"));
        products.put(4, new Product(4, "PassPort", 2000, "Black","BlackBerry"));
        products.put(5, new Product(5, "Note9", 1700, "Blue","Samsung"));
        products.put(6, new Product(6, "Q10", 800, "White","BlackBerry"));
    }


    @Override
    public List<Product> showAll() {
        return  new ArrayList<>(products.values());
    }

    @Override
    public void create(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id, product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public Product findByName(String name) {
      return null;
    }
}
