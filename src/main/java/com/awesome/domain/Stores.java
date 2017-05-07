package com.awesome.domain;

import javax.persistence.*;

/**
 * Created by Anurag Mishra on 14-04-2017.
 */
@Entity
public class Stores {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
