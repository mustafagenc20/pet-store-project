package be.intecbrussel.petstoreproject.service.impl;

import be.intecbrussel.petstoreproject.models.ApiResponse;
import be.intecbrussel.petstoreproject.models.entity.Pet;
import be.intecbrussel.petstoreproject.repository.PetRepository;
import be.intecbrussel.petstoreproject.service.PetService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service("petService")
@RequiredArgsConstructor
public class PetServiceImpl implements PetService {

    private final PetRepository petRepository;

    @Override
    public Pet createPet(Pet pet) {
        return petRepository.save(pet);
    }

    @Override
    public Pet updatePet(Pet pet) {
        return petRepository.save(pet);
    }

    @Override
    public Pet findPetById(Long id) {
        return petRepository.getById(id);
    }

    @Override
    public Pet findPetByStatus(String status) {
        return petRepository.findByStatus(status).get();
    }

    @Override
    public void deletePetById(Long id) {
        petRepository.deleteById(id);
    }
}
