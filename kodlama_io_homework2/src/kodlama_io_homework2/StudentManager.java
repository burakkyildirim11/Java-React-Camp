package kodlama_io_homework2;

public class StudentManager extends UserManager 
{
	@Override
	public void addUser(User user)
	{
		System.out.println("User added (Student) : "+user.getName()+" "+user.getSurname());
	}
	
	@Override
	public void deleteUser(User user)
	{
		System.out.println("User deleted (Student) : "+user.getName()+" "+user.getSurname());
	}
	
	public void signUpNewCourse(String course)
	{
		System.out.println("Enrolled in a new course : "+course);
	}
}
