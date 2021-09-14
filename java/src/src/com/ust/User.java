package com.ust;

public class User extends Object{

	public String email;
	public String password;
	public User(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	public void changePassword(String newPassword) {
		this.password = newPassword;
	}
	
	public void encodePassword() {
		this.password = "P&*#$$" + this.password;
	
	}
	
	@Override
	public String toString() {
		return "User [email=" + email + ", password=" + password + "]";
	}
	
	
}
