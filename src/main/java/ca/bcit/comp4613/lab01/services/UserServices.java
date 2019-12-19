package ca.bcit.comp4613.lab01.services;

import java.time.LocalDateTime;

import ca.bcit.comp4613.lab01.domain.User;

public interface UserServices {

	boolean save(User user, LocalDateTime timestamp );
	
}
