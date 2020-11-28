package com.bootcamp.adventureworks.products.domain.services;

import com.bootcamp.adventureworks.products.domain.dto.ProductDto;

import java.util.List;

public interface ProductService {
    ProductDto findById(Integer id);
    List<ProductDto> findAll();
}
