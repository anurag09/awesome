package com.awesome.controller;

import com.awesome.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.awesome.beans.Category;

import java.util.List;

/**
 * Created by Anurag Mishra on 07-05-2017.
 */

@Controller
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @RequestMapping(value = "/category" , method = RequestMethod.GET)
    public String category(){
        return "category";
    }

    @RequestMapping(value = "/category" , method = RequestMethod.POST)
    @ResponseBody
    public void createCategory(@RequestBody Category category){

        categoryService.createCategory(category);
    }

    @RequestMapping(value = "/category/{id}" , method = RequestMethod.GET)
    @ResponseBody
    public Category getCategory(@PathVariable Long id){
        Category category = categoryService.getCategory(id);
        return category;
    }

    @RequestMapping(value = "/category/{id}" , method = RequestMethod.DELETE)
    @ResponseBody
    public void deleteCategory(@PathVariable Long id){
        categoryService.deleteCategory(id);
        System.out.println("Category is deleted......");
    }

    @RequestMapping(value = "/categories", method = RequestMethod.GET)
    @ResponseBody
    public List<Category> getAllCategories(){
        return categoryService.getCategories();
    }
}
