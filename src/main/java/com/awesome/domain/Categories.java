package com.awesome.domain;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Anurag Mishra on 07-05-2017.
 */

@Entity
public class Categories {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "categories")
    private List<Products> products;

    public List<Products> getProducts() {

        return products;
    }

    public void setProducts(List<Products> products) {

        this.products = products;
    }

    public Long getId() {
        return id;
    }



    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
