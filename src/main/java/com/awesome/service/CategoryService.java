package com.awesome.service;

import com.awesome.beans.Category;
import com.awesome.domain.Categories;
import com.awesome.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Anurag Mishra on 07-05-2017.
 */

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public void createCategory(Category category){
        Categories category1 = new Categories();
        category1.setId(category.getId());
        category1.setName(category.getName());
        categoryRepository.save(category1);
    }

    public Category getCategory(Long id){
        Categories categories = categoryRepository.findOne(id);
        Category category = new Category();
        category.setId(categories.getId());
        category.setName(categories.getName());
        return category;

    }

    public void updateCtegory(Category category){
        Categories categories = new Categories();
        categories.setName("Cosmetic");
        categories.setId((long) 1);

        categoryRepository.save(categories);

    }
}
