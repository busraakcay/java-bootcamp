package eCommerceDemo;

import eCommerceDemo.business.abstracts.UserService;
import eCommerceDemo.business.concretes.UserManager;
import eCommerceDemo.core.concretes.SignUpManagerAdapter;
import eCommerceDemo.dataAccess.concretes.HibernateUserDao;
import eCommerceDemo.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user = new User(1, "Busra", "Akcay", "1234567", "busra@akcay.com");
		UserService userService = new UserManager(new SignUpManagerAdapter());
		userService.addAdapter(user);
		
		UserService userSignIn = new UserManager(new HibernateUserDao());
		userSignIn.get(user);
	}

}
