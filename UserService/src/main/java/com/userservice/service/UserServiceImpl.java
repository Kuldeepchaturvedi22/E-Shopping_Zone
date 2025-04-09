package com.userservice.service;

import com.userservice.entity.User;
import com.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public ResponseEntity<String> createUser(User user) {
        userRepository.save(user);
        return new ResponseEntity<String>("User Created",HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> users = userRepository.findAll();
        return new ResponseEntity<List<User>>(users, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<String> deleteUser(int userId) {
        userRepository.deleteById(userId);
        return new ResponseEntity<>("User deleted successfully", HttpStatus.OK);
    }

    @Override
    public ResponseEntity<String> updateUser(int userId, User user) {
        Optional<User> existingUser = userRepository.findById(userId);
        if (existingUser.isEmpty()) {
            return new ResponseEntity<String>("User not found", HttpStatus.NOT_FOUND);
        }
        User updatedUser = existingUser.get();
        updatedUser.setFullName(user.getFullName());
        updatedUser.setEmailId(user.getEmailId());
        updatedUser.setMobileNumber(user.getMobileNumber());
        updatedUser.setAbout(user.getAbout());
        updatedUser.setDateOfBirth(user.getDateOfBirth());
        userRepository.save(updatedUser);
        return new ResponseEntity<String>("User updated successfully", HttpStatus.OK);
    }

    @Override
    public ResponseEntity<User> getUserById(int userId) {
        Optional<User> op = userRepository.findById(userId);
        return new ResponseEntity<>(userRepository.findById(userId).get(), HttpStatusCode.valueOf(200));

    }
    @Override
    public User getUserByEmailId(String emailId) {
        User user = userRepository.findByEmailId(emailId);
        return user;

    }
}
