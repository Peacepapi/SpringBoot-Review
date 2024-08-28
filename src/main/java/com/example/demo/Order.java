package com.example.demo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Order {
    @JsonProperty
    private String customerName;
    @JsonProperty
    private String productName;
    @JsonProperty
    private int quantity;

    @Override
    public String toString() {
        return "Order{" +
                "customerName='" + customerName + '\'' +
                ", productName='" + productName + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
