package com.awesome.domain;

import javax.persistence.*;

/**
 * Created by Anurag Mishra on 14-04-2017.
 */
@Entity
public class Stores {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

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
