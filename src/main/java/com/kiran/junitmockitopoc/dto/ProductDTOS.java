package com.kiran.junitmockitopoc.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
@AllArgsConstructor
public class ProductDTOS {
    private List<Product> products;
}
