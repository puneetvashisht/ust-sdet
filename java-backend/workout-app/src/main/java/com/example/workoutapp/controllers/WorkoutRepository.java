package com.example.workoutapp.controllers;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.workoutapp.entities.Workout;

public interface WorkoutRepository extends JpaRepository<Workout, Integer>{
	
	// CRUD is available
	
//	@Query("SELECT n from #{#entityName} n WHERE n.title = ?1")
	List<Workout> findByTitle(String title);
	
	Workout findById(int id);
	
	@Query("SELECT n from #{#entityName} n WHERE n.cbpm > ?1")
	List<Workout> findByCbpmGreaterThan(int cbpm);

}
