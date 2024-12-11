package com.example.service;

import com.example.model.User;
import com.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> listAllUsers() {
        return userRepository.getAllUsers();
    }

    public void saveUser(User user) {
        userRepository.saveUser(user);
    }

    public User getUserById(int id) {
        return userRepository.getUserById(id);
    }

    public void deleteUser(int id) {
        userRepository.deleteUser(id);
    }
}
