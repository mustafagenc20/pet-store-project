package be.intecbrussel.petstoreproject.service.impl;

import be.intecbrussel.petstoreproject.models.ApiResponse;
import be.intecbrussel.petstoreproject.models.Order;
import be.intecbrussel.petstoreproject.models.Pet;
import be.intecbrussel.petstoreproject.service.PetService;
import be.intecbrussel.petstoreproject.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

public class StoreServiceImpl implements StoreService {

    @Override
    public List<Order> getInventory(Order order) {
        return null;
    }

    @Override
    public Order updateOrder(Order order) {
        return null;
    }

    @Override
    public Order getOrderById(Long id) {
        return null;
    }

    @Override
    public void deleteOrderById(Long id) {

    }
}