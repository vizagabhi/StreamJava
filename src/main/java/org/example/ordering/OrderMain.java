package org.example.ordering;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

public class OrderMain {
    public static void main(String[] args) {

//        List<OrderDetails> details = new ArrayList<>();
//        details.add(new OrderDetails(1, "IT001", "Laptop", 2, 60000));
//        details.add(new OrderDetails(2, "IT002", "Mouse", 0, 500));
//        details.add(new OrderDetails(3, "IT003", "Keyboard", 1, 1500));
//        details.add(new OrderDetails(4, "IT004", "Monitor", 0, 10000));
//
//        Order order = new Order(101, "Abhishek's Order", LocalDateTime.now(), details, 0);
        //Using Stream API remove the orderDetail which has itemQuantity as zero

//        System.out.println("Before removing zero-quantity items:");
//        System.out.println(order);

//        order.getOrderDetails().removeIf(od -> od.getItemQuantity() == 0);
//          OOOOOORRRRRRRRRRR
//        order.setOrderDetails(
//                order.getOrderDetails()
//                        .stream()
//                        .filter(od -> od.getItemQuantity() > 0)   // keep only items where qty > 0
//                        .collect(Collectors.toList())             // collect into new list
//        );
//        System.out.println("\nAfter removing zero-quantity items:");
//        System.out.println(order);

        //=========================================================================================================

        // Q.2) Remove ZeroQuant item, calculate total price and create map of orderId - totalprice.

        List<OrderDetails> d1 = Arrays.asList(
                new OrderDetails(1, "LAP", "Laptop", 2, 60000),
                new OrderDetails(2, "MOU", "Mouse", 0, 500),
                new OrderDetails(3, "KEY", "Keyboard", 1, 1500)
        );

        List<OrderDetails> d2 = Arrays.asList(
                new OrderDetails(4, "TV", "Television", 1, 40000),
                new OrderDetails(5, "CAB", "Cable", 2, 500),
                new OrderDetails(6, "BOX", "SetTopBox", 0, 3000)
        );

        List<Order> orders = Arrays.asList(
                new Order(101, "Abhishek", LocalDateTime.now(), d1),
                new Order(102, "Rahul", LocalDateTime.now(), d2)
        );

        Map<Long, Double> orderPriceMap = orders.stream()
                .collect(Collectors.toMap(
                        Order::getId,
                        order -> order.getOrderDetails()
                                .stream()
                                .filter(od -> od.getItemQuantity() > 0)
                                .mapToDouble(OrderDetails::getTotalPrice)
                                .sum()
                ));

        orderPriceMap.forEach((id, total) ->
                System.out.println("OrderId: " + id + " | TotalPrice: " + total));


        // ✅ Q.3) Get unique item names using Stream API
        Set<String> itemNames = orders.stream()
                .flatMap(order -> order.getOrderDetails().stream()) // combine all orderDetails
                .map(OrderDetails::getItemName)                     // pick itemName only
                .collect(Collectors.toSet());                       // store in Set (unique)

        System.out.println("Unique item names across all orders:");
        System.out.println(itemNames);
    }
}
