package com.webstore.h4.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.webstore.h4.entity.Product;
import com.webstore.h4.repositoty.ProductRepository;
import com.webstore.h4.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
    
   @Autowired
   ProductRepository productRepository;

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Product findById(String id) {
        return productRepository.findById(id).get();
    }

    @Override
    public List<Product> limit(String category_id) {      
        return productRepository.findLimit(category_id);
    }

    
    
}
