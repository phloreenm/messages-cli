package model.dao;

import java.util.List;

import exceptions.MyException;
import model.entities.User;

public interface UserDAO {
	
	User createNewUser() throws MyException;  		//C.
	
	User retrieveUserList(); 						//R.
	 
	void updateUserDetails() throws MyException; 	//U.
	void changeUserRole() throws MyException;
	
	void deleteUserFromList() throws MyException; 	//D.
	
	List<User> dbUserList() throws MyException;;	//Users' List
	
}
