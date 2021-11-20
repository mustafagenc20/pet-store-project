package be.intecbrussel.petstoreproject.service;

import be.intecbrussel.petstoreproject.models.Order;
import be.intecbrussel.petstoreproject.models.Pet;

import java.util.List;

public interface StoreService {
    List<Order> getInventory(Order order);
    Order updateOrder(Order order);
    Order getOrderById(Long id);
    void deleteOrderById(Long id);
}
