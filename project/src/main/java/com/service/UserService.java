package com.service;
import net.javaguides.springboot.entity.User;

import java.util.List;

public interface UserService {
    User createUser(User user);

    User getUserById(Long userId);

    User updateUser(User user);

    void deleteUser(Long userId);
}