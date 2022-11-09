package com.webstore.h4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.webstore.h4.service.CategoryService;

@Controller
public class CategoryController {
    @Autowired
    CategoryService categoryService;
    
    public String getOneCategory(String id) {          
             
        return null;
        
    }
    
}
