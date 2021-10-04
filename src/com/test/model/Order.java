/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.model;

/**
 *
 * @author Ahsan
 */
public class Order {
    
    private Integer id;
    private Double totalAmount;
    Customer customer;

    public Order(Integer id, Double totalAmount, Customer customer) {
        this.id = id;
        this.totalAmount = totalAmount;
        this.customer = customer;
    }
    
    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    
}
