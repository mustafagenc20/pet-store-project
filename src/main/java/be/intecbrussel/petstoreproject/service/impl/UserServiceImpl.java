package be.intecbrussel.petstoreproject.service.impl;

import be.intecbrussel.petstoreproject.models.entity.User;
import be.intecbrussel.petstoreproject.repository.UserRepository;
import be.intecbrussel.petstoreproject.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> createWithList(List<User> users) {
        return userRepository.saveAll(users);
    }

    @Override
    public ResponseEntity getLogin(String username, String password) {
        User user = userRepository.findByUsername(username);
        if (user.getPassword().equals(password)){
            return ResponseEntity.status(HttpStatus.OK).body("Successful operation");
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(
                    "Invalid username/password supplied");
        }
    }

    @Override
    public User getLogout() {
        return null;
    }

    @Override
    public User updateUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(String username) {
        userRepository.deleteByUsername(username);
    }
}
