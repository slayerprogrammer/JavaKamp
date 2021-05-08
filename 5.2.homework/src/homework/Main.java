package homework;

import homework.business.abstracts.AuthService;
import homework.business.abstracts.UserActivationService;
import homework.business.abstracts.UserCheckService;
import homework.business.abstracts.UserService;
import homework.business.abstracts.UserValidationService;
import homework.business.concretes.AuthManager;
import homework.business.concretes.UserActivationManager;
import homework.business.concretes.UserCheckManager;
import homework.business.concretes.UserManager;
import homework.business.concretes.UserValidationManager;
import homework.core.utils.mail.CustomMailManager;
import homework.core.utils.mail.MailService;
import homework.core.utils.security.signUp.googleSignUp.GoogleSignUpManagerAdapter;
import homework.dataAccess.abstracts.UserActivationDao;
import homework.dataAccess.abstracts.UserDao;
import homework.dataAccess.concretes.inMemory.InMemoryUserActivationDao;
import homework.dataAccess.concretes.inMemory.InMemoryUserDao;
import homework.entity.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		UserDao userDao = new InMemoryUserDao();
		UserValidationService userValidationService = new UserValidationManager();
		UserCheckService userCheckService = new UserCheckManager(userDao);
		
		UserActivationDao userActivationDao = new InMemoryUserActivationDao();
		MailService mailService = new CustomMailManager();	
		UserActivationService userActivationService = new UserActivationManager(userDao, userActivationDao, mailService);
		
		UserService userService = new UserManager(userDao, userValidationService, userCheckService, userActivationService);
		
		User user = new User
				(1,
				"Tolgahan",
				"Öztürk",
				"tolgahanozturk0635@gmail.com",
				"asdas123456!!"
				);
		
		AuthService authService = new AuthManager(userDao, new GoogleSignUpManagerAdapter(userService));
		authService.register(user);
		
		userActivationService.check("1g345abc-a2e1-48db-b250-cf560a845e22");

		authService.login("tolgahanozturk0635@gmail.com", "asdas123456!!");

	}

}
