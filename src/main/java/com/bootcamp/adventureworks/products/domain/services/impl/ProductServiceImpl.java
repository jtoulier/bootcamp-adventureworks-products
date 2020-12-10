package com.bootcamp.adventureworks.products.domain.services.impl;

import com.bootcamp.adventureworks.products.domain.dto.CategoryDto;
import com.bootcamp.adventureworks.products.domain.dto.ProductDto;
import com.bootcamp.adventureworks.products.domain.mappers.ProductsMapper;
import com.bootcamp.adventureworks.products.domain.services.ProductService;
import com.bootcamp.adventureworks.products.persistence.repositories.CategoryRepository;
import com.bootcamp.adventureworks.products.persistence.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductsMapper productsMapper;

    @Override
    public ProductDto findById(Integer id) {
        var product = this.productRepository.findById(id).get();
        return  this.productsMapper.toProductDto(product);
    }

    @Override
    public List<ProductDto> findAll() {
        var products = this.productRepository.findAll();
        return this.productsMapper.toProductsDto(products);
    }

    @Override
    public CategoryDto getProductCategory(Integer id) {
        var product = this.productRepository.findById(id).get();
        return this.categoryRepository.findById(product.getCategoryId());
    }

}
