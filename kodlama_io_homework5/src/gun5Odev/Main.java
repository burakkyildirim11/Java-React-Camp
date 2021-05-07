package gun5Odev;

import business.abstracts.UserService;
import business.concretes.UserManager;
import core.concretes.GoogleVerificationAdapter;
import core.concretes.ValidatorManager;
import core.concretes.VerificationManager;
import dataAccess.concretes.UserDao;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user1 = new User("Burak", "Yildirim", "burak@mail.com", "111111111");
		User user2 = new User("Ahmet", "Mehmet", "ahmet@mail.com", "222222222");
		User user3= new User("Ali", "Veli", "ali@mail.com", "333333333");
		
		UserService service =new UserManager(new VerificationManager(),new UserDao(),new ValidatorManager());

		System.out.println("**************************");
		System.out.println("Registration completed successfully!");
		System.out.println("**************************");
		service.register(user1);
		System.out.println("**************************");
		service.login(user1.geteMail(), user1.getPassword());
		System.out.println("**************************");
		
		System.out.println("**************************");
		System.out.println("Registration failed!");
		System.out.println("**************************");
		service.register(user2);
		System.out.println("**************************");
		service.login(user2.geteMail(), user2.getPassword());
		System.out.println("**************************");
		
		UserService service2= new UserManager(new GoogleVerificationAdapter(), new UserDao(), new ValidatorManager());
		
		System.out.println("**************************");
		System.out.println("Registration completed successfully with Google!");
		System.out.println("**************************");
		service2.register(user3);
		System.out.println("**************************");
		service2.login(user3.geteMail(), user3.getPassword());
		System.out.println("**************************");

	}

}
