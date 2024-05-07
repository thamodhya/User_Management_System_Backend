package com.springboot.User_Management_System.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springboot.User_Management_System.entity.OurUsers;

import java.util.Optional;

public interface UserRepository extends JpaRepository<OurUsers, Integer> {
    Optional<OurUsers> findByEmail(String email);
}
