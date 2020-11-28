package com.bootcamp.adventureworks.products.web.controller;

import com.bootcamp.adventureworks.products.domain.dto.ProductDto;
import com.bootcamp.adventureworks.products.domain.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("products")
public class ProductsController {
    @Autowired
    private ProductService productService;

    @GetMapping("")
    List<ProductDto> findAll() {
        return this.productService.findAll();
    }

    @GetMapping("/{id}")
    ProductDto findById(@PathVariable("id") Integer id) {
        return this.productService.findById(id);
    }
}
