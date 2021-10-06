package com.example.workoutapp.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
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
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@GetMapping("/bytitle/{title}")
	public List<Workout> fetchWorkoutByWorkoutTitle(@PathVariable(value = "title") String title){
		return workoutRepository.findByTitle(title);
	}
	
	
	@GetMapping("/by")
	public List<Workout> fetchWorkoutByTitle(@RequestParam(value = "title", required = false) String title, @RequestParam(value = "cbpm", required = false) String cbpm){
		System.out.println(title);
		System.out.println(cbpm);
		if(title!=null && title!="") {
			return workoutRepository.findByTitle(title);
		}
		
		if(cbpm!=null && cbpm!="") {
			int c = Integer.valueOf(cbpm);
			System.out.println(c);
			return workoutRepository.findByCbpmGreaterThan(c);
		}
		return null;
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
	public ResponseEntity<Void> addWorkout(@RequestBody Workout workout){
		System.out.println("add a workout method is invoked...");
		System.out.println(workout);
		// db insert
		workoutRepository.save(workout);
		ResponseEntity<Void> re = new ResponseEntity<Void>(HttpStatus.CREATED);
		return re;
	}
	
	
//	@RequestMapping(path = "/workouts/{workoutid}", method = RequestMethod.DELETE)
	@DeleteMapping("/{workoutid}")
	public ResponseEntity<Void> deleteWorkout(@PathVariable("workoutid") int workoutId){
		ResponseEntity<Void> re = new ResponseEntity<Void>(HttpStatus.OK);
		try {
			workoutRepository.deleteById(workoutId);
		}
		catch(EmptyResultDataAccessException e) {
			re= new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
		
		return re;
	}
	

}
