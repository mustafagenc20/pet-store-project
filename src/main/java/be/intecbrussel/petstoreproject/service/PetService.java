package be.intecbrussel.petstoreproject.service;

import be.intecbrussel.petstoreproject.models.entity.Pet;
import org.springframework.http.ResponseEntity;

public interface PetService {
    Pet createPet(Pet pet);
    Pet updatePet(Pet pet);
    Pet findPetById(Long id);
    Pet findPetByStatus(String status);
    void deletePetById(Long id);


}
