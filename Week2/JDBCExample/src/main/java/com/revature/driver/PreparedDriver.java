package com.revature.driver;

import java.util.Scanner;

import com.revature.dao.UserDAO;
import com.revature.pojo.User;

public class PreparedDriver {

	private static UserDAO uDao = new UserDAO();

	public static void main(String[] args) {
		System.out.println("Do you want to login or change password");

		Scanner sc = new Scanner(System.in);

		String answer = sc.nextLine();

		if ("login".equals(answer)) {
			System.out.println("enter username: ");
			String username = sc.nextLine();
			System.out.println("enter password: ");
			String password = sc.nextLine();
			User user = uDao.getUserByUsername(username);
			if (user.getPassword().equals(password)) {
				System.out.println("Success");
			} else {
				System.out.println("Failure");
			}
		} else if ("change".equals(answer)) {

			System.out.println("enter username: ");
			String username = sc.nextLine();
			System.out.println("Enter new password");
			String newPass = sc.nextLine();
			uDao.preparedUpdatePassword(new User(-1, username, newPass));

		}

	}

}
