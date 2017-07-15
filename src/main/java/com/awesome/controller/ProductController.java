package com.awesome.controller;

import com.awesome.beans.Product;
import com.awesome.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/product" , method = RequestMethod.GET)
    public String productHomePage(){
        return "product";
    }

    @RequestMapping(value = "/product" , method = RequestMethod.POST)
    @ResponseBody
    public void createProduct(@RequestBody Product product){productService.createProduct(product);

    }

    @RequestMapping(value = "/product/{id}" , method = RequestMethod.GET)
    public Product getProduct(@PathVariable Long id){
        Product product = productService.getProduct(id);
        return product;
    }

    @RequestMapping(value = "/products" , method = RequestMethod.GET)
    @ResponseBody
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

}
