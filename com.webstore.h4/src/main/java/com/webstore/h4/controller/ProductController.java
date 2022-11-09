package com.webstore.h4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.webstore.h4.entity.Product;
import com.webstore.h4.service.ProductService;

@Controller
public class ProductController {
    @Autowired
    ProductService productService;
    
    @RequestMapping("/home/home")
    public String list(Model model) {
        List<Product> list = productService.findAll();
        List<Product> limitDT = productService.limit("001");
        List<Product> limitLT = productService.limit("002");
        List<Product> limitDH = productService.limit("006");
        model.addAttribute("limitDT",limitDT);
        model.addAttribute("limitLT",limitLT);
        model.addAttribute("limitDH",limitDH);
        model.addAttribute("items",list);
        return "home/home";
    }
    @RequestMapping("/product/detail/{id}")
    public String detail(Model model, @PathVariable("id") String id) {
        Product item= productService.findById(id);     
        model.addAttribute("item",item);
        return "product/detail";
    }
    
}
