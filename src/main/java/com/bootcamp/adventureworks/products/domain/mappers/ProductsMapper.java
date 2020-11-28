package com.bootcamp.adventureworks.products.domain.mappers;


import com.bootcamp.adventureworks.products.domain.dto.ProductDto;
import com.bootcamp.adventureworks.products.persistence.entities.Product;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductsMapper {
    ProductDto toProductDto(Product entity);
    List<ProductDto> toProductsDto(List<Product> entities);
}
