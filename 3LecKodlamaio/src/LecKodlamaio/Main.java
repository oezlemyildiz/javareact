package LecKodlamaio;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		User user = new User(1,"1","bla@gmail.com","123");
		Student student = new Student(1,"1","Elif","Yıldız","Java");
		Instructor instructor = new Instructor(1,"2","Engin","Demir","Java");
		
		UserManager userManager= new UserManager();
		StudentManager studentManager= new StudentManager();
		InstructorManager instructorManager = new InstructorManager();
		
		userManager.add(user);
		studentManager.add(student);
		instructorManager.add(instructor);
		

	}

}
