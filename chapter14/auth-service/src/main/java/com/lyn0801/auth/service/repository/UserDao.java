package com.lyn0801.auth.service.repository;

import com.lyn0801.auth.service.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {

	User findByUsername(String username);
}
