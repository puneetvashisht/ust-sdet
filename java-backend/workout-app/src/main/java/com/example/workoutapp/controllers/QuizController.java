package com.example.workoutapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.workoutapp.entities.Quiz;

@RestController
@CrossOrigin
@RequestMapping("/quizes")
public class QuizController {
	
	@Autowired
	QuizRepository quizRepository;
	
	@GetMapping("/")
	public List<Quiz> fetchAllQuizes(){
		return quizRepository.findAll();
	}
	
	@PostMapping("/")
	public void addQuiz(@RequestBody Quiz quiz){
		quizRepository.save(quiz);
	}

}
