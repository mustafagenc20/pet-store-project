package be.intecbrussel.petstoreproject.controller;

import be.intecbrussel.petstoreproject.models.User;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class UserController {
    @GetMapping("/user")
    public ResponseEntity<User> getUser(String id) {
//        if ("1".equals(id)) {
//            user.setLastName("Mustafa");
//            return ResponseEntity.ok(user);
//
//        } else {
//            throw new ResponseStatusException(HttpStatus.CONFLICT, "Not found");
//        }
        return null;
    }
}
