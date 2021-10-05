package com.example.workoutapp.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.workoutapp.entities.Workout;

// Http endpoint

@RestController
@CrossOrigin
@RequestMapping("/workouts")
public class WorkoutController {
	
	@Autowired
	WorkoutRepository workoutRepository;
	
//	@RequestMapping(path = "/workouts", method = RequestMethod.GET)
	@GetMapping("/")
	public List<Workout> fetchAllWorkouts(){
		System.out.println("fetch all workout method is invoked...");
//		return null;
		//db fetch
		return workoutRepository.findAll();
	}
	
//	@RequestMapping(path = "/workouts/{workoutid}", method = RequestMethod.GET)
	@GetMapping("/{workoutid}")
	public ResponseEntity<Workout> fetchWorkoutById(@PathVariable("workoutid") int workoutId){
		ResponseEntity<Workout> re = null;
		Optional<Workout> workoutFound = workoutRepository.findById(workoutId);
		if(workoutFound.isPresent()) {
			re = new ResponseEntity<Workout>(workoutFound.get(), HttpStatus.OK);
			return re;
		}
		return re = new ResponseEntity<Workout>(HttpStatus.NOT_FOUND);
	}
	
//	@RequestMapping(path = "/workouts/{workoutid}", method = RequestMethod.PATCH)
	@PatchMapping("/{workoutid}")
	public void startEndWorkout(@PathVariable("workoutid") int workoutId, @RequestBody Workout workout){
//		Workout workout
//		workoutRepository.save
//		System.out.println(workoutId);

		Workout workoutToBeUpdated = null; 
		// find an existing workout
		Optional<Workout> workoutFound = workoutRepository.findById(workoutId);
		if(workoutFound.isPresent()) {
			workoutToBeUpdated = workoutFound.get();
		}
		
//		update start time if present
		if(workout.getStartTime()!=null && workout.getStartTime()!="") {
			workoutToBeUpdated.setStartTime(workout.getStartTime());
		}
		
		// update end time if present
		if(workout.getEndTime()!=null && workout.getEndTime()!="") {
			workoutToBeUpdated.setEndTime(workout.getEndTime());
		}
		
		
		// merge to db
		workoutRepository.save(workoutToBeUpdated);

	}
	
//	@RequestMapping(path = "/workouts", method = RequestMethod.POST)
	@PostMapping("/")
	public void addWorkout(@RequestBody Workout workout){
		System.out.println("add a workout method is invoked...");
		System.out.println(workout);
		// db insert
		workoutRepository.save(workout);
	}
	
	
//	@RequestMapping(path = "/workouts/{workoutid}", method = RequestMethod.DELETE)
	@DeleteMapping("/{workoutid}")
	public void deleteWorkout(@PathVariable("workoutid") int workoutId){
		System.out.println(workoutId);
		workoutRepository.deleteById(workoutId);
	}
	

}
