package be.intecbrussel.petstoreproject.service;

import be.intecbrussel.petstoreproject.models.Pet;

public interface StoreService {
    Pet getInventory(Pet pet);
    Pet updatePet(Long id, Pet pet);
    Pet findPetById(Long id);
    Pet findPetByStatus(String status);
    void deletePetById(Long id);
}
