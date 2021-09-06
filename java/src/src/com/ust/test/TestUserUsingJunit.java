package com.ust.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.ust.User;

public class TestUserUsingJunit {

	@Test
	public void testUserConstruction() {
		User user1 = new User("test@test.com", "testtest");
		assertEquals("Email is same", "test@test.com", user1.email);
	}
	
	@Test
	public void testUserPasswordChange() {
		User user1 = new User("test@test.com", "testtest");
		user1.changePassword("admin");
		assertEquals("Password changed..", "admin", user1.password);
	}
	
	@Test
	public void testUserPasswordEncode() {
		User user1 = new User("test@test.com", "testtest");
		user1.encodePassword();
		
		assertEquals("Password encoded..", "P&*#$$testtest", user1.password);
	}


}
