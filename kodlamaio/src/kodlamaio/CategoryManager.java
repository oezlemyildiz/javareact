package kodlamaio;

public class CategoryManager {
	
	public void add (Category category) {
		System.out.println(category.id + " kaydedildi");
	}
	
	public void multipleAdd (Category[] categorys) {
		
		for(Category category : categorys) {
			add(category);
			
		}
	}

}
