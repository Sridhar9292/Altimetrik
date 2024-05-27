package com.altimetrick.Users_Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.altimetrick.Users_Service.Repository.UserRepository;
import com.altimetrick.Users_Service.model.User;

import jakarta.transaction.Transactional;


@SpringBootApplication
@Transactional
public class UsersServiceApplication implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(UsersServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		userRepository.save(new User(1L, "Ravi", "1234"));
		userRepository.save(new User(2L, "Singh", "3333"));
		userRepository.save(new User(3L, "Kosana", "1111"));
		userRepository.save(new User(4L, "Surya", "99999"));
	}

}
