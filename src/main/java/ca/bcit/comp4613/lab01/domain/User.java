package ca.bcit.comp4613.lab01.domain;

import java.util.Objects;


/**
 * Watch out for future JDK feature: 'record'
 * record User (String name);
 * 
 * 
 * @author AGHAV00
 *
 */
public class User {

	private String name;

	/**
	 * Default constructor for <jsp:useBean .../> 
	 */
	public User() {}
	
	public User(String name ) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof User)) {
			return false;
		}
		User other = (User) obj;
		return Objects.equals(name, other.name);
	}

	
	
	
	
}
