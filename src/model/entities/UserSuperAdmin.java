package model.entities;
/**
 * This class stands for the Administator (SuperAdmin, Admin whatever you want to call it) user role.
 * Available actions for the Administrator user are:
 *			- C.R.U.D. manage the users and any of their acccount detail (username, password, role).
 *			- C.R. messages, therefore Send and Read his messages.
 */
public class UserSuperAdmin extends UserModerator {

	public UserSuperAdmin() {
	}

	public UserSuperAdmin(int userID, String username, String password, int userRole) {
		super(userID, username, password, userRole);
	}
	

}
