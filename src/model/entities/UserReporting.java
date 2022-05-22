package model.entities;

/**
 * This class stands for the Reporting user role.
 * Available actions for the Reporter user are:
 *			- R. all messages of the application, with the scope of super-vising and reporting
 *			- C.R. messages, therefore Send and Read his messages.
 */
public class UserReporting extends User {

	public UserReporting() {
	}

	public UserReporting(int userID, String username, String password, int userRole) {
		super(userID, username, password, userRole);
	}

}
