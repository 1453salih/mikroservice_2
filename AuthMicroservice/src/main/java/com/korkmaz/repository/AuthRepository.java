package com.korkmaz.repository;

import com.korkmaz.entity.Auth;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthRepository extends JpaRepository<Auth, Long> {

    Boolean existsByUserNameAndPassword(String userName, String password);
}
