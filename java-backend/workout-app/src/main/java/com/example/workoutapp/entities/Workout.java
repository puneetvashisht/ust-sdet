package com.example.workoutapp.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

// mapping java class to db

@Entity
public class Workout {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String title;
	@Column(name = "description")
	String desc;
	int cbpm;
	String startTime;
	String endTime;
	
//	@OneToOne(cascade = CascadeType.ALL)
//	User user;
	@OneToMany(cascade = CascadeType.ALL)
	List<User> users;

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}


	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getDesc() {
		return desc;
	}



	public void setDesc(String desc) {
		this.desc = desc;
	}



	public int getCbpm() {
		return cbpm;
	}



	public void setCbpm(int cbpm) {
		this.cbpm = cbpm;
	}



	public String getStartTime() {
		return startTime;
	}



	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}



	public String getEndTime() {
		return endTime;
	}



	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}



	@Override
	public String toString() {
		return "Workout [id=" + id + ", title=" + title + ", desc=" + desc + ", cbpm=" + cbpm + ", startTime="
				+ startTime + ", endTime=" + endTime + "]";
	}
	
	

}
