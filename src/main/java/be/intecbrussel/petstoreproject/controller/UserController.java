package be.intecbrussel.petstoreproject.controller;

import be.intecbrussel.petstoreproject.models.ApiResponse;
import be.intecbrussel.petstoreproject.models.entity.Pet;
import be.intecbrussel.petstoreproject.models.entity.User;
import be.intecbrussel.petstoreproject.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    public ResponseEntity createPet(@RequestBody User user) {
        if (user == null) {
            return ResponseEntity.badRequest().body(new ApiResponse(405, "invalid input", "invalid input"));
        } else {
            userService.createUser(user);
            return ResponseEntity.status(HttpStatus.CREATED).body(new ApiResponse(200, "OK", "Pet saved to database"));
        }
    }


    @DeleteMapping("{id}")
    public ResponseEntity id(@PathVariable("username") String username) {
        if (username == null) {
            return ResponseEntity.badRequest().body(new ApiResponse(404,
                    "Invalid ID supplied",
                    "Invalid ID supplied"));
        } else if (userService.u(id) == null) {
            return ResponseEntity.status(HttpStatus.FOUND).body(new ApiResponse(404, "not found", " pet not found."));
        }
        else {
            petService.deletePetById(id);
            return ResponseEntity.status(HttpStatus.OK).body(new ApiResponse(200,"OK","Pet deleted from the database"));
        }
    }
}
