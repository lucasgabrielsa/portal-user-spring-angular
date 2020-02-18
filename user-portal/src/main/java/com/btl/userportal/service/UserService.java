package com.btl.userportal.service;

import com.btl.userportal.model.User;

import java.util.List;

public interface UserService {
    User create(User user);

    User findById(int id);

    User delete(int id);

    List<User> findAll();
}
