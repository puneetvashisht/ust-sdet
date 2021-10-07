package com.example.workoutapp.controllers;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.workoutapp.entities.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
