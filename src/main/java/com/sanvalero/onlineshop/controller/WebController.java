package com.sanvalero.onlineshop.controller;

import com.sanvalero.onlineshop.domain.Product;
import com.sanvalero.onlineshop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Set;

@Controller
public class WebController {

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/")
    public String index(Model model){
        return "index";
    }

    @RequestMapping(value = "/catalog")
    public String catalog(Model model){
        Set<Product> products = productService.findAllProducts();
        model.addAttribute("products", products);
        return "catalog";
    }
}
