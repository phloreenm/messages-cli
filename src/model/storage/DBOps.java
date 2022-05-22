package model.storage;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.entities.User;

public class DBOps {
	
	private static JDBCConnection db;
	private static PreparedStatement pstmt;
	private static ResultSet rs;
	
	
	public DBOps() {
	}
	
	//method to close JDBC Connection, PreparementStatement and ResultSet:
	public static void closeAllDbConn() {
		try { 
			  if (rs != null) {
				rs.close();
			} if (pstmt != null) {
				pstmt.close();
			} if (db.connectToDB() != null) {
				db.connectToDB().close();
			}
		} catch (Exception e) {
			System.out.println("Couldn't close the JDBC Connection, the Preparement Statement or the Result Set. Check error log: ");
			e.printStackTrace();
		}
	}
	//===UserDAOImpl related methods - these exchange data directly with the DB===========================================//
	//CREATE USER:
	public static  void createANewUser(User newUser) {
		int userRole = newUser.getUserRole();
		String username = newUser.getUsername();
		String password = newUser.getPassword();
		String createNewUserQuery = "INSERT INTO users(u_role_id, user_name, user_password) VALUES(?,?,?);";
		try {
			pstmt = db.connectToDB().prepareStatement(createNewUserQuery);
			pstmt.setInt(1, userRole);
			pstmt.setString(2, username);
			pstmt.setString(3, password);
		} catch (SQLException e) {
			System.out.println("Can't process the Prepared Statement");
			e.printStackTrace();
		}
	}
	//RETRIEVE USER:
	
	//UPDATE USER:
	
	//DELETE USER:
	
	
	//===MessageDAOImpl related methods - these exchange data directly with the DB===========================================//
	
	//CREATE MESSAGE:
	
	//RETRIEVE MESSAGE:
	
	//UPDATE MESSAGE:
	
	//DELETE MESSAGE:
	

}
