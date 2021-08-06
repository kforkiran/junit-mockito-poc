package com.kiran.junitmockitopoc.service;

import com.kiran.junitmockitopoc.adapter.ProductAdapter;
import com.kiran.junitmockitopoc.dto.Product;
import com.kiran.junitmockitopoc.dto.ProductDTOS;
import com.kiran.junitmockitopoc.entities.ProductEntity;
import com.kiran.junitmockitopoc.enums.Category;
import com.kiran.junitmockitopoc.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.kiran.junitmockitopoc.enums.Category.*;

@AllArgsConstructor
@Service
public class ProductServiceImpl implements ProductService {

    private ProductAdapter productAdapter;

    private ProductRepository productRepository;

    @Override
    public ProductDTOS getProducts() {
        List<Product> products = productRepository.findAll().stream()
                .map(productAdapter::toProductDTO)
                .filter(product -> CLOTHING.equals(product.getCategory()))
                .toList();
        return new ProductDTOS(products);
    }

    @Override
    public ProductEntity saveProduct(Product product) {
        return productRepository.save(productAdapter.toProductEntity(product));
    }

}
