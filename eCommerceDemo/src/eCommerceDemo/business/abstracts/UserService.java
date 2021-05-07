package eCommerceDemo.business.abstracts;

import eCommerceDemo.entities.concretes.User;

public interface UserService {
	boolean checkPassword(User user);
	boolean checkEMail(User user);
	boolean checkNameSurname(User user);
	void add(User user);
	void addAdapter(User user);
	void get(User user);
}
