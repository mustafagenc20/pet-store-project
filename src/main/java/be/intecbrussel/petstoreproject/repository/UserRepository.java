package be.intecbrussel.petstoreproject.repository;

import be.intecbrussel.petstoreproject.models.entity.Order;
import be.intecbrussel.petstoreproject.models.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    User save(User user);
//    List<User> saveAll(List<User> user);
    User findByUsername(String username);
    void deleteByUsername(String username);
}
