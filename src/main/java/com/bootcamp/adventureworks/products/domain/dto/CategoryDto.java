package com.bootcamp.adventureworks.products.domain.dto;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CategoryDto {
    private Integer id;
    private String name;
}

