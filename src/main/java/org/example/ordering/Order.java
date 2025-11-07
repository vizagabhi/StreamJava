package org.example.ordering;

import java.time.LocalDateTime;
import java.util.List;

public class Order {

    private long id;

    private String name;

    private LocalDateTime dateTime;

    private List<OrderDetails> orderDetails;

    private double totalPrice;

    public Order(long id, String name, LocalDateTime dateTime, List<OrderDetails> orderDetails) {
        this.id = id;
        this.name = name;
        this.dateTime = dateTime;
        this.orderDetails = orderDetails;
    }

    public Order() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public List<OrderDetails> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<OrderDetails> orderDetails) {
        this.orderDetails = orderDetails;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateTime=" + dateTime +
                ", orderDetails=" + orderDetails +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
