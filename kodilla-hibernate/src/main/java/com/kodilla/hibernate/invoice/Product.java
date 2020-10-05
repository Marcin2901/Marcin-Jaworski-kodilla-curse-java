package com.kodilla.hibernate.invoice;


import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "PRODUCTS")
public class Product {
    private int id;
    private String name;
    private List<Item> items = new ArrayList<>();
    public Product() {
    }

    public Product(String name) {
        this.name = name;
    }


     @Id
     @NotNull
     @GeneratedValue
     @Column(name = "ID", unique = true)
     public int getId() {
        return id;
    }

     @Column(name = "NAME")
     public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setItem(List<Item> item) {
        this.items = item;
    }
       @OneToMany(
        targetEntity = Item.class,
        mappedBy = "product",
        cascade = CascadeType.ALL,
        fetch = FetchType.EAGER)
    public List<Item> getItem() {
        return items;
    }

    private void setId(int id) {
        this.id = id;
    }
}
