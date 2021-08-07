package com.kiran.junitmockitopoc.dto;

import com.kiran.junitmockitopoc.enums.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Product {
    private UUID id;
    private String name;
    private Category category;
}

