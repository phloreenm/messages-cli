/**
 * 
 */
package model.storage;

import java.util.List;

import controller.MenusDisplay;
//import controller.LogIn2;
import exceptions.MyException;
import model.dao.RoleDAO;
import model.dao.UserDAO;
import model.entities.User;
import tools.ConsoleInput;

/**
 * @author Phlom
 * This class implements UserDAO interface and its abstract methods,
 * which methods transact User data with the database.
 */
public class UserDAOImpl implements UserDAO{

	static User newUser;
	DBOps db_op = new DBOps(); 	//methods with the DB
	static ConsoleInput input = new ConsoleInput();  	//scanner
	static MenusDisplay menus = new MenusDisplay();
	
	
	public UserDAOImpl() {
	}
	
	@Override
	public User createNewUser() throws MyException {
		//input from Admin:
		System.out.println("Insert username: ");
		String username = input.scanner().next();
		System.out.println("Insert password: ");
		String password = input.scanner().next();
		menus.userListTypes();
		System.out.println("Insert desired user's role for user '" + username + "': ");
		int userRole = input.scanner().nextInt();
		input.scanner().close();
		
		newUser = new User(username, password, userRole);
		DBOps.createANewUser(newUser);
		System.out.println("User '" + newUser.getUsername() + "' has been succesfully created in database.");
		//return to SuperAdmin menu:
		menus.superAdminMenu();
		return newUser;
	}

	@Override
	public User retrieveUserList() {
		return null;
	}

	@Override
	public void updateUserDetails() throws MyException {

	}

	@Override
	public void changeUserRole() throws MyException {

	}

	@Override
	public void deleteUserFromList() throws MyException {

	}

	@Override
	public List<User> dbUserList() throws MyException {
		return null;
	}
	
	public List<RoleDAO> fetchUserRoleTypes(){
		return null;
		
	}

}
