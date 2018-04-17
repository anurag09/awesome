package com.awesome.service.datafetcher;

import com.awesome.domain.Categories;
import com.awesome.repository.CategoryRepository;
import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AllCategoryDataFetcher implements DataFetcher<List<Categories>> {

    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public List<Categories> get(DataFetchingEnvironment environment) {
        return (List<Categories>) categoryRepository.findAll();
    }
}
