package com.webstore.h4.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="products")
public class Product implements Serializable{
    @Id
    private String id;
    private String name;
    private String image;
    private Boolean availiable;
    private Date createDate;
    private Integer discount;
    private Float price;
    private String manufaturer;
    private String description;
    @ManyToOne
    @JoinColumn(name="category_id")
    private Category category;
    @JsonIgnore
    @OneToMany(mappedBy = "product")
    List<OrderDetails> order_details;
    @JsonIgnore
    @OneToMany(mappedBy = "product")
    List<Favorite> favorite;
    @JsonIgnore
    @OneToMany(mappedBy = "product")
    List<Warranty> warranty;
    
    public Product() {
        
    }
    public Product(String id, String name, String image, Boolean availiable, Date createDate, Integer discount,
            Float price, String manufaturer, String description, Category category, List<OrderDetails> order_details,
            List<Favorite> favorite, List<Warranty> warranty) {
        super();
        this.id = id;
        this.name = name;
        this.image = image;
        this.availiable = availiable;
        this.createDate = createDate;
        this.discount = discount;
        this.price = price;
        this.manufaturer = manufaturer;
        this.description = description;
        this.category = category;
        this.order_details = order_details;
        this.favorite = favorite;
        this.warranty = warranty;
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Boolean getAvailiable() {
        return availiable;
    }

    public void setAvailiable(Boolean availiable) {
        this.availiable = availiable;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getManufaturer() {
        return manufaturer;
    }

    public void setManufaturer(String manufaturer) {
        this.manufaturer = manufaturer;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<OrderDetails> getOrder_details() {
        return order_details;
    }

    public void setOrder_details(List<OrderDetails> order_details) {
        this.order_details = order_details;
    }

    public List<Favorite> getFavorite() {
        return favorite;
    }

    public void setFavorite(List<Favorite> favorite) {
        this.favorite = favorite;
    }

    public List<Warranty> getWarranty() {
        return warranty;
    }

    public void setWarranty(List<Warranty> warranty) {
        this.warranty = warranty;
    }
    
    
    
}
