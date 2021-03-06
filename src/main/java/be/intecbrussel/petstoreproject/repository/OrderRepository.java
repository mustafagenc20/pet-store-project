package be.intecbrussel.petstoreproject.repository;

import be.intecbrussel.petstoreproject.models.entity.Order;
import org.apache.catalina.Store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    Order save(Order order);
    Optional<Order> findById(Long id);
    Optional<Order> findByStatus(String status);
    List<Order> findAllByStatus(String status);
    void deleteById(Long id);
}
