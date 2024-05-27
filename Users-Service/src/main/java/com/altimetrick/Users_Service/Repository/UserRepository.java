package com.altimetrick.Users_Service.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.altimetrick.Users_Service.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
