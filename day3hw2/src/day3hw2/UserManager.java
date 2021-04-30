package day3hw2;

public class UserManager {
	public void add(User user) {
		System.out.println(user.name + " " + user.surname + " registered.");
	}
	
	public void addMultiple(User[] users) {
		for(User user : users) {
			add(user);
		}
	}
	
	public void delete(User user) {
		System.out.println(user.name + " " + user.surname + " deleted.");
	}
}
