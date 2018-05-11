package com.awesome.controller;

import com.awesome.beans.Category;
import com.awesome.domain.Categories;
import com.awesome.repository.CategoryRepository;
import com.awesome.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Anurag Mishra on 17-02-2018.
 */
@RestController
public class CategoryUtilsController {
    @Autowired
    private CategoryService categoryService;

    @RequestMapping(value= "/cat/{id}" , method = RequestMethod.GET)
    public Category getCategory(@PathVariable Long id){
        Category category = categoryService.getCategory(id);
        return category;
    }

    @RequestMapping(value="/mycat", method = RequestMethod.POST)
    public void createCat(@RequestBody Category category){
        categoryService.createCategory(category);

    }

    @RequestMapping(value="/updateCat/{id}", method = RequestMethod.PUT)
    public void updateCategory(@PathVariable Long id, @RequestBody Category category){
        category.setId(id);
        categoryService.updateCtegory(category);
    }



}
