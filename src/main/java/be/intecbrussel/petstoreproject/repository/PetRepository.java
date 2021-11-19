package be.intecbrussel.petstoreproject.repository;

import be.intecbrussel.petstoreproject.models.Pet;
import be.intecbrussel.petstoreproject.service.PetStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PetRepository extends JpaRepository<Pet, Long> {

    @Query("SELECT p FROM Pet p WHERE p.status IN :petStatuses")
    List<Pet> findAllByStatus(@Param("petStatuses") PetStatus[] petStatuses);
}
