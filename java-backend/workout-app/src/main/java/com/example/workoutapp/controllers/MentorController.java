package com.example.workoutapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.workoutapp.entities.Mentor;
import com.example.workoutapp.entities.Workout;

@RestController
@CrossOrigin
@RequestMapping("/mentors")
public class MentorController {
	
	@Autowired
	MentorRepository mentorRepository;
	
	@GetMapping("/")
	public List<Mentor> fetchAllMentors(){
		return mentorRepository.findAll();
	}
	
	@PostMapping("/")
	public void addMentor(@RequestBody Mentor mentor){
		mentorRepository.save(mentor);
	}

}
