package be.intecbrussel.petstoreproject.service;

import be.intecbrussel.petstoreproject.models.Pet;

public interface StoreService {
    Pet getInventory(Pet pet);
    Pet updatePet(Long id, Pet pet);
    Pet findPetById(Long id);
    void deletePetById(Long id);
}
