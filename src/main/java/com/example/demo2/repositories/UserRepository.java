package com.example.demo2.repositories;

import com.example.demo2.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User , Long> {
  boolean findByEmail(String email);
}
