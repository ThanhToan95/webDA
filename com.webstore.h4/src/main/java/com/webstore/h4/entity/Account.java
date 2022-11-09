package com.webstore.h4.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="accounts")
public class Account implements Serializable{
	@Id
	private String username;
	private String password;
	private String fullname;
	private String email;
	private Integer phone;
	@Column(name="reset_password_token")
	private String resetPasswordToken;
	@JsonIgnore
	@OneToMany(mappedBy = "account",fetch = FetchType.EAGER)
	List<Authority> auth;
	@JsonIgnore
    @OneToMany(mappedBy = "account")
    List<OrderDetails> order_details;
	@JsonIgnore
    @OneToMany(mappedBy = "account")
    List<Order> order;
	@JsonIgnore
    @OneToMany(mappedBy = "account")
    List<Favorite> favorite;
	@JsonIgnore
    @OneToMany(mappedBy = "account")
    List<Warranty> warranty;
	
	public Account() {
		
	}

    public Account(String username, String password, String fullname, String email, Integer phone,
            String resetPasswordToken, List<Authority> auth, List<OrderDetails> order_details, List<Order> order,
            List<Favorite> favorite, List<Warranty> warranty) {
        super();
        this.username = username;
        this.password = password;
        this.fullname = fullname;
        this.email = email;
        this.phone = phone;
        this.resetPasswordToken = resetPasswordToken;
        this.auth = auth;
        this.order_details = order_details;
        this.order = order;
        this.favorite = favorite;
        this.warranty = warranty;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getResetPasswordToken() {
        return resetPasswordToken;
    }

    public void setResetPasswordToken(String resetPasswordToken) {
        this.resetPasswordToken = resetPasswordToken;
    }

    public List<Authority> getAuth() {
        return auth;
    }

    public void setAuth(List<Authority> auth) {
        this.auth = auth;
    }

    public List<OrderDetails> getOrder_details() {
        return order_details;
    }

    public void setOrder_details(List<OrderDetails> order_details) {
        this.order_details = order_details;
    }

    public List<Order> getOrder() {
        return order;
    }

    public void setOrder(List<Order> order) {
        this.order = order;
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
