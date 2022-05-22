package controller;

import exceptions.MyException;
import model.entities.User;
import model.storage.UserDAOImpl;
import tools.ConsoleInput;

public class MenusDisplay {
	ConsoleInput input = new ConsoleInput();

	public void logInMenuDisplay() {
		 System.out.println("      __            _       _ _         ");
		 System.out.println("     / _\\ ___   ___(_) __ _| (_)_______ ");
		 System.out.println("     \\ \\ / _ \\ / __| |/ _` | | |_  / _ \\");
		 System.out.println("     _\\ \\ (_) | (__| | (_| | | |/ /  __/");
		 System.out.println("     \\__/\\___/ \\___|_|\\__,_|_|_/___\\___|");
		
		System.out.println("+------|  Welcome to SocialiseApp!  |------+");
		System.out.println("|------|   You are Log In Section   |------|");
		System.out.println("| Please insert your Username and Password:|");
		System.out.println("+------------------------------------------+");
	}	

	public void superAdminMenu() {
		System.out.println("+--------- Welcome, Super Admin ----------+");
		System.out.println("|  1. Send a message                  [C] |");
		System.out.println("|  2. Read my messages                [R] |");
		System.out.println("|                                         |");
		System.out.println("|  2. Read all users's messages       [R] |");
		System.out.println("|  3. Update from all users's message [U] |");
		System.out.println("|  4. Delete from all users's message [D] |");
		System.out.println("|                                         |");
		System.out.println("|  6. Create new user                 [C] |");
		System.out.println("|  7. View users list                 [R] |");
		System.out.println("|  8. Update an user                  [U] |");
		System.out.println("|  9. Delete an user                  [D] |");
		System.out.println("|                                         |");
		System.out.println("| 10. Log Out                             |");
		System.out.println("+-----------------------------------------+");
	}

	public void superAdminMenuSelect(int userInput) {
/*		try {
			userInput = input.scanner().nextInt();
		} catch (Exception e) {
			System.out.println("You must insert an integer to select the menu.");
			e.printStackTrace();
		}*/

		while(userInput > 0 || userInput < 10) {
			switch(userInput) {
			case 1:
				try {
					UserDAOImpl userDAOMethods = new UserDAOImpl();
					userDAOMethods.createNewUser();
				} catch (MyException e) {
					System.out.println("Something went wrong. Check the log: ");
					e.printStackTrace();
				}
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				break;
			case 8:
				break;
			case 9:
				break;
/*			case 10:
				LogIn login = new LogIn();
				@SuppressWarnings("unused") User loggedUser = login.selectUser(login.userCredentials());
				break;*/
				//default:
				//superAdminMenu();
			}
		}

	}

	public void moderatorMenu() {
		System.out.println("+---------- Welcome, Moderator! ----------+");
		System.out.println("|Please choose your option from the menu: |");
		System.out.println("|  0. View my unread messages OPT         |");
		System.out.println("|  1. Send a message   [C] OPT            |");
		System.out.println("|  2. Read my messages [R] OPT            |");
		System.out.println("|  3. Update a message [U]                |");
		System.out.println("|  4. Delete a message [D]                |");
		System.out.println("|  5. View all user's messages            |");
		System.out.println("|  6. Edit user's messages                |");
		System.out.println("|  7. Delete messages from users          |");
		System.out.println("|  5. Log Out                             |");
		System.out.println("+-----------------------------------------+");
	}

	public void editorMenu() {
		System.out.println("+--------- Welcome, user Editor! ---------+");
		System.out.println("|Please choose your option from the menu: |");
		System.out.println("|  0. View my unread messages OPT         |");
		System.out.println("|  1. Send a message   [C] OPT            |");
		System.out.println("|  2. Read my messages [R]                |");
		System.out.println("|  3. Update a message [U]                |");
		System.out.println("|  4. View all user's messages            |");
		System.out.println("|  5. Edit user's messages                |");
		System.out.println("|  5. Log Out                             |");
		System.out.println("+-----------------------------------------+");
	}

	public void userMenu() {
		System.out.println("+------------ Welcome, User! -------------+");
		System.out.println("|Please choose your option from the menu: |");
		System.out.println("|  1. Send a message            [C]       |");
		System.out.println("|  0. View my unread messages   [R]       |");
		System.out.println("|  2. Read my messages          [R]       |");
		System.out.println("|  3. View all user's messages            |");
		System.out.println("|  5. Log Out                             |");
		System.out.println("+-----------------------------------------+");
	}

	public void reportingMenu() {
		System.out.println("+------------ Welcome, User! -------------+");
		System.out.println("|Please choose your option from the menu: |");
		System.out.println("|  0. Retrieve all messages               |");
		System.out.println("|  1. Report a message by message ID      |");
		System.out.println("|  5. Log Out                             |");
		System.out.println("+-----------------------------------------+");
	}

	public void userListTypes() {
		System.out.println("+--------- Welcome, Super Admin! ---------+");
		System.out.println("|  Please select what kind of user        |");
		System.out.println("|   you want to create:                   |");
		System.out.println("|      1. Moderator         [R.U.D. data] |");
		System.out.println("|      2. Editor            [R.U. data]   |");
		System.out.println("|      3. Editor            [R. all data] |");
		System.out.println("|      4. Simple User       [R. data]     |");
		System.out.println("|      5. Return to preview menu          |");
		System.out.println("|      6. Log Out                         |");
		System.out.println("+-----------------------------------------+");
	}
	//TEMPLATE:
	/*	public static void moderatorMenu() {
		//moderator = 'R.U.D. data'
		System.out.println("+--------- Welcome, Super Admin ----------+");
		System.out.println("|Please choose your option from the menu: |");
		System.out.println("|  0. View my unread messages             |");
		System.out.println("|  1. Send a message   [C]                |");
		System.out.println("|  2. Read my messages [R]                |");
		System.out.println("|  3. Update a message [U]                |");
		System.out.println("|  4. Delete a message [D]                |");
		System.out.println("|  5. View all user's messages            |");
		System.out.println("|  6. Edit user's messages                |");
		System.out.println("|  7. Delete messages from users          |");
		System.out.println("|  8. Create new user  [C]                |");
		System.out.println("|  9. View users list  [R]                |");
		System.out.println("| 10. Update an user   [U]                |");
		System.out.println("| 11. Delete an user   [D]                |");
		System.out.println("+-----------------------------------------+");
		//System.out.print("Insert here: ");
	}*/
	 //ASCII code Source: http://patorjk.com/software/taag/#p=testall&h=2&v=0&f=Big&t=Socialize
	/*		  __            _       _ _         
			 / _\ ___   ___(_) __ _| (_)_______ 
			 \ \ / _ \ / __| |/ _` | | |_  / _ \
			 _\ \ (_) | (__| | (_| | | |/ /  __/
			 \__/\___/ \___|_|\__,_|_|_/___\___|
	*/

}
