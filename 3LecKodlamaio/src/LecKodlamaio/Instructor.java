package LecKodlamaio;

public class Instructor extends User{
	int id;
	String userNumber;
	String firstName;
	String lastName;
	String Course;
	
	public Instructor() {
		
	}
	
	public Instructor(int id, String userNumber, String firstName, String lastName, String course) {
		super();
		this.id = id;
		this.userNumber = userNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		Course = course;
	}

}
