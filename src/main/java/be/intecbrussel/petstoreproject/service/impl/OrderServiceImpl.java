package be.intecbrussel.petstoreproject.service.impl;

import be.intecbrussel.petstoreproject.models.entity.Order;
import be.intecbrussel.petstoreproject.repository.OrderRepository;
import be.intecbrussel.petstoreproject.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    @Override
    public List<Order> findAllByStatus(String status) {
        return orderRepository.findAllByStatus(status);
    }

    @Override
    public Order updateOrder(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public Order getOrderById(Long id) {
        return orderRepository.getById(id);
    }

    @Override
    public void deleteOrderById(Long id) {
        orderRepository.deleteById(id);
    }
}
