package model.entities;
/**
 * This class stands for the Moderator user role.
 * Main scope of this user is to provide moderating over messages sent inside the application.
 * Available actions for the Administrator user are:
 * 			- R.U.D. all messages sent in this application.
 *			- C.R. messages, therefore it can Send and Read his messages.
 */
public class UserModerator extends UserEditor {

	public UserModerator() {
	}

	public UserModerator(int userID, String username, String password, int userRole) {
		super(userID, username, password, userRole);
	}
	

}
