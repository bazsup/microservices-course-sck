/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.depa.product.controller;

import com.depa.product.model.Product;
import com.depa.product.response.ProductResponse;
import com.depa.product.service.ProductService;
import io.micrometer.core.ipc.http.HttpSender;
import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Test
 */
@RestController 
public class ProductController {
    @Autowired
    private ProductService productService;
    
    @GetMapping("/products")
    public ResponseEntity getAllProduct() {
        return productService.getAllProduct();
    }
    @GetMapping("/product/{productId}")
    public ResponseEntity findByProductId(@PathVariable String productId){
        int parsedProductId = Integer.parseInt(productId);
        return productService.findByProductId(parsedProductId);
    }
    @PostMapping("/product")
    public ResponseEntity createProduct(@RequestBody Product product){
        return productService.createProduct(product);
    }
}
