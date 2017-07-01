package com.awesome.service;

import com.awesome.beans.Product;
import com.awesome.beans.ProductPriceStore;
import com.awesome.domain.Categories;
import com.awesome.domain.ProductPriceByStore;
import com.awesome.domain.Products;
import com.awesome.domain.Stores;
import com.awesome.repository.ProductPriceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Anurag Mishra on 20-06-2017.
 */
@Service
public class ProductPriceService {
    @Autowired
    private ProductPriceRepository productPriceREpository;

    public void createProductPrice(ProductPriceStore productPriceByStore){

        ProductPriceByStore productPriceDomain = new ProductPriceByStore();

        productPriceDomain.setPrice(productPriceByStore.getPrice());

        Products productDomain = new Products();
        productDomain.setId(productPriceByStore.getProductId());

        Stores stores = new Stores();
        stores.setId(productPriceByStore.getStoreId());

        productPriceDomain.setProducts(productDomain);
        productPriceDomain.setStores(stores);

        productPriceREpository.save(productPriceDomain);
    }
}
