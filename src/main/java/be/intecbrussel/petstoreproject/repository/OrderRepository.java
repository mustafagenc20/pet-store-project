package be.intecbrussel.petstoreproject.repository;

import be.intecbrussel.petstoreproject.models.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    Order save(Order order);
    Optional<Order> findById(Long id);
    Optional<Order> findByStatus(String status);
    void delete(Long id);
}
