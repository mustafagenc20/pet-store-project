package be.intecbrussel.petstoreproject.repository;

import be.intecbrussel.petstoreproject.models.Pet;
import be.intecbrussel.petstoreproject.service.PetStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

public interface PetRepository extends JpaRepository<Pet, Long> {

    Pet save(Pet pet);
    void delete(Long id);
    Optional<Pet> findById(Long id);
    Optional<Pet> findByStatus(String status);


}
