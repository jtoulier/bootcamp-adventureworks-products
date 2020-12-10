package com.bootcamp.adventureworks.products.persistence.repositories;

import com.bootcamp.adventureworks.products.domain.dto.CategoryDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("ADVENTURE-WORKS-CATEGORIES")
public interface CategoryRepository {

    @GetMapping("categories/{id}")
    CategoryDto findById(@PathVariable("id") Integer id);

}

