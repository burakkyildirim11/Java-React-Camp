package kodlama_io_homework2;

public class Main {

	public static void main(String[] args) {
		
		Instructor instructor1 = new Instructor();
		instructor1.setName("Engin");
		instructor1.setSurname("Demirog");
		instructor1.setInstructorId("0");
		instructor1.setPassword("engindemirog");
		instructor1.setEmail("engindemirog@gmail.com");
		
		String [] instructorCourse = {"C#","Java","Python","C"};
		instructor1.setCourses(instructorCourse);
		
		System.out.println("Course Contents: ");
		for (String course : instructorCourse) {
			System.out.println(course);
		}
		System.out.println("--------------------------------------");
		
		Student student1 = new Student();
		student1.setName("Burak");
		student1.setSurname("Yildirim");
		student1.setStudentNumber("123");
		student1.setPassword("123456789");
		student1.setEmail("student1@gmail.com");
		
		String [] studentCourse = {"C#","Java"};
		student1.setCourses(studentCourse);
		
		
		InstructorManager instructorManager1 = new InstructorManager();
		instructorManager1.addUser(instructor1);
		instructorManager1.startNewCourse("Assembly");
		
		StudentManager studentManager1 = new StudentManager();
		studentManager1.addUser(student1);
		studentManager1.signUpNewCourse("Java");
		
		

	}

}
