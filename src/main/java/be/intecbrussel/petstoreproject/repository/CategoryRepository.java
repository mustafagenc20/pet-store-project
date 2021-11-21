package be.intecbrussel.petstoreproject.repository;

import be.intecbrussel.petstoreproject.models.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository <Category, Long> {
}
