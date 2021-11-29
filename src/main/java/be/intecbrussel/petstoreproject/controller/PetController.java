package be.intecbrussel.petstoreproject.controller;

import be.intecbrussel.petstoreproject.models.ApiResponse;
import be.intecbrussel.petstoreproject.models.entity.Pet;
import be.intecbrussel.petstoreproject.service.PetService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pet")
//@RequiredArgsConstructor
public class PetController {

    private final PetService petService;

    public PetController(PetService petService)  {
        this.petService = petService;
    }

    @PostMapping
    public ResponseEntity createPet(@RequestBody Pet pet) {
        if (pet == null) {
            return ResponseEntity.badRequest().body(new ApiResponse(415, "invalid input", "invalid input"));
        } else {
            petService.createPet(pet);
            return ResponseEntity.status(HttpStatus.CREATED).body(new ApiResponse(201, "OK", "Pet saved to database"));
        }
    }

    @PutMapping
    public ResponseEntity updatePet(@RequestBody Pet pet) {
        if (petService.findPetById(pet.getId()) == null) {
            return ResponseEntity.badRequest().body(new ApiResponse(400, "invalid ID supplied", "invalid ID supplied"));
        } else {
            petService.updatePet(pet);
            return ResponseEntity.status(HttpStatus.CREATED).body(new ApiResponse(200, "OK", "Pet updated to the database"));
        }
    }

    @GetMapping("findById")
    public ResponseEntity getPetById(@RequestParam("id") Long id) {
        if (id == null) {
            return ResponseEntity.badRequest().body(new ApiResponse(400, "invalid ID supplied", "invalid ID supplied"));
        } else {
            Pet pet = petService.findPetById(id);
            if (pet == null){
                return ResponseEntity.status(HttpStatus.FOUND).body(new ApiResponse(404, "not found", " pet not found."));
            } else {
                return ResponseEntity.status(HttpStatus.OK).body(pet);
            }
        }
    }

    @GetMapping("findByStatus")
    public ResponseEntity getPetByStatus(@RequestParam("status") String status) {
        if (status == null) {
            return ResponseEntity.badRequest().body(new ApiResponse(400,
                    "Invalid status value",
                    "Invalid status value"));
        } else {
            Pet pet = petService.findPetByStatus(status);
            if (pet == null){
                return ResponseEntity.status(HttpStatus.FOUND).body(new ApiResponse(404, "not found", " pet not found."));
            } else {
                return ResponseEntity.status(HttpStatus.OK).body(pet);
            }
        }
    }

    @DeleteMapping("{id}")
    public ResponseEntity deletePetById(@PathVariable("id") Long id) {
        if (id == null) {
            return ResponseEntity.badRequest().body(new ApiResponse(404,
                    "Invalid ID supplied",
                    "Invalid ID supplied"));
        } else if (petService.findPetById(id) == null) {
            return ResponseEntity.status(HttpStatus.FOUND).body(new ApiResponse(404, "not found", " pet not found."));
        }
        else {
            petService.deletePetById(id);
            return ResponseEntity.status(HttpStatus.OK).body(new ApiResponse(200,"OK","Pet deleted from the database"));
        }
    }
}


