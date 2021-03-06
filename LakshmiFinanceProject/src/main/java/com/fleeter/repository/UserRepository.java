package com.fleeter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fleeter.entities.master.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>
{

	public User findByUsernameAndPassword(String username, String password);

}
