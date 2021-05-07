package core.concretes;

import java.util.regex.Pattern;

import core.abstracts.VerificationService;
import entities.concretes.User;

public class VerificationManager implements VerificationService {
	public boolean isValidEmail(String email) {
		String regexEmail = "^(.+)@(.+)$";

		Pattern pattern = Pattern.compile(regexEmail);

		if (email == null) {
			return false;
		}
		return pattern.matcher(regexEmail).matches();
	}

	public boolean isValidPassword(String password) {
		if (password == null || password.length() <= 6) {
			return false;
		}
		return true;
	}

	public boolean isValidName(String name) {
		if (name == null || name.length() <= 2) {
			return false;
		}
		

		return true;
	}

	@Override
	public boolean isValid(User user) {

		if (!isValidEmail(user.geteMail())) {
			System.out.println("Error! e-mail format is wrong");
			return false;
		}

		if (!isValidName(user.getFirstName())) {
			System.out.println("Error! the name is not long enough.");
			return false;
		}

		if (!isValidName(user.getLastName())) {
			System.out.println("Error! the surname is not long enough");
			return false;
		}

		if (!isValidPassword(user.getPassword())) {
			System.out.println("Password must be at least 6 characters!");
			return false;
		}
			return true;
	}
}
