package com.lyn0801.uaa.service.dao;


import com.lyn0801.uaa.service.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 * @author lyn0801
 */

public interface UserDao extends JpaRepository<User, Long> {

	User findByUsername(String username);
}
