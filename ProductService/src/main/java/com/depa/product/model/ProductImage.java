/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.depa.product.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Test
 */
@Entity
public class ProductImage {
    
    @Id
    private int id;
    
    private String url;
    
    private String alt;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }

    @Override
    public String toString() {
        return "ProductImage{" + "id=" + id + ", url=" + url + ", alt=" + alt + '}';
    }
    
}
