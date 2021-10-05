package com.example.workoutapp.controllers;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.workoutapp.entities.Mentor;

public interface MentorRepository extends JpaRepository<Mentor, Integer>{

}
