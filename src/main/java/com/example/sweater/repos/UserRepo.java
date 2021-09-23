package com.example.sweater.repos;

import com.example.sweater.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUserName(String userName);

    User findByActivationCode(String code);
}
