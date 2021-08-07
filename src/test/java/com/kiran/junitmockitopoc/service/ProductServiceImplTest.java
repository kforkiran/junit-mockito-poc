package com.kiran.junitmockitopoc.service;

import com.kiran.junitmockitopoc.adapter.ProductAdapter;
import com.kiran.junitmockitopoc.dto.Product;
import com.kiran.junitmockitopoc.entities.ProductEntity;
import com.kiran.junitmockitopoc.enums.Category;
import com.kiran.junitmockitopoc.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(MockitoExtension.class)
class ProductServiceImplTest {

    @InjectMocks
    private ProductServiceImpl productService;

    @Mock
    private ProductAdapter productAdapter;

    @Mock
    private ProductRepository productRepository;

    @Test
    void testSaveProduct() {
        final UUID productId = UUID.randomUUID();
        Product product = new Product();
        product.setName("Pen");
        product.setCategory(Category.EDUCATION);
        ProductEntity productEntity = new ProductEntity(productId, "Pen", Category.EDUCATION);
        Mockito.when(productAdapter.toProductEntity(product)).thenReturn(productEntity);
        Mockito.when(productRepository.save(productEntity)).thenReturn(productEntity);
        ProductEntity response = productService.saveProduct(product);
        assertNotNull(response);
        assertEquals(product.getName(), response.getName());
        assertEquals(product.getCategory(), response.getCategory());
        assertEquals(productId, response.getId());
    }
}