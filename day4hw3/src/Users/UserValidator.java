package Users;


public class UserValidator {
	public static boolean isValid(User user) {
		if(user.id != 0 && !user.nationalId.isEmpty() && !user.name.isEmpty() && !user.surname.isEmpty() && !user.birthDate.isEmpty()) {
			return true;
		}else {
			return false;
		}
	}
	
}
