package ca.bcit.comp4613.lab01.services;

import java.time.LocalDateTime;

import ca.bcit.comp4613.lab01.data.UserDao;
import ca.bcit.comp4613.lab01.data.UserDaoImpl;
import ca.bcit.comp4613.lab01.domain.User;

public class UserServicesImpl implements UserServices {
	
	
	
	@Override
	public boolean save(User user, LocalDateTime timestamp) {
		UserDao dao = new UserDaoImpl();
		return dao.save(user, timestamp);
	}

}
