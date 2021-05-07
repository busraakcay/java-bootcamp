package eCommerceDemo.dataAccess.abstracts;

import eCommerceDemo.entities.concretes.User;

public interface UserDao {
	void signUp(User user);
	void signIn(User user);
}
