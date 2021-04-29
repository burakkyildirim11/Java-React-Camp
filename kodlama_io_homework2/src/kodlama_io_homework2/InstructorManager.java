package kodlama_io_homework2;

public class InstructorManager extends UserManager {
	
	@Override
	public void addUser(User user)
	{
		System.out.println("User added (Instructor) : "+user.getName()+" "+user.getSurname());
	}
	
	@Override
	public void deleteUser(User user)
	{
		System.out.println("User deleted (Instructor) : "+user.getName()+" "+user.getSurname());
	}
	
	public void startNewCourse(String newCourse)
	{
		System.out.println("New course started : "+newCourse);
	}

}
