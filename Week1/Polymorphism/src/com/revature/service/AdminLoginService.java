package com.revature.service;

import com.revature.pojo.User;

public class AdminLoginService extends UserLoginService{

	@Override //annotation, guarentees you are actually overriding a method
	public boolean authenticateUser(User user) {
		return true;
	}
	
	public void deleteAllUsers() {
		System.out.println("You better be sure you want to do this!!!!!!!");
	}
	
}
