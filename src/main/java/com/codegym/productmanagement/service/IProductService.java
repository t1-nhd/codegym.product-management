package com.codegym.productmanagement.service;

import com.codegym.productmanagement.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> getAllProducts();
    Product getProductById(int id);
    void save(Product product);
    void update(Product product);
    void delete(int id);
}
