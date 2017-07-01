package com.awesome.controller;

import com.awesome.beans.Product;
import com.awesome.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Anurag Mishra on 17-06-2017.
 */

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/product" , method = RequestMethod.POST)
    @ResponseBody
    public void creteProduct(@RequestBody Product product){productService.createProduct(product);

    }

    @RequestMapping(value = "/product/{id}" , method = RequestMethod.GET)
    public Product getProduct(@PathVariable Long id){
        Product product = productService.getProduct(id);
        return product;
    }

}
