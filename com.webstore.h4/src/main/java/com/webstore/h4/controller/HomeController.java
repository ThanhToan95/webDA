package com.webstore.h4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/product/detail")
    public String detail() {
        return "product/detail";
    }
    @GetMapping("/product/list")
    public String list() {
        return "product/list";
    }
}
