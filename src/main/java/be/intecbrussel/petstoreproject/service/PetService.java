package be.intecbrussel.petstoreproject.service;

import be.intecbrussel.petstoreproject.models.Pet;

public interface PetService {
    Pet createPet(Pet pet);
    Pet updatePet(Long id, Pet pet);
    Pet findPetById(Long id);
    Pet findPetByStatus(String status);

    void deletePetById(Long id);


}
