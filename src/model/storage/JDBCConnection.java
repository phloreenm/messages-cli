package model.storage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Statement;



public class JDBCConnection {

	Connection conn = null;
	PreparedStatement pstmt = null;
	
	public JDBCConnection() {
		super();
	}
	
	/*//=====================================================================//
	//SINGLETON pattern used so that only one instance of the Connector to the DB exists:
	private Database new_instance = new Database();
	private Database() {
	}
	public Database getInstance() {
		if(new_instance == null) {
			new_instance = new Database();
		}
		return new_instance;
	}
	//END of Singleton
	//=====================================================================//
	 */	
	
	
	public Connection connectToDB() {	
		final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
		String serverUrl = System.getenv("QNAP-NAS-ADDRESS");
		final String DB_URL = "jdbc:mysql://" + serverUrl + ":3306/";
		final String DB = "my_mess_app";
		final String DB_UN =  System.getenv("QNAP-MYSQL-UN");
		final String DB_PW =  System.getenv("QNAP-MYSQL-PW");
		try {
			//System.out.println("Test 1.");
			Class.forName(JDBC_DRIVER);
			//System.out.println("Test 2.");
			System.out.println("Establishing a database connection with the server...");
			//System.out.println("Test 3.");
			conn = DriverManager.getConnection(DB_URL + DB, DB_UN, DB_PW);
			if(conn != null) {
				System.out.println("Connected to the database.");
			}
			else
				System.out.println("");
			return conn;
		} catch (SQLException e) {
			System.out.println("Can't connect to the database server. Check your settings!");
			System.out.println("An SQLException occured.Read the error log.");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("A ClassNotFoundException occured.");
			e.printStackTrace();
		}
		return null;
	} 
	
	
}