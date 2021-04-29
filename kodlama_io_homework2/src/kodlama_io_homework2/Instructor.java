package kodlama_io_homework2;

public class Instructor extends User {
	
	private String instructorId;

	public Instructor() 
	{
		
	}

	public Instructor(String instructorId) {
		super();
		this.instructorId = instructorId;
	}

	public String getInstructorId() {
		return instructorId;
	}

	public void setInstructorId(String instructorId) {
		this.instructorId = instructorId;
	}
	

	
	
}
