package com.example.awsspringdemo;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

class Message{
	String text;
	Date today;
	
	public Message() {
		super();

	}
	public Message(String text, Date today) {
		super();
		this.text = text;
		this.today = today;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Date getToday() {
		return today;
	}
	public void setToday(Date today) {
		this.today = today;
	}
	@Override
	public String toString() {
		return "Message [text=" + text + ", today=" + today + "]";
	}
	
	

}

@RestController
public class DateController {
	
	@GetMapping("/today")
	public Message displayServerDate() {
		return new Message("Time today is: ", new Date());
		
	}

}
