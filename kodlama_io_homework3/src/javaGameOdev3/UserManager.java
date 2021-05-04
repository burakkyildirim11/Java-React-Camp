package javaGameOdev3;

public class UserManager implements UserService {

	@Override
	public void addUser(User user) {
		
		System.out.println(user.getFirstName()+" added successfully!");
		
	}

	@Override
	public void deleteUser(User user) {
		
		System.out.println(user.getFirstName()+" deleted successfully!");
		
	}

	@Override
	public void updateUser(User user) {
		
		System.out.println(user.getFirstName()+" updated successfully!");
		
	}

	
	
	
	
}
