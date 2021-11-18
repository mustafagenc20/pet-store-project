package be.intecbrussel.petstoreproject.controller;

import be.intecbrussel.petstoreproject.service.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class UserController {
    @RequestMapping(method = RequestMethod.GET, path="/user")
    public ResponseEntity<User> getUser(String id) {
//        if ("1".equals(id)) {
//            user.setId(1);
//            user.setLastName("Nani");
//            return ResponseEntity.ok(user);
//
//        } else {
//            throw new ResponseStatusException(HttpStatus.CONFLICT, "Not found");
//        }
        return null;
    }
}
