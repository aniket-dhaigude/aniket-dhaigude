package com.fleeter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fleeter.entities.master.LoginRequest;
import com.fleeter.entities.master.User;
import com.fleeter.repository.UserRepository;

@RestController
@CrossOrigin("*")
@RequestMapping("/user")
public class UserController
{
	@Autowired
private UserRepository userRepository;

	@PostMapping("/login")
public User saveUser(@RequestBody LoginRequest loginRequest)
{
	return userRepository.findByUsernameAndPassword(loginRequest.getUsername(),loginRequest.getPassword());
}
	@DeleteMapping("/{id}")
public void deleteUser(@PathVariable("id") int id)
{
	userRepository.deleteById(id);
}
	
	@GetMapping("/")
public List<User> getUsers()
{
		return userRepository.findAll();
}
	
}
