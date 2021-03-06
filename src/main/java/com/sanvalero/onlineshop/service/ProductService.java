package com.sanvalero.onlineshop.service;

import com.sanvalero.onlineshop.domain.Product;

import java.util.Set;

public interface ProductService {

    Set<Product> findAllProducts();
    Set<Product> findAllProducts(String category);
    void increasePrice(Product product);
}
