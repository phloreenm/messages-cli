package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.entities.User;
import model.entities.UserEditor;
import model.entities.UserModerator;
import model.entities.UserReporting;
import model.entities.UserSuperAdmin;
import model.storage.JDBCConnection;
import tools.ConsoleInput;

public class LogIn {
	ConsoleInput input = new ConsoleInput();
	MenusDisplay menus = new MenusDisplay();
	JDBCConnection db = new JDBCConnection();

	public LogIn() {
	}
	//methhods to check the credentials the user's input and check them in database. 
	//If succesfull, then user is Logged In.
	public ResultSet userCredentials() {
		//Take input from user:
		menus.logInMenuDisplay();
		System.out.println("Enter your username: ");
		String username = input.aString();
		System.out.println("Enter your password: ");
		String password = input.aString();
		input.scanner().close();
		// Create SQL Query/PreparedStatement:
		PreparedStatement pstmt = null;
		ResultSet  rs = null;
		try {
			String SQLQuery = "SELECT users.u_id, user_name, user_password, user_roles.u_role, user_roles.role_name, date_created "
					+ "FROM users INNER JOIN user_roles "
					+ "ON users.u_role_id = user_roles.role_id "
					+ "WHERE users.user_name = ? "
					+ "AND users.user_password = ?";
			//sending and compiling the SQLQuery statement;
			pstmt = db.connectToDB().prepareStatement(SQLQuery);
			pstmt.setString(1,username);
			pstmt.setString(2,password);
			//ResultSet:
			/* NOTES:
			 * 		executeQuery = method execute statements that returns a result set by fetching some data from the database. 
			 * It executes only SELECT statements.
			 * 
			 * 		executeUpdate = method execute sql statements that INSERT/UPDATE/DELETE data at the database. 
			 * This method return int value representing number of records affected; 
			 * Returns 0 if the query returns nothing. The method accepts only non-select statements.*/
			rs = pstmt.executeQuery();
			/*		There is no need for further checks for the user log in, because I used PreparedStatement
			 * 	which it makes anyway a PRE-COMPILING of the SQLQuery. If it's succesful, then the user and the password
			 * 	match the database data so the user is "logged in". If the PRE-COMPILING fails, then the LogIn isn't 
			 * 	sucessful.
			 */
		}catch(SQLException e) {
			System.out.println("There is an error in your sql query or somewhere else in your code.\nThis error had place in Class LogIn, method userCredentials()");
			e.printStackTrace();
		}/*finally {
			try { 
				  if (rs != null) {
					rs.close();
				} if (pstmt != null) {
					pstmt.close();
				} if (db.connectToDB() != null) {
					db.connectToDB().close();
				}
			} catch (Exception e) {
				System.out.println("Couldn't close the Preparement Statement  ");
				e.printStackTrace();
			}
			}*/
		return rs;
	}

	public User selectUser(ResultSet rs) {
		User aNewUser = null;
		String dbUN = "";
		String dbPW = "";
		int dbUID = 0;
		int dbRole = 0;
		try {
			if(rs.next()) {
				dbUID = rs.getInt("u_id");
				dbUN = rs.getString("user_name");
				dbPW = rs.getString("user_password");
				dbRole = rs.getInt("u_role");
				
				System.out.println("\nUser \'" + dbUN + "\' have been successfully logged in!");
			} else {
				System.out.println("\nLogin failed! Check your credentials and try again.");
			}
		} catch (SQLException e) {
			System.out.println("Can't process the ResultSet.");
			e.printStackTrace();
		}

		//Creating the new user object depending on the object's user_role(dbRole variable)
		if(dbRole == 1) {
			aNewUser = new UserSuperAdmin(dbUID, dbUN, dbPW, dbRole);
			//menus.superAdminMenu();
		}else if(dbRole == 2) { //moderator = 'R.U.D. data'
			aNewUser = new UserModerator(dbUID, dbUN, dbPW, dbRole);
			//menus.moderatorMenu();
		}else if(dbRole == 3) { //editor = 'R.U. view and edit data'
			aNewUser = new UserEditor(dbUID, dbUN, dbPW, dbRole);
			//menus.editorMenu();
		}else if(dbRole == 4) { //user = 'R. view transacted data'
			aNewUser = new User(dbUID, dbUN, dbPW, dbRole);
			//menus.userMenu();
		}else if(dbRole == 5) { //user = 'R. view transacted data'
			aNewUser = new UserReporting(dbUID, dbUN, dbPW, dbRole);
			//menus.reportingMenu();
		}else {
			System.out.println("Something went wrong. User's role couldn't be recognised.\nAPPLICATION ENDED\n");
		}
		//TEST CHECKS:
		//System.out.println("\n1. Test print the user\'s state: \n" + aNewUser.toString() + );
		//System.out.println("2.Test print the user\'s class: \n" + aNewUser.getClass() + "\n");

		return aNewUser;
	}
}

