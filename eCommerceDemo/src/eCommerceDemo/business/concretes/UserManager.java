package eCommerceDemo.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eCommerceDemo.business.abstracts.UserService;
import eCommerceDemo.core.abstracts.SignUpService;
import eCommerceDemo.dataAccess.abstracts.UserDao;
import eCommerceDemo.entities.concretes.User;

public class UserManager implements UserService{
	
	private UserDao userDao;
	private SignUpService signUpService;
	
	public UserManager(SignUpService signUpService) {
		super();
		this.signUpService = signUpService;
	}

	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public boolean checkPassword(User user) {
		if(user.getPassword().length() >= 6) {
			return true;
		}else {
			return false;
		}
		
	}

	@Override
	public boolean checkEMail(User user) {
		List<String> emails = new ArrayList<String>();
		emails.add(user.getEmail());
		String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
		Pattern pattern = Pattern.compile(regex);
		 
		for(String email : emails){
		    Matcher matcher = pattern.matcher(email);
		    if(matcher.matches())
		    	return true;
		    else return false;
		}
		return true;
		
	}

	@Override
	public boolean checkNameSurname(User user) {
		if(user.getName().length() > 2 && user.getSurname().length() > 2) {
			return true;
		}else {
			return false;
		}
		
	}
	
	@Override
	public void add(User user) {
		if(checkEMail(user) == true && checkPassword(user) == true && checkNameSurname(user) == true) {
			this.userDao.signUp(user);
		}else {
			System.out.println("Try again...");
		}
	}
	
	@Override
	public void addAdapter(User user) {
		this.signUpService.signUpToSystem(user);
	}

	@Override
	public void get(User user) {
		if(checkEMail(user) == true && checkPassword(user) == true) {
			this.userDao.signIn(user);
		}else {
			System.out.println("Try again...");
		}
	}


}
