package be.intecbrussel.petstoreproject.service;

import be.intecbrussel.petstoreproject.models.entity.Order;

import java.util.List;

public interface OrderService {
    List<Order> findAllByStatus(String status);
    Order updateOrder(Order order);
    Order getOrderById(Long id);
    void deleteOrderById(Long id);
}
