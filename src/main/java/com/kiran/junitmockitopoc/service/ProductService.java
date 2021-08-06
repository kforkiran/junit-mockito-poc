package com.kiran.junitmockitopoc.service;

import com.kiran.junitmockitopoc.dto.Product;
import com.kiran.junitmockitopoc.dto.ProductDTOS;
import com.kiran.junitmockitopoc.entities.ProductEntity;

public interface ProductService {
    ProductDTOS getProducts();
    ProductEntity saveProduct(Product product);
}
