package com.example.ecommerce.DTOs;

import java.math.BigDecimal;
import java.util.List;

public class ProductDTO {
    private int productId;
    private String name;
    private String description;
    private double price;
    private String image;
    private int categoryId;
    private List<OrderItemDTO> orderItems;

    public ProductDTO() {
    }

    public ProductDTO(int productId, String name, String description, double price, String image, int categoryId) {
        this.productId = productId;
        this.name = name;
        this.description = description;
        this.price = price;
        this.image = image;
        this.categoryId = categoryId;
    }

    public int getProductId() {
        return productId;
    }

    public List<OrderItemDTO> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItemDTO> orderItems) {
        this.orderItems = orderItems;
    }

    public void setProductId(int productId) {
        this.productId = productId;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public String toString() {
        return "ProductDTO{" +
                "productId=" + productId +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", image='" + image + '\'' +
                ", categoryId=" + categoryId +
                ", orderItems=" + orderItems +
                '}';
    }
}
