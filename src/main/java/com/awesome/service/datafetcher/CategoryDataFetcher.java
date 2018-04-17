package com.awesome.service.datafetcher;

import com.awesome.domain.Categories;
import com.awesome.repository.CategoryRepository;
import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CategoryDataFetcher implements DataFetcher<Categories> {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public Categories get(DataFetchingEnvironment environment) {
        Long id = environment.getArgument("id");
        return categoryRepository.findOne(id);
    }
}
