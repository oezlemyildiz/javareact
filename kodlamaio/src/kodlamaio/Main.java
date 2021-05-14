package kodlamaio;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course  course = new Course(1,  "Yazılım");
		Educator educator = new Educator(1, "Engin Demirog");
		Category category= new Category(1,"Yazılım");
		Course  course1 = new Course(2,  "Yazılım");
		Educator educator1 = new Educator(2, "Mustafa Coskun");
		Category category1= new Category(2,"Yazılım");
		
		Course[] coursep = {course, course1};
		Category[] categoryp= {category, category1};
		Educator[] educatorp= {educator, educator1};

		
		CategoryManager categoryManager= new CategoryManager();
		categoryManager.multipleAdd(categoryp);
		
		CourseManager courseManager= new CourseManager();
		courseManager.mutipleAdd(coursep);
		
		
		

		
	}

}
