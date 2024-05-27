package com.altimetrick.Users_Service.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.altimetrick.Users_Service.Repository.UserRepository;
import com.altimetrick.Users_Service.model.User;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public User registerUser(User user) {
        return userRepository.save(user);
    }

	public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
