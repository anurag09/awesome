package com.awesome.repository;

import com.awesome.domain.Categories;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Anurag Mishra on 07-05-2017.
 */
public interface CategoryRepository extends CrudRepository<Categories , Long> {
}
