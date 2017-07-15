package com.awesome.service;

import com.awesome.beans.Product;
import com.awesome.domain.Categories;
import com.awesome.domain.Products;
import com.awesome.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Anurag Mishra on 17-06-2017.
 */
@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public void createProduct(Product product) {
        Products product1 = new Products();
        Categories categories = new Categories();
        product1.setId(product.getId());
        product1.setName(product.getName());
        categories.setId(product.getCategoryId());
        product1.setCategories(categories);
        productRepository.save(product1);
    }

    public Product getProduct(Long id) {
        Products products = productRepository.findOne(id);
        Product product = new Product();
        product.setId(products.getId());
        product.setName(products.getName());
        return product;
    }

    public List<Product> getAllProducts(){
        Iterable<Products> products = productRepository.findAll();
        List<Product> productBean = new ArrayList<>();
        products.forEach(p -> productBean.add(new Product(p.getId(), p.getName(), p.getCategories().getName())));
        return productBean;
    }

}
