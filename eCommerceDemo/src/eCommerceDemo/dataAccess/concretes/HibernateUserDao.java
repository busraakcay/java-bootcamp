package eCommerceDemo.dataAccess.concretes;

import eCommerceDemo.dataAccess.abstracts.UserDao;
import eCommerceDemo.entities.concretes.User;

public class HibernateUserDao implements UserDao{

	@Override
	public void signUp(User user) {
		System.out.println("Verification is successfully completed. Welcome " + user.getName());
		
	}

	@Override
	public void signIn(User user) {
		System.out.println(user.getName() + ", you are signed in");
	}

}
