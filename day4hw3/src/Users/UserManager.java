package Users;

import Interfaces.UserService;

public class UserManager  implements UserService{

	@Override
	public void signUp(User user) {
		if(UserValidator.isValid(user)) {
		System.out.println(user.getName() + " signed up.");
		}else {
			System.out.println("Ensure that your information is correct");
		}
	}

	@Override
	public void updateAccount(User user) {
		System.out.println(user.getName() + " your account has been updated.");
		
	}

	@Override
	public void deleteAccount(User user) {
		System.out.println(user.getName() + " your account has been deleted.");
		
	}
}
