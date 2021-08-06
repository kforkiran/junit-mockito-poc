package com.kiran.junitmockitopoc.adapter;

import com.kiran.junitmockitopoc.dto.Product;
import com.kiran.junitmockitopoc.entities.ProductEntity;
import com.kiran.junitmockitopoc.enums.Category;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class ProductAdapterTest {
    private ProductAdapter productAdapter;

    @BeforeEach
    void setUp() {
        productAdapter = new ProductAdapter();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("ProductEntity to ProductDTO Conversion")
    void toProductDTO() {
        final UUID productId = UUID.randomUUID();
        ProductEntity productEntity = new ProductEntity(productId, "Pen", Category.CLOTHING);
        Product product = productAdapter.toProductDTO(productEntity);
        assertNotNull(product);
        assertEquals(product.getId(), productEntity.getId());
    }

    @Test
    void toProductEntity() {
    }
}