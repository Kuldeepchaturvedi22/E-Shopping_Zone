package com.userservice.service;
import com.userservice.entity.User;
import org.springframework.http.ResponseEntity;
import java.util.List;

public interface UserService {
    ResponseEntity<String> createUser(User user);
    ResponseEntity<List<User>> getAllUsers();
    ResponseEntity<String> deleteUser(int userId);
    ResponseEntity<String> updateUser(int userId, User user );
    ResponseEntity<User> getUserById(int userId);
    User getUserByEmailId(String emailId);
}
