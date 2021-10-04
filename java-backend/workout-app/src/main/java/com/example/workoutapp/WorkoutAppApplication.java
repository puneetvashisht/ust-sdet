package com.example.workoutapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WorkoutAppApplication {

	public static void main(String[] args) {
		System.out.println("Starting...");
		SpringApplication.run(WorkoutAppApplication.class, args);
	}

}
