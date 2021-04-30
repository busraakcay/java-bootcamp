package day2hw1;

public class Main {
	public static void main(String[] args) {
		Instructor instructors1 = new Instructor(1, "Engin Demiroð");
		Instructor instructors2 = new Instructor(2, "Engin Demiroð");
		
		Instructor[] instructors = {instructors1, instructors2};
		
		for (Instructor instructor : instructors) {
			System.out.println(instructor.name);
		}
		
		Category category1 = new Category(1, "C# + ANGULAR", "Engin Demiroð");
		Category category2 = new Category(2, "JAVA + REACT", "Engin Demiroð");
		
		Category[] categories = {category1,category2};
		
		for (Category category : categories) {
			System.out.println(category.courseName);
		}
		CategoryManager categoryManager = new CategoryManager();
		categoryManager.addCourse(category1);
		categoryManager.deleteCourse(category2);
	}
}
