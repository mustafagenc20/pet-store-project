package be.intecbrussel.petstoreproject.service;

import be.intecbrussel.petstoreproject.models.entity.User;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

public interface UserService {
    User createUser(User user);
    List<User> createWithList(List<User> users);
    ResponseEntity getLogin(String username, String password);
    User getLogout();
    User updateUser(User user);
    void deleteUser(String username);
}
