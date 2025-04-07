package com.example.usermanagement.service;

import com.example.usermanagement.dto.UserDTO;
import com.example.usermanagement.model.User;
import java.util.List;

public interface UserService {
    User createUser(UserDTO userDTO);
    User updateUser(Long id, UserDTO userDTO);
    void deleteUser(Long id);
    User getUserById(Long id);
    List<User> getAllUsers();
    User getUserByUsername(String username);
} 