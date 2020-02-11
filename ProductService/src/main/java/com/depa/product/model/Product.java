/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.depa.product.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Test
 */
@Entity
public class Product {
    @Id
    private int id;
    
    private String productName;
    
    private String productDescription;
    
//    private String productImgUrl;
    
    private double price;
    
    @OneToMany
    private List<ProductImage> productImageList; 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

//    public String getProductImgUrl() {
//        return productImgUrl;
//    }

//    public void setProductImgUrl(String productImgUrl) {
//        this.productImgUrl = productImgUrl;
//    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<ProductImage> getProductImageList() {
        return productImageList;
    }

    public void setProductImageList(List<ProductImage> productImageList) {
        this.productImageList = productImageList;
    }

//    

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", productName=" + productName + ", productDescription=" + productDescription + ", price=" + price + ", productImageList=" + productImageList + '}';
    }
    
    
}
