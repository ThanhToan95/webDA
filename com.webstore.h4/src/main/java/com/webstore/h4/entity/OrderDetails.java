package com.webstore.h4.entity;

import java.io.Serializable;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="order_details")
public class OrderDetails implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Float price;
    private Integer quanlity;
    private Boolean cod;
    private Boolean bank_transfer;
    private Boolean status;
    @ManyToOne
    @JoinColumn(name="username")
    private Account account;
    @ManyToOne
    @JoinColumn(name="product_id")
    private Product product;
    @ManyToOne
    @JoinColumn(name="order_id")
    private Order order;
    
    public OrderDetails() {
       
    }

    public OrderDetails(Long id, Float price, Integer quanlity, Boolean cod, Boolean bank_transfer, Boolean status,
            Account account, Product product, Order order) {
        super();
        this.id = id;
        this.price = price;
        this.quanlity = quanlity;
        this.cod = cod;
        this.bank_transfer = bank_transfer;
        this.status = status;
        this.account = account;
        this.product = product;
        this.order = order;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getQuanlity() {
        return quanlity;
    }

    public void setQuanlity(Integer quanlity) {
        this.quanlity = quanlity;
    }

    public Boolean getCod() {
        return cod;
    }

    public void setCod(Boolean cod) {
        this.cod = cod;
    }

    public Boolean getBank_transfer() {
        return bank_transfer;
    }

    public void setBank_transfer(Boolean bank_transfer) {
        this.bank_transfer = bank_transfer;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
    
    
    
}
