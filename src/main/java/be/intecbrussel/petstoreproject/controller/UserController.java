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
    public ResponseEntity createUser(@RequestBody User user) {
        userService.createUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(new ApiResponse(200, "Successful operation", "Successful operation"));
    }

    @PutMapping
    public ResponseEntity updateUser(@RequestBody User user) {
        userService.updateUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(new ApiResponse(200, "Successful operation", "Successful operation"));
    }

    @DeleteMapping("{username}")
    public ResponseEntity deleteUser(@PathVariable("username") String username) {
        userService.deleteUser(username);
        return ResponseEntity.status(HttpStatus.OK).body(new ApiResponse(200,"OK","Pet deleted"));
    }


}
