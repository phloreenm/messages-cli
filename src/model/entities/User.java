package model.entities;


/**
 * This is super-class user, which contains the fields, G&S and the Constructors needed to create and work with 
 * users of any of the sub-types (from sub-classes).
 * 		- UserSuperAdmin extends UserModerator
 * 		- UserModerator extends UserEditor
 * 		- UserEditor extends User
 * 		-  UserReporting extends User
 * Each user is able to exchange messages with any other existent user. 
 * Therefore User class will represent the most basic user. 
 * Available actions for a simple User are:
 * 			- Create and Read received messages;
 */


public class User{

	private int userID;
	private String username;
	private String password;
	private int userRole;

	public User() {
	}

	public User(int userID, String username, String password, int userRole) {
		super();
		this.userID = userID;
		this.username = username;
		this.password = password;
		this.userRole = userRole;
	}
		
	public User(String username, String password, int userRole) {
		super();
		this.username = username;
		this.password = password;
		this.userRole = userRole;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getUserRole() {
		return userRole;
	}

	public void setUserRole(int userRole) {
		this.userRole = userRole;
	}

	@Override
	public String toString() {
		return "User " + this.username+ " [userID=" + userID + ", username=" + username + ", password=" + password + ", userRole="
				+ userRole + "]";
	}

}
