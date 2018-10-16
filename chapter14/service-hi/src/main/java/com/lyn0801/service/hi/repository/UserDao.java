package com.lyn0801.service.hi.repository;

import com.lyn0801.service.hi.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {

	User findByUsername(String username);
}
