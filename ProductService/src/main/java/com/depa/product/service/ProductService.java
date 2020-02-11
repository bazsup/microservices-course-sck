/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.depa.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

/**
 *
 * @author Test
 */
@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public ResponseEntity getAllProduct() {
        return ResponseEntity.status(HttpStatus.OK).body(productRepository.findAll());
    }

    public ResponseEntity findByProductId(int productId) {
        return ResponseEntity.ok().body(productRepository.findById(productId));
    }
}
