package com.kiran.junitmockitopoc.controller;

import com.kiran.junitmockitopoc.dto.Product;
import com.kiran.junitmockitopoc.dto.ProductDTOS;
import com.kiran.junitmockitopoc.entities.ProductEntity;
import com.kiran.junitmockitopoc.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class ProductController {

    private final ProductService productService;

    @GetMapping("/products")
    public ResponseEntity<ProductDTOS> getProducts() {
        return ResponseEntity.ok().body(productService.getProducts());
    }

    @PostMapping("/products")
    public ResponseEntity<ProductEntity> addProduct(@RequestBody Product product) {
        return ResponseEntity.ok().body(productService.saveProduct(product));
    }
}