package com.example.workoutapp.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Question {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	
	String text;
	String[] choices;
	int correctChoice;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String[] getChoices() {
		return choices;
	}
	public void setChoices(String[] choices) {
		this.choices = choices;
	}
	public int getCorrectChoice() {
		return correctChoice;
	}
	public void setCorrectChoice(int correctChoice) {
		this.correctChoice = correctChoice;
	}
	
	
	
	
}
