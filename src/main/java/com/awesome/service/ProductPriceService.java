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

import java.util.*;

/**
 * Created by Anurag Mishra on 20-06-2017.
 */
@Service
public class ProductPriceService {
    @Autowired
    private ProductPriceRepository productPriceRepository;

    public void createProductPrice(ProductPriceStore productPriceByStore){

        ProductPriceByStore productPriceDomain = new ProductPriceByStore();

        productPriceDomain.setPrice(productPriceByStore.getPrice());

        Products productDomain = new Products();
        productDomain.setId(productPriceByStore.getProductId());

        Stores stores = new Stores();
        stores.setId(productPriceByStore.getStoreId());

        productPriceDomain.setProducts(productDomain);
        productPriceDomain.setStores(stores);

        productPriceRepository.save(productPriceDomain);

    }

    public List<String> getProductDetail(Long id){
        List<ProductPriceByStore> productIds = productPriceRepository.findById(id);

        List<String> productNames = new ArrayList<>();
        for(ProductPriceByStore p : productIds){
            productNames.add(p.getProducts().getName());
        }
        return productNames;
    }

    public  Map<Long, List<Products>> getProductListByStore(){
        Iterable<ProductPriceByStore> list =  productPriceRepository.findAll();
        Iterator itr = list.iterator();
        Map<Long,List<Products>> map = new HashMap<>();
        while(itr.hasNext()){
            ProductPriceByStore productPriceByStore = (ProductPriceByStore)itr.next();
            Long store = productPriceByStore.getStores().getId();
            if(map.containsKey(store)){
                map.get(store).add(productPriceByStore.getProducts());
            }else{
                List<Products> product = new ArrayList<>();
                product.add(productPriceByStore.getProducts());
                map.put(store,product);

            }
        }return map;
    }
}
