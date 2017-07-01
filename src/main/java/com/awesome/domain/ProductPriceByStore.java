package com.awesome.domain;

import com.awesome.domain.Products;
import com.awesome.domain.Stores;

import javax.persistence.*;

/**
 * Created by Anurag Mishra on 17-06-2017.
 */
@Entity
public class ProductPriceByStore {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "store_id")
    private Stores stores;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Products products;

    private Float price;

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Stores getStores() {
        return stores;
    }

    public void setStores(Stores stores) {
        this.stores = stores;
    }

    public Products getProducts() {
        return products;
    }

    public void setProducts(Products products) {
        this.products = products;
    }


}
