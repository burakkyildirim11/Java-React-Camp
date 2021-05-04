package javaGameOdev3;

public class UserVerify {
	public static boolean isOk(User user)
	{
		if(!user.getFirstName().isEmpty() && !user.getLastName().isEmpty() && user.getAge()>0)
		{
			return true;
		}
		else
		{
			System.out.println("Error! Please check the information.");
			return false;
		}
		
		
	}
}
