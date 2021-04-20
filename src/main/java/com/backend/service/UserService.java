package com.backend.service;

import com.backend.entity.User;

import java.util.List;

public interface UserService {
    User checkUser(String username, String password);
    User addUser(User user);
    List<User> getUsers();
    User findByName(String username);
}