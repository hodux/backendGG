package com.example.backend.repositories;

import com.example.backend.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Integer> {
    public boolean existsByEmail(String email);
    public boolean existsByUsername(String username);
    public boolean existsByUsernameAndAndPasswd(String username, String password);
    public boolean existsByEmailAndAndPasswd(String email, String password);

    public Users findUsersByEmailOrUsername(String email,String username);
}