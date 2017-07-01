package com.awesome.repository;

import com.awesome.domain.ProductPriceByStore;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Anurag Mishra on 20-06-2017.
 */
public interface ProductPriceRepository extends CrudRepository<ProductPriceByStore,Long> {
}
