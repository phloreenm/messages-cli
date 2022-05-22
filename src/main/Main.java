package main;

//import java.sql.Timestamp;
//import java.util.Date;

import controller.LogIn;
import controller.MenusDisplay;
//import model.entities.Message;
import model.entities.User;
import model.entities.UserEditor;
import model.entities.UserModerator;
import model.entities.UserReporting;
import model.entities.UserSuperAdmin;
//import model.storage.DB_Ops;
//import tools.MessageLogger;
import tools.ConsoleInput;

/**
 * @author      Florin Mărăcine <florinmaracine@yahoo.com>
 * @version     2.0
 */

public class Main {
	

	public static void main(String [] args) {
		//VERSION 2 cu metode separate pt ResultSet & User creation & Menu selection:
		LogIn login = new LogIn();
		User loggedUser = login.selectUser(login.userCredentials());
		
		
		
		
		
		
		
		
		/*MenusDisplay menus = new MenusDisplay();
		//ConsoleInput input = new ConsoleInput();
		
		int role = 0;
		try {
			role = loggedUser.getUserRole();
		} catch (Exception e1) {
			System.out.println("Can't get user role.");
			e1.printStackTrace();
		} 
			
		if(role == 1) {
			menus.superAdminMenu();
		}else if(role == 2) { //moderator = 'R.U.D. data'
			menus.moderatorMenu();
		}else if(role == 3) { //editor = 'R.U. view and edit data'
			menus.editorMenu();
		}else if(role == 4) { //user = 'R. view transacted data'
			menus.userMenu();
		}else if(role == 5) { //user = 'R. view transacted data'
			menus.reportingMenu();
		}else {
			System.out.println("\nSomething went wrong.\nAPPLICATION ENDED\n");
		}*/
		//menus.superAdminMenuSelect(role);
		
		
/*		System.out.println("Insert here: ");
		int menuSel = input.anInteger();
		switch(menuSel) {
		case 1:
			
			//menus.superAdminMenuSelect();
			break;
		case 2:
			break;
		}*/
		
		
		try {
			System.out.println("\nPrinting as a test the logged in user details: \n" + loggedUser.toString());
		} catch (Exception e) {
			System.out.println("Can't fetch logged user's details. Maybe logIn failed. This is only a check in Main.");
			//e.printStackTrace();
		}
		
		//close all JDBC connections (Connection, Prepared Statement, ResultSet):
		//DB_Ops.closeAllDbConn();
		
/*		//TEST the logging of sent messages:
		User user1 = new User("user2", "1234", 6);
		User user2 = new User("user4", "0123", 2);
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        String msgBody = "This is the message body of another random for testing purposes message.";
		Message msg1 = new Message(1, user1, user2, timestamp, msgBody);
		MessageLogger logger = new MessageLogger();
		logger.logTheMessage(msg1);
		*/
		
		//VERSION 1 - it WORKED with LogIn v1
		/*LogIn login = new LogIn();
		User loggedUser = login.userCredentials();
		System.out.println("Printing as a test the logged in user details: \n" + loggedUser.toString());
		*/
		
	}
}
