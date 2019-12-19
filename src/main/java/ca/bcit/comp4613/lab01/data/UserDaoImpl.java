package ca.bcit.comp4613.lab01.data;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ca.bcit.comp4613.lab01.domain.User;
import ca.bcit.comp4613.lab01.services.UserServicesImpl;

public class UserDaoImpl implements UserDao {
	
	private static Logger logger = LogManager.getLogger(UserServicesImpl.class.getName());
	@Override
	public boolean save(User userName, LocalDateTime timestamp) {
		logger.info("User: " + userName.getName() + " Timestamp: " + timestamp.format( DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")) );
		return true;
	}

}
