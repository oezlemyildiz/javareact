package LecKodlamaio;

public class Student extends User {
	int id;
	String userNumber;
	String firstName;
	String lastName;
	String registeredCourse;
	
	public Student() {
		
	}
	
	public Student(int id, String userNumber, String firstName, String lastName, String registeredCourse) {
		super();
		this.id = id;
		this.userNumber = userNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.registeredCourse = registeredCourse;
	}

}
