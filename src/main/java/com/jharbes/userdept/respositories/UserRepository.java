package com.jharbes.userdept.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jharbes.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
