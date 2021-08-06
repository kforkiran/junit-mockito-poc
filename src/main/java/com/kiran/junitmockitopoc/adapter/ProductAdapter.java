package com.kiran.junitmockitopoc.adapter;

import com.kiran.junitmockitopoc.dto.Product;
import com.kiran.junitmockitopoc.entities.ProductEntity;
import org.springframework.stereotype.Component;

@Component
public class ProductAdapter {
    public Product toProductDTO(ProductEntity productEntity) {
        return new Product(productEntity.getId(), productEntity.getName(), productEntity.getCategory());
    }

    public ProductEntity toProductEntity(Product product) {
        return new ProductEntity(product.getId(), product.getName(), product.getCategory());
    }
}
