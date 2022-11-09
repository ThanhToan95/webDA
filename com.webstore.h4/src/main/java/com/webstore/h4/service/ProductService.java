package com.webstore.h4.service;

import java.util.List;

import com.webstore.h4.entity.Product;

public interface ProductService {
    
   public List<Product> findAll();
   public Product findById(String id);
   public List<Product> limit(String category_id);
}
