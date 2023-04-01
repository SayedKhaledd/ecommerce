package com.example.ecommerce.DTOs;

public class OrderItemDTO {

    private int orderItemId;
    private int quantity;
    private double price;
    private int productId;
    private int orderId;

    public OrderItemDTO() {
    }

    public OrderItemDTO(int orderItemId, int quantity, double price, int productId, int orderId) {
        this.orderItemId = orderItemId;
        this.quantity = quantity;
        this.price = price;
        this.productId = productId;
        this.orderId = orderId;
    }

    public int getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(int orderItemId) {
        this.orderItemId = orderItemId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
}
