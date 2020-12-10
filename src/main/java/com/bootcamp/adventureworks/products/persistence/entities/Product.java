package com.bootcamp.adventureworks.products.persistence.entities;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Product", schema = "SalesLT")
@Getter
public class Product {
    @Id
    @Column(name = "ProductID")
    private Integer productID;

    @Column(name = "Name")
    private String name;

    @Column(name = "Color")
    private String color;

    @Column(name = "ProductCategoryID")
    private Integer categoryId;
}
