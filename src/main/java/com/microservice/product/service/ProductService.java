package com.microservice.product.service;

import com.microservice.product.entity.Product;

import java.util.List;

public interface ProductService {
    void addProduct(Product product);
    List<Product> getAllProducts();
}
