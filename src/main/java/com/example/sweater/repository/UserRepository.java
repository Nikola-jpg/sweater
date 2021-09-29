package com.example.sweater.repository;

import com.example.sweater.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUserName(String userName);

    User findByActivationCode(String code);
}
