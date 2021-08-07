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

/**
 * @author kiran
 */
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
        ProductEntity productEntity = new ProductEntity(productId, "Pen", Category.EDUCATION);
        Product product = productAdapter.toProductDTO(productEntity);
        assertNotNull(product);
        assertEquals(productId, product.getId());
        assertEquals(Category.EDUCATION, product.getCategory());
        assertEquals("Pen", product.getName());
    }

    @Test
    @DisplayName("Product to ProductEntity Conversion")
    void toProductEntity() {
        final UUID productId = UUID.randomUUID();
        Product product = new Product(productId, "Pen", Category.EDUCATION);
        ProductEntity productEntity = productAdapter.toProductEntity(product);
        assertNotNull(productEntity);
        assertEquals(productId, productEntity.getId());
        assertEquals("Pen", productEntity.getName());
        assertEquals(Category.EDUCATION, productEntity.getCategory());
    }
}