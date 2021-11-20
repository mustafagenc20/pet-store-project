package be.intecbrussel.petstoreproject.repository;

import be.intecbrussel.petstoreproject.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
