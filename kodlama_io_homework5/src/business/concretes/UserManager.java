package business.concretes;

import business.abstracts.UserService;
import core.abstracts.ValidatorService;
import core.abstracts.VerificationService;
import dataAccess.abstracts.UserDaoService;
import entities.concretes.User;

public class UserManager implements UserService {

	VerificationService verificationService;
	UserDaoService userDaoService;
	ValidatorService validatorService;

	public UserManager(VerificationService verificationService, UserDaoService userDaoService,
			ValidatorService validatorService) {

		super();
		this.verificationService = verificationService;
		this.userDaoService = userDaoService;
		this.validatorService = validatorService;
	}

	@Override
	public void register(User user) {
		if (!verificationService.isValid(user)) {
			System.out.println("Format error. Registration failed!");
		} else if (!userDaoService.checkEmail(user)) {
			System.out.println("Please enter a different e-mail address.");
		}else {
			userDaoService.add(user);
			validatorService.verificationMail();
		}

	}

	@Override
	public void login(String email, String password) {
		if(userDaoService.loginCheck(email, password)) {
			System.out.println("Login succes!");
		}else {
			System.out.println("Login failed!");
		
		}

	}

}