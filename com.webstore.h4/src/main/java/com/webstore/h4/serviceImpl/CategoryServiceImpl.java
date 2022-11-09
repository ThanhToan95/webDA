package com.webstore.h4.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webstore.h4.repositoty.CategoryRepository;
import com.webstore.h4.service.CategoryService;
@Service
public class CategoryServiceImpl implements CategoryService {
   
    @Autowired
    CategoryRepository categoryRepository;

 
    
    
    
    

}
