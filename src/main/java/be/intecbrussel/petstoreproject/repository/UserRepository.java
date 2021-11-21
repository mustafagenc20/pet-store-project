package be.intecbrussel.petstoreproject.repository;

import be.intecbrussel.petstoreproject.models.entity.Order;
import be.intecbrussel.petstoreproject.models.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    User createUser(User user);
    List<User> createWithArray(Long id);
    List<User> createWithList(String username);
    User login(String username, String password);
    User logout();
    User getUserByUsername(String username);
    User updateUser(String username);
    void deleteUserByUsername(String username);
}
