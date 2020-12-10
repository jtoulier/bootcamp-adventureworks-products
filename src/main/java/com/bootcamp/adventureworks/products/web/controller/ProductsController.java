package com.bootcamp.adventureworks.products.web.controller;

import com.bootcamp.adventureworks.products.domain.dto.CategoryDto;
import com.bootcamp.adventureworks.products.domain.dto.ProductDto;
import com.bootcamp.adventureworks.products.domain.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@EnableDiscoveryClient
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


    @GetMapping("/{id}/category")
    ResponseEntity<CategoryDto> getProductCategory(@PathVariable("id") Integer id) {
        return new ResponseEntity<>(this.productService.getProductCategory(id), HttpStatus.OK);
    }

}
