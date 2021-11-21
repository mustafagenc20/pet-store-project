package be.intecbrussel.petstoreproject.service;

import be.intecbrussel.petstoreproject.models.entity.User;

import java.util.ArrayList;
import java.util.List;

public interface UserService {
    User createUser(User user);
    User createWithArray(List id);
    User createWithList(List String);
    User getLogin(String username, String password);
    User getLogout();
    User updateUser(String username);
    void deleteUser(String username);
}
