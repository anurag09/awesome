package com.awesome.controller;

import com.awesome.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.awesome.beans.Category;
/**
 * Created by Anurag Mishra on 07-05-2017.
 */

@RestController
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @RequestMapping(value = "/category" , method = RequestMethod.POST)
    @ResponseBody
    public void createCategory(@RequestBody Category category){
        categoryService.createCategory(category);
    }
    @RequestMapping(value = "/category/{id}" , method = RequestMethod.GET)
    public Category getCategory(@PathVariable Long id){
        Category category = categoryService.getCategory(id);
        return category;
    }
}
