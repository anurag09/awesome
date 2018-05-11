package com.awesome.controller;

import com.awesome.beans.Product;
import com.awesome.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/product" , method = RequestMethod.GET)
    public String productHomePage(){
        List<Integer> ar = new ArrayList<>();
        Object[] a = ar.toArray();
        return "dashboard";
    }

    @RequestMapping(value = "/product" , method = RequestMethod.POST)
    @ResponseBody
    public void createProduct(@RequestBody Product product){productService.createProduct(product);

    }

    @RequestMapping(value = "/prod" , method = RequestMethod.POST)
    @ResponseBody
    public void insertProduct(@RequestBody Product product){
        productService.insertProductbyid(product);
    }

    @RequestMapping(value="/update/{id}/{category_id}", method = RequestMethod.POST)
    @ResponseBody
    public void updatecategory(@PathVariable Long id, @PathVariable Long category_id){
        Product product =  new Product();
        product.setId(id);
        product.setCategoryId(category_id);
        productService.updateProductCategory(product);
    }

//    @RequestMapping(value = "/product/{id}" , method = RequestMethod.GET)
//    @ResponseBody
//    public Product getProduct(@PathVariable Long id){
//        Product product = productService.getProduct(id);
//        return product;
//    }

    @RequestMapping(value = "/product/{id}" , method = RequestMethod.GET)
    @ResponseBody
    public Product getProduct(@PathVariable Long id){
        Product product = productService.getProductByItsId(id);
        return product;
    }

//    @RequestMapping(value = "/products" , method = RequestMethod.GET)
//    @ResponseBody
//    public List<Product> getAllProducts(){
//        return productService.getAllProducts();
//    }

    @RequestMapping(value = "/products" , method = RequestMethod.GET)
    @ResponseBody
    public List<Product> getAllProductBYId(){
        return productService.getAllProductsBYJDBC();
    }


}
