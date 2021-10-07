package com.example.workoutapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.workoutapp.entities.User;

@RestController
@CrossOrigin
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	UserRepository userRepository;
//	
	@GetMapping("/")
	public List<User> fetchAllUsers(){
		System.out.println("fetch all workout method is invoked...");
		return userRepository.findAll();
	}
}
