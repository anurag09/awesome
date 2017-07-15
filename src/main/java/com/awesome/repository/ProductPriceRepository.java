package com.awesome.repository;

import com.awesome.domain.ProductPriceByStore;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by Anurag Mishra on 20-06-2017.
 */
public interface ProductPriceRepository extends CrudRepository<ProductPriceByStore ,Long> {

    @Query("SELECT p from ProductPriceByStore p join p.stores s where s.id=:storeId")
     List<ProductPriceByStore> findById(@Param("storeId")Long storeId);

}
