package day2hw1;

public class CategoryManager {
	public void addCourse(Category category) {
		System.out.println("Added Course: " + category.courseName);
	}
	public void deleteCourse(Category category) {
		System.out.println("Deleted Course: " + category.courseName);
	}
}
