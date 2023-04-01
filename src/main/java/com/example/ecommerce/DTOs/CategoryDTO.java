package com.example.ecommerce.DTOs;

import java.util.List;

public class CategoryDTO {
    private int categoryId;
    private String name;
    private String description;
    private List<ProductDTO> products;

    public CategoryDTO() {
    }

    public CategoryDTO(int categoryId, String name, String description, List<ProductDTO> products) {
        this.categoryId = categoryId;
        this.name = name;
        this.description = description;
        this.products = products;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<ProductDTO> getProducts() {
        return products;
    }

    public void setProducts(List<ProductDTO> products) {
        this.products = products;
    }
}
