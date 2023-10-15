package com.service.impl;
import lombok.AllArgsConstructor;
import net.javaguides.springboot.entity.User;
import net.javaguides.springboot.repository.UserRepository;
import net.javaguides.springboot.service.UserService;
import org.apache.logging.log4j.util.Strings;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
//create user
    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }
//get user
    @Override
    public User getUserById(int userId) {
        Optional<User> optionalUser = userRepository.findById(userId);
        return optionalUser.get();
    }
//update user
    @Override
    public User updateUser(User user) {
        User existingUser = userRepository.findById(user.getId()).get();
        existingUser.setNom(user.getNom());
        existingUser.setPrenom(user.getPrenom());
        existingUser.setDatedenaissance(user.getDatedenaissance());
        existingUser.setAdr(user.getAdr());
        existingUser.setMdp(user.getMdp());
        existingUser.setVmdp(user.getVmdp());
        User updatedUser = userRepository.save(existingUser);
        return updatedUser;
    }
//delete user
    @Override
    public void deleteUser(int userId) {
        userRepository.deleteById(userId);
    }
}