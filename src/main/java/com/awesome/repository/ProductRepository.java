package com.awesome.repository;

import com.awesome.domain.Products;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Anurag Mishra on 17-06-2017.
 */
public interface ProductRepository extends CrudRepository<Products,Long> {

}
