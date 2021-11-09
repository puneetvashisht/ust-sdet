package com.example.workoutapp.controllers;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.workoutapp.entities.Quiz;

public interface QuizRepository extends JpaRepository<Quiz, Integer>{

}
