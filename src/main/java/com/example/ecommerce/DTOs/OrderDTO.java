package com.example.ecommerce.DTOs;

import java.sql.Timestamp;
import java.util.List;

public class OrderDTO {
    private int orderId;
    private Timestamp orderDate;
    private double totalAmount;
    private int customerId;
    private List<OrderItemDTO> orderItems;

    public OrderDTO() {
    }

    public OrderDTO(int orderId, Timestamp orderDate, double totalAmount, int customerId, List<OrderItemDTO> orderItems) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.totalAmount = totalAmount;
        this.customerId = customerId;
        this.orderItems = orderItems;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Timestamp getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Timestamp orderDate) {
        this.orderDate = orderDate;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public List<OrderItemDTO> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItemDTO> orderItems) {
        this.orderItems = orderItems;
    }
}
