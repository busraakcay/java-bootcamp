package day2hw1;

public class Main {
	public static void main(String[] args) {
		Instructor instructors1 = new Instructor(1, "Engin Demiro�");
		Instructor instructors2 = new Instructor(2, "Engin Demiro�");
		
		Instructor[] instructors = {instructors1, instructors2};
		
		for (Instructor instructor : instructors) {
			System.out.println(instructor.name);
		}
		
		Category category1 = new Category(1, "C# + ANGULAR", "Engin Demiro�");
		Category category2 = new Category(2, "JAVA + REACT", "Engin Demiro�");
		
		Category[] categories = {category1,category2};
		
		for (Category category : categories) {
			System.out.println(category.courseName);
		}
		CategoryManager categoryManager = new CategoryManager();
		categoryManager.addCourse(category1);
		categoryManager.deleteCourse(category2);
	}
}
