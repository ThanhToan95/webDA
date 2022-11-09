package com.webstore.h4.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="categories")
public class Category implements Serializable{
    @Id
    private String id;
    private String name;
    private String status;
    @JsonIgnore
    @OneToMany(mappedBy = "category")
    List<Product> product;
    
    public Category() {
       
    }

    public Category(String id, String name, String status, List<Product> product) {
        super();
        this.id = id;
        this.name = name;
        this.status = status;
        this.product = product;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Product> getProduct() {
        return product;
    }

    public void setProduct(List<Product> product) {
        this.product = product;
    }
   
    
}
