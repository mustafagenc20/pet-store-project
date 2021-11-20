package be.intecbrussel.petstoreproject.repository;

import be.intecbrussel.petstoreproject.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
