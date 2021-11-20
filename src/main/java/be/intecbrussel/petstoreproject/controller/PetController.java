package be.intecbrussel.petstoreproject.controller;

import be.intecbrussel.petstoreproject.models.ApiResponse;
import be.intecbrussel.petstoreproject.models.Pet;
import be.intecbrussel.petstoreproject.repository.PetRepository;
import be.intecbrussel.petstoreproject.service.PetService;
import be.intecbrussel.petstoreproject.service.PetStatus;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pet")
@RequiredArgsConstructor
public class PetController {

    private final PetService petService;

    @PostMapping
    public ResponseEntity createPet(@RequestBody Pet pet) {
        Pet savedPet = petService.createPet(pet);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedPet);
    }

    @PutMapping
    public ResponseEntity updatePet(@RequestBody Long id, Pet pet) {
        Pet updatedPet = petService.updatePet(id, pet);
        return ResponseEntity.status(HttpStatus.CREATED).body(updatedPet);
    }

    @GetMapping("/findById")
    public ResponseEntity getPetById(@RequestParam("id") Long id) {
        Pet pet = petService.findPetById(id);
        return ResponseEntity.status(HttpStatus.FOUND).body(pet);
    }

    @GetMapping("/findByStatus")
    public ResponseEntity getPetByStatus(@RequestParam("status") String status) {
        Pet pet = petService.findPetByStatus(status);
        return ResponseEntity.status(HttpStatus.FOUND).body(pet);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deletePetById(@PathVariable("id") Long id) {
        petService.deletePetById(id);
        return ResponseEntity.status(HttpStatus.OK).body(null);
    }
}


