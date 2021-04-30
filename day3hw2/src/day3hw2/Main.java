package day3hw2;

public class Main {

	public static void main(String[] args) {
		UserManager userManager = new UserManager();
		StudentManager studentManager = new StudentManager();
		InstructorManager instructorManager = new InstructorManager();
		
		Student userStd = new Student();
		userStd.name = "Büşra";
		userStd.surname = "Akçay";
		userStd.takenCourse = "Java + React";
		
		Instructor userIns = new Instructor();
		userIns.name = "Engin";
		userIns.surname = "Demiroğ";
		userIns.givenCourse = "Java + React";
		
		
		User[] users = {userStd, userIns};
		userManager.addMultiple(users);
		
		studentManager.addCourse(userStd);
		instructorManager.createCourse(userIns);

	}

}
