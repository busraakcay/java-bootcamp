package eCommerceDemo.core.concretes;

import eCommerceDemo.core.abstracts.SignUpService;
import eCommerceDemo.entities.concretes.User;
import eCommerceDemo.signUpLogger.VerificationManager;

public class SignUpManagerAdapter  implements SignUpService{

	@Override
	public void signUpToSystem(User user) {
		VerificationManager verificationManager = new VerificationManager();
		verificationManager.signUp(user.getName());		
	}

}
