package com.codegym.productmanagement.service;

import com.codegym.productmanagement.model.Product;

import java.util.*;

public class ProductService implements IProductService {
    private static Map<Integer, Product> products;
    static {
        products = new HashMap<>();
        products.put(0, new Product(0, "iPhone 16 Pro Max", 46000000, "iPhone", "Apple Inc."));
        products.put(1, new Product(1, "iPhone 16 Pro", 40000000, "iPhone", "Apple Inc."));
        products.put(2, new Product(2, "iPhone 16 Plus", 36000000, "iPhone", "Apple Inc."));
        products.put(3, new Product(3, "iPhone 16", 30000000, "iPhone", "Apple Inc."));
        products.put(4, new Product(4, "iPhone 15 Pro Max", 36000000, "iPhone", "Apple Inc."));
        products.put(5, new Product(5, "iPhone 14 Pro Max", 26000000, "iPhone", "Apple Inc."));
        products.put(6, new Product(6, "iPhone 13 Pro Max", 20000000, "iPhone", "Apple Inc."));
    }

    @Override
    public List<Product> getAllProducts() {
        return new ArrayList<>(products.values());
    }

    @Override
    public Product getProductById(int id) {
        return products.get(id);
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public void update(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public void delete(int id) {
        products.remove(id);
    }
}
