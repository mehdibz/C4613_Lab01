package ca.bcit.comp4613.lab01.data;

import java.time.LocalDateTime;

import ca.bcit.comp4613.lab01.domain.User;

public interface UserDao {

	boolean save(User userName, LocalDateTime timestamp);
}
