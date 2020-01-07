package com.revature.service;

import com.revature.pojo.User;

public class UserLoginService {

	private static User[] userDB;

	private static int userIndex;

	public User registerUser(String username, String password) {

		User newUser = new User();
		newUser.setPassword(password);
		newUser.setUsername(username);

		userDB[userIndex] = newUser;
		userIndex++;

		return newUser;

	}

	private int findUserIndex(User user) {
		for (int i = 0; i < userIndex; i++) {
			if (userDB[i] != null) {
				if (userDB[i].getUsername().equals(user.getUsername())) {
					return i;
				}
			}
		}
		return -1; // denotes the user was not found
	}

	public void removeUser(User user) {
		int index = findUserIndex(user);
		if (index > -1) {
			userDB[index] = userDB[userIndex - 1];
			userDB[userIndex - 1] = null;
			userIndex--;
		}
	}

	public boolean authenticateUser(User user) {

		int index = findUserIndex(user);

		if (index > -1) {
			String userPassword = userDB[index].getPassword();
			return (userPassword.equals(user.getPassword()));
		} else {
			return false;
		}
	}

	public UserLoginService() {

		userDB = new User[10];
		userIndex = 0;

	}

}
