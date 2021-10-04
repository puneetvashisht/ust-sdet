package com.example.workoutapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.workoutapp.entities.Workout;

// Http endpoint

@RestController
@CrossOrigin
public class WorkoutController {
	
	@Autowired
	WorkoutRepository workoutRepository;
	
	@RequestMapping(path = "/workouts", method = RequestMethod.GET)
//	@GetMapping("/workouts")
	public List<Workout> fetchAllWorkouts(){
		System.out.println("fetch all workout method is invoked...");
//		return null;
		//db fetch
		return workoutRepository.findAll();
	}
	
	@RequestMapping(path = "/workouts", method = RequestMethod.POST)
	public void addWorkout(@RequestBody Workout workout){
		System.out.println("add a workout method is invoked...");
		System.out.println(workout);
		// db insert
		workoutRepository.save(workout);
	}
	

}
