package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.UserDaoService;
import entities.concretes.User;

public class UserDao implements UserDaoService {

	List<User> users = new ArrayList<>();

	@Override
	public void add(User user) {

		users.add(user);
		System.out.println("User "+user.getFirstName().toUpperCase() + " " + user.getLastName().toUpperCase()
				+ " has been registered.");

	}

	@Override
	public boolean checkEmail(User user) {
		for (User u : users) {
			if (u.geteMail() == user.geteMail()) {
				return false;
			}

		}
		return true;
	}

	@Override
	public boolean loginCheck(String email, String password) {
		for (User user : users) {
			if (user.geteMail() == email && user.getPassword() == password) {
				return true;
			}
		}
		return false;
	}

}