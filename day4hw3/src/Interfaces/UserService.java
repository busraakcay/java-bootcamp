package Interfaces;

import Users.User;

public interface UserService {
	void signUp(User user);
	void updateAccount(User user);
	void deleteAccount(User user);
}
