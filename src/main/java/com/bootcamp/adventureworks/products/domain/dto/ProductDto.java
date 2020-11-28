package com.bootcamp.adventureworks.products.domain.dto;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProductDto {
    private Integer productID;
    private String name;
    private String color;
}
