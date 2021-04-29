package kodlama_io_homework2;

public class UserManager 
{
	public void addUser(User user)
	{
		System.out.println("User added : "+user.getName()+" "+user.getSurname());
	}
	
	public void deleteUser(User user)
	{
		System.out.println("User deleted : "+user.getName()+" "+user.getSurname());
	}
}
