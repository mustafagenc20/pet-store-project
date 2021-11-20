package be.intecbrussel.petstoreproject.repository;

import be.intecbrussel.petstoreproject.models.entity.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PetRepository extends JpaRepository<Pet, Long> {

    Pet save(Pet pet);
    Optional<Pet> findById(Long id);
    Optional<Pet> findByStatus(String status);
    void deleteById(Long id);
}
