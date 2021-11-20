package be.intecbrussel.petstoreproject.service.impl;

import be.intecbrussel.petstoreproject.models.Pet;
import be.intecbrussel.petstoreproject.repository.PetRepository;
import be.intecbrussel.petstoreproject.service.PetService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PetServiceImpl implements PetService {

    private final PetRepository petRepository;

    @Override
    public Pet createPet(Pet pet) {
        return petRepository.save(pet);
    }

    @Override
    public Pet updatePet(Long id, Pet pet) {
        return petRepository.save(pet);
    }

    @Override
    public Pet findPetById(Long id) {
        return petRepository.getById(id);
    }

    @Override
    public Pet findPetByStatus(String status) {
        return petRepository.findByStatus(status);
    }

    @Override
    public void deletePetById(Long id) {
        return petRepository.delete(id);
    }
}
