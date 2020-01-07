package com.revature.driver;

import java.util.Scanner;

import com.revature.pojo.User;
import com.revature.service.AdminLoginService;
import com.revature.service.UserLoginService;

public class LoginDriver {

	private static UserLoginService uls = new UserLoginService();

	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {

		String option = "";


		do {
			System.out.println("What would you like to do?");
			System.out.println("[1] Register User");
			System.out.println("[2] Login");
			System.out.println("[3] Delete User");
			System.out.println("[4] Exit");
			System.out.println("[5] Admin features");

			option = scan.nextLine();
			performUserAction(option);
		} while (!"4".equals(option));

	}

	private static void performUserAction(String option) {

		switch (option) {
		case "1":
			User user = getUserInfo();
			uls.registerUser(user.getUsername(), user.getPassword());
			break;
		case "2":
			 if (((UserLoginService)uls).authenticateUser(getUserInfo())) {
				System.out.println("success"); 
			 } else {
				 System.out.println("failure");
			 }
			break;
		case "3":
			uls.removeUser(getUserInfo());
			System.out.println("successfully removed user");
			break;
		case "4":
			System.out.println("goodbye");
			break;
		case "5":
			uls = new AdminLoginService();
			System.out.println("You are now an admin");
			System.out.println("Do you want to delete all users?");
			if (scan.nextLine().equals("yes")) {
				((AdminLoginService)uls).deleteAllUsers();
			}
			break;
		default:
			System.out.println("did not understand input");
			break;

		}
	}
	
	private static User getUserInfo() {
		User user = new User();
		System.out.println("Enter username:");
		user.setUsername(scan.nextLine());
		System.out.println("Enter password");
		user.setPassword(scan.nextLine());
		return user;
	}

}
