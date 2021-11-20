package be.intecbrussel.petstoreproject.service;

import be.intecbrussel.petstoreproject.models.Pet;
import be.intecbrussel.petstoreproject.models.User;

import java.util.ArrayList;
import java.util.List;

public interface UserService {
    User createUser(User user);
    User createWithArray(ArrayList id);
    User createWithList(List id);
    User login(String userName, String password);
    User logout();
    void deletePetById(Long id);
}
