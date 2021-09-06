package com.ust.test;

import com.ust.User;

public class TestUser {

	public static void main(String[] args) {
		User user1 = new User("test@test.com", "testtest");
		System.out.println(user1);
		user1.changePassword("default");
		System.out.println(user1);
		
		User user2 = new User("test2@test.com", "testtest2");
		System.out.println(user2);
		
		

	}

}
